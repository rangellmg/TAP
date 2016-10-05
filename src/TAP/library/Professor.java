package TAP.library;

import javax.swing.JOptionPane;

public class Professor extends Usuario {

	private String participaCurso;

	public String getParticipaCurso() {
		return participaCurso;
	}

	public void setParticipaCurso(String participaCurso) {
		this.participaCurso = participaCurso;
	}
	
	public void CadastrarProfessor(Professor cadastrar) {
		
		cadastrar.setNome(JOptionPane.showInputDialog("Nome: "));
		cadastrar.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Matrícula: ")));
		cadastrar.setParticipaCurso(JOptionPane.showInputDialog("Cursos que participa: "));
		cadastrar.setExemplarLocado(JOptionPane.showInputDialog("Exemplar locado: "));
		
		cadastros.add(cadastrar);
	}
}
