package br.com.ideatech.comercial;

public class Veiculo {

    private String nome;
    private String sobreNome;
    private int idade;

    public static Veiculo cria(String nome) {
        return new Veiculo(nome);
    }

    private Veiculo(String nome) {
        this.nome = nome;
    }

    public Veiculo sobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
        return this;
    }

    public Veiculo idade(int idade) {
        this.idade = idade;
        return this;
    }

    @Override
    public String toString() {
        return "Veiculo nome=" + nome + sobreNome + " com idade de " + idade + " anos";
    }

}
