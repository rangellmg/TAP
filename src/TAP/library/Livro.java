package TAP.library;

public class Livro {
	
	private final int MAX_EXEMPLAR = 5; // TODO Arrumar não existe limite de exemplar e sim de locação
	private Exemplar exemplares[] = new Exemplar[MAX_EXEMPLAR];
	
	private String titulo;
	private String nome;
	
	public Exemplar[] getExemplares() {
		return exemplares;
	}
	
	public void adicionarExemplar(Exemplar exemplar) {
		int contador = 0;
		boolean addExemplar = true;
		
		while(addExemplar && contador < MAX_EXEMPLAR) {
			if(exemplares[contador] == null) {
				exemplares[contador] = exemplar;
				addExemplar = false;
			}
			contador++;
		}
		if(contador == MAX_EXEMPLAR) {
			System.out.println("Número máximo de exemplares atingido.");
		}
	}
	
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
	
}
