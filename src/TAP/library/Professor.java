package TAP.library;

import javax.swing.JOptionPane;

public class Professor extends Cadastro {

	private String participaCurso;

	public String getParticipaCurso() {
		return participaCurso;
	}

	public void setParticipaCurso(String participaCurso) {
		this.participaCurso = participaCurso;
	}
	
        public void CadastrarProfessor(Professor cadastrar){
            cadastrar.setNome(JOptionPane.showInputDialog("Nome:"));
            cadastrar.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Matricula:")));
            cadastrar.setParticipaCurso(JOptionPane.showInputDialog("Curso que participa:"));
            
            cadastros.add(cadastrar);
        }
}
