package br.com.ideatech.comercial;

public class Pessoa {

	private String nome;
	private int idade;
	
	public void pegarNomeDaPessoa(String nome){
		this.nome = "O nome é " + nome;
		Pessoa p;
//		p.nome="";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
