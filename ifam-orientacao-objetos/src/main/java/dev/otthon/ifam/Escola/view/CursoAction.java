package dev.otthon.ifam.Escola.view;

import java.util.Scanner;

import dev.otthon.ifam.Escola.model.Curso;

public class CursoAction {
	
	public Curso cadastrarCurso() {
		
		Curso curso = new Curso();
		
		Scanner scan = new Scanner(System.in);
//		Scanner eNomeCurso = new Scanner(System.in);
		
		System.out.printf("Informe o nome do curso: ");
		curso.setNome(scan.nextLine());
	
		System.out.printf("Informe a sigla do curso: ");
		curso.setSigla(scan.nextLine());

		System.out.printf("Informe a duração do curso: ");
		curso.setDuracao(scan.nextInt());
		
		System.out.println("\nCURSO CADASTRADO COM SUCESSO!");
		
		return curso;
	}
}
