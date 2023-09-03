package dev.otthon.ifam.Escola.view;

import java.util.Scanner;

import dev.otthon.ifam.Escola.model.Aluno;

public class AlunoInterfaceCadastro {
	
	public Aluno cadastrarAluno() {
		
		Aluno aluno = new Aluno();
		
		Scanner e = new Scanner(System.in);
		Scanner eNomeAluno = new Scanner(System.in);
		
		System.out.printf("Infome a matrícula do aluno: ");
		aluno.setMatricula(e.next());
		
		System.out.printf("Informe o nome do aluno: ");
		aluno.setNome(eNomeAluno.nextLine());
		
		System.out.println("\nALUNO CADASTRADO COM SUCESSO");
		
		return aluno;
	}
}
