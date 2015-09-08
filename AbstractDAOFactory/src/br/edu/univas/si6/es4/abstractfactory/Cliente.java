package br.edu.univas.si6.es4.abstractfactory;

public class Cliente {

	private String nome;

	public Cliente() {
	}

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente: " + nome;
	}

}
