package dev.otthon.ifam.Escola.view;

import java.util.Scanner;

import dev.otthon.ifam.Escola.model.Curso;

public class CursoInterfaceCadastro {
	
	public Curso cadastrarCurso() {
		Curso curso = new Curso();
		
		Scanner e = new Scanner(System.in);
		Scanner eNomeCurso = new Scanner(System.in);
		System.out.printf("Informe o nome do curso: ");
		curso.setNome(eNomeCurso.nextLine());
	
		System.out.printf("Informe a sigla do curso: ");
		curso.setSigla(e.next());

		System.out.printf("Informe a duração do curso: ");
		curso.setDuracao(e.nextInt());
		
		return curso;
	}
}
