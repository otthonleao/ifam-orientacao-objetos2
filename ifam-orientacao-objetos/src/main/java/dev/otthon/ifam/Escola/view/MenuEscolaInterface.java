package dev.otthon.ifam.Escola.view;

import java.util.Scanner;

import dev.otthon.ifam.Escola.controller.AlunoController;
import dev.otthon.ifam.Escola.controller.CampusController;
import dev.otthon.ifam.Escola.controller.CursoController;
import dev.otthon.ifam.Escola.controller.DepartamentoController;

public class MenuEscolaInterface {
	
	public void mostrarMenu() {
		
		Scanner opcaoMenu = new Scanner(System.in);	
		
		int opcao = 0;
		
		AlunoController alunoController = new AlunoController();
		CursoController cursoController = new CursoController();
		DepartamentoController departamentoController = new DepartamentoController();
		CampusController campusController = new CampusController();
		
		do{
			System.out.println("1. Cadastrar um Aluno");
			System.out.println("2. Listar Aluno");
			System.out.println("3. Cadastrar um Curso");
			System.out.println("4. Listar Curso");
			System.out.println("5. Cadastrar Departamento");
			System.out.println("6. Listar Departamento");
			System.out.println("7. Cadastrar Campus");
			System.out.println("8. Listar Campus");
			System.out.println("9. Sair");
			System.out.println("Escolha uma Opção: ");
	
			opcao = opcaoMenu.nextInt();
			
			switch (opcao) {
			case 1: 
				alunoController.cadastrarAluno();
				break;
			case 2:
				alunoController.visualizarAluno();
				break;
			case 3:
				cursoController.cadastrarCurso();
				break;
			case 4:
				cursoController.visualizarCurso();
				break;
			case 5:
				departamentoController.cadastrarDepartamento();
				break;
			case 6:
				departamentoController.visualizarDepartamento();
			    break;    
			case 7:
				campusController.cadastrarCampus();
			    break;
			case 8:
				campusController.visualizarCampus();
			    break;
			case 9:
				System.out.printf("\nFECHANDO PROGRAMA\n");
				break;
            default:
            	System.out.printf("\nOpção inválida, Tente novamente\n");
            	break;
			}
		} while(opcao !=9);
	}
}
