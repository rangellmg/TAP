package TAP.library;

import javax.swing.JOptionPane;

public class Aluno extends Cadastro {

	private String curso;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
        public void CadastrarAluno(Aluno cadastrar){
            cadastrar.setNome(JOptionPane.showInputDialog("Nome:"));
            cadastrar.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Matricula:")));
            cadastrar.setCurso(JOptionPane.showInputDialog("Curso:"));
            
            cadastros.add(cadastrar);
        }
}
