package dev.otthon.ifam.Escola.view;

import java.util.Scanner;

import dev.otthon.ifam.Escola.controller.AlunoController;
import dev.otthon.ifam.Escola.controller.CursoController;

public class MenuEscolaInterface {
	public void mostrarMenu() {
		Scanner opcaoMenu = new Scanner(System.in);
		int opcao = 0;
		AlunoController alunoController = new AlunoController();
		CursoController cursoController = new CursoController();
		do {
			System.out.println("1 Cadastrar um aluno");
			System.out.println("2 Listar alunos");
			System.out.println("3 Cadastrar curso");
			System.out.println("4 Visualizar cursos");
			System.out.println("5 Sair");
			opcao = opcaoMenu.nextInt();
			
			switch(opcao) {
			case 1:
				alunoController.cadastrar();
				break;
			case 2:
				alunoController.visualizar();
				break;
			case 3:
				cursoController.cadastrar();
				break;
			case 4:
				cursoController.visualizar();
				break;
			}
		}while(opcao != 5);
	}
}
