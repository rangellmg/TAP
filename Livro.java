package TAP.library;

public class Livro {
	
	private final int MAX_EXEMPLAR = 5;
	private Exemplar exemplares[] = new Exemplar[MAX_EXEMPLAR];
	
	private String titulo;
	private String nome;
	private String exemplar;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getExemplar() {
		return exemplar;
	}

	public void setExemplar(String exemplar) {
		this.exemplar = exemplar;
	}
	
	
	
}
