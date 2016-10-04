package TAP.library;

import javax.swing.JOptionPane;

public class Principal {

	public void menu() {
		
		int auxMenu = 1;
		
		while (auxMenu != 0) {
			
			int switchCase = Integer.parseInt(JOptionPane.showInputDialog("MENU\n\n1- Cadastrar Aluno"
																		  + "\n2- Cadastrar Professor"
																		  + "\n3- Cadastrar Livro"
																		  + "\n4- Cadastrar Exemplar"//Verificar se está correto
																		  + "\n5- Consultar Livro ou Exemplar"
																		  + "\n6- Consultar Professor ou Aluno"
																		  + "\n7- Locação de livros"
																		  + "\nDigite 0 para sair"));
			switch (switchCase) {
			
			case 0:
				auxMenu = 0;
				break;
				
			case 1:
				// TODO Cadastro de aluno
				break;
				
			case 2:
				// TODO Cadastro de professor
				break;
				
			case 3:
				// TODO Cadastro de livro
				break;
				
			case 4:
				// TODO Verificar se está correto
				break;
				
			case 5:
				// TODO Consultar livro ou exemplar
				break;
				
			case 6:
				// TODO Consultar alunos ou professores
				break;
				
			case 7:
				// TODO Locação de livros
				break;
				
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
	}

}