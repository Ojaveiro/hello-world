package br.com.ideatech.comercial;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public abstract class AbstractVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Obtem a descrição do VO em uma String. Todos os atributos e respectivos
     * valores são mostrados.
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {

        Class<?> cl = this.getClass();
        StringBuffer resultBuffer = new StringBuffer();

        // Obtem campos
        ArrayList<Field> fieldsList = new ArrayList<Field>();
        Field[] declaredFields = cl.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            fieldsList.add(declaredFields[i]);
        }

        // get superclass fields
        fieldsList.addAll(getSuperFields(cl));

        resultBuffer.append(getClassName(cl));
        resultBuffer.append(" {");

        Iterator<Field> iterator = fieldsList.iterator();
        try {
            while (iterator.hasNext()) {
                StringBuffer tempBuffer = new StringBuffer();

                Field f = (Field) iterator.next();
                f.setAccessible(true);
                if (!Modifier.isStatic(f.getModifiers())) {
                    tempBuffer.append('(');
                    tempBuffer.append(f.getName());
                    tempBuffer.append('=');

                    Object value = null;
                    try {
                        value = f.get(this);
                    } catch (IllegalAccessException e) {
                        value = e.toString();
                    }

                    if (value != null) {
                        // Object Collection
                        if (value instanceof Collection || value instanceof Map) {
                            Collection<?> collection = null;
                            if (Map.class.isInstance(value)) {
                                collection = ((Map<?, ?>) value).values();
                            } else {
                                collection = (Collection<?>) value;
                            }

                            // iterate over values
                            Iterator<?> myIterator = collection.iterator();
                            tempBuffer.append("[");
                            while (myIterator.hasNext()) {
                                Object o = myIterator.next();
                                if (o != null) {
                                    if (o instanceof AbstractVO) {
                                        tempBuffer.append("\n - ");
                                    }
                                    tempBuffer.append(o.toString());
                                    if (myIterator.hasNext()) {
                                        tempBuffer.append(", ");
                                    }
                                } else {
                                    tempBuffer.append("null; ");
                                }
                            }
                            tempBuffer.append("]");

                        } else if (value instanceof AbstractVO) {
                            tempBuffer.append("\n - ");
                            tempBuffer.append(value.toString());
                        } else {
                            tempBuffer.append(value.toString());
                        }

                        if (value instanceof byte[]) {
                            byte[] array = (byte[]) value;
                            tempBuffer.append("byte[" + array.length + "]= ");
                            int n = 5;
                            if (array.length < 5)
                                n = array.length;
                            for (int j = 0; j < n; j++)
                                tempBuffer.append(array[j] + " ");
                            tempBuffer.append("...");
                        }

                    } else { // Value is null
                        tempBuffer.append("null");
                    }
                    tempBuffer.append(", ");
                    resultBuffer.append(tempBuffer.append(')'));
                }
            }
        } catch (SecurityException e) {
            System.err.println("Erro ao acessar valores para o VO " + getClass().getName());
            e.printStackTrace();
        }
        return resultBuffer.toString();
    }

    /**
     * Obtem os campos da superclasse da classe dada.
     * 
     * @param clazz
     *            Classe filha.
     * @return ArrayList com os campos.
     */
    private static ArrayList<Field> getSuperFields(Class<?> clazz) {
        ArrayList<Field> fieldsList = new ArrayList<Field>();
        // Get superclass fields
        Class<?> supercl = clazz.getSuperclass();
        if (supercl != Object.class) {
            Field[] fields = supercl.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                fieldsList.add(fields[i]);
            }
            fieldsList.addAll(getSuperFields(supercl));
        }

        return (fieldsList);
    }

    /**
     * Obtem o nome da classe dada. O nome retornado contem apenas o nome da
     * classe, sem o pacote.
     * 
     * @return String
     */
    private static String getClassName(Class<?> classObj) {
        String name = classObj.getName();

        int i = name.lastIndexOf('.');
        if (i != -1) {
            name = name.substring(i + 1);
        }

        return name;
    }

}
