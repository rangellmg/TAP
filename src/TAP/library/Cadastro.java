package TAP.library;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cadastro {

	private int matricula;
	private String nome;
	private String exemplarLocado;
        
        ArrayList cadastros = new ArrayList();
	
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
