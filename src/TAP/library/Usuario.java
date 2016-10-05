package TAP.library;

import java.util.ArrayList;

public class Usuario {

	private int matricula;
	private String nome;
	private String exemplarLocado;

	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getExemplarLocado() {
		return exemplarLocado;
	}

	public void setExemplarLocado(String exemplarLocado) {
		this.exemplarLocado = exemplarLocado;
	}
}

// TODO Criar a classe Biblioteca para gerenciar Livro, Exemplar e Usuários