package dev.otthon.ifam.Escola.view;

import java.util.Scanner;

import dev.otthon.ifam.Escola.controller.AlunoController;
import dev.otthon.ifam.Escola.controller.CampusController;
import dev.otthon.ifam.Escola.controller.CursoController;
import dev.otthon.ifam.Escola.controller.DepartamentoController;

public class MenuEscolaAction {
	
	public void mostrarMenu() {
		
		Scanner scanMenu = new Scanner(System.in);	
		
		int opcao = 0;
		
		AlunoController alunoController = new AlunoController();
		CursoController cursoController = new CursoController();
		DepartamentoController departamentoController = new DepartamentoController();
		CampusController campusController = new CampusController();
		
		do {
			
			System.out.println("\n================== MENU ====================");
			
			System.out.println("[ 1 ] Cadastrar um Aluno");
			System.out.println("[ 2 ] Listar Aluno\n");
			System.out.println("[ 3 ] Cadastrar um Curso");
			System.out.println("[ 4 ] Listar Curso\n");
			System.out.println("[ 5 ] Cadastrar Departamento");
			System.out.println("[ 6 ] Listar Departamento\n");
			System.out.println("[ 7 ] Cadastrar Campus");
			System.out.println("[ 8 ] Listar Campus\n");
			System.out.println("[ 9 ] Sair");
			
			System.out.println("============================================");
			System.out.println("Escolha uma Opção: ");
	
			opcao = scanMenu.nextInt();
			
			switch (opcao) {
			case 1: 
				System.out.println("\n+++++++++++   CADASTRAR ALUNO   +++++++++++");
				alunoController.cadastrarAluno();
				break;
			case 2:
				System.out.println("\n*****   LISTA DE ALUNOS CADASTRADOS   *****");
				alunoController.visualizarAluno();
				break;
			case 3:
				System.out.println("\n+++++++++++   CADASTRAR CURSO   +++++++++++");
				cursoController.cadastrarCurso();
				break;
			case 4:
				System.out.println("\n**********   LISTA DE CURSOS CADASTRADOS   **********");
				cursoController.visualizarCurso();
				break;
			case 5:
				System.out.println("\n++++++++   CADASTRAR DEPARTAMENTO   ++++++++");
				departamentoController.cadastrarDepartamento();
				break;
			case 6:
				System.out.println("\n*****   DEPARTAMENTOS CADASTRADOS   *****");
				departamentoController.visualizarDepartamento();
			    break;    
			case 7:
				System.out.println("\n+++++++++++   CADASTRAR CAMPUS   +++++++++++");
				campusController.cadastrarCampi();
			    break;
			case 8:
				System.out.println("\n*****   CAMPUS CADASTRADOS   *****");
				campusController.visualizarCampus();
			    break;
			case 9:
				System.out.printf("\n=-=-=-=-=-=-=-=  FECHANDO PROGRAMA  =-=-=-=-=-=-=-=\n");
				break;
            default:
            	System.out.printf("\nOpção inválida, Tente novamente\n");
            	break;
			}
		} while(opcao !=9);
		
		scanMenu.close();
	}
}
