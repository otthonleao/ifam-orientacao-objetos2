package dev.otthon.ifam.Escola.view;

import java.util.Scanner;

import dev.otthon.ifam.Escola.model.Aluno;

public class AlunoAction {
	
	public Aluno cadastrarAluno() {
		
		Aluno aluno = new Aluno();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Infome a matrícula do aluno: ");
		aluno.setMatricula(scan.nextLine());
		
		System.out.printf("Informe o nome do aluno: ");
		aluno.setNome(scan.nextLine());
		
		System.out.println("\nALUNO CADASTRADO COM SUCESSO");
		
		return aluno;
	}
}
