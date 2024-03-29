package dev.otthon.ifam.Escola.controller;

import java.util.ArrayList;
import java.util.List;

import dev.otthon.ifam.Escola.model.Aluno;
import dev.otthon.ifam.Escola.view.AlunoAction;

public class AlunoController {
	
	List<Aluno> alunos = new ArrayList<>();
	
	public void cadastrarAluno() {
		AlunoAction alunoInterface = new AlunoAction();
		alunos.add(alunoInterface.cadastrarAluno());
		System.out.printf("Total de alunos: %d\n", alunos.size());
	}
	
	public void visualizarAluno() {
		for(Aluno aluno:alunos) {
			System.out.printf("Matrícula: %s\t", aluno.getMatricula());
			System.out.printf("Nome: %s\t\n", aluno.getNome());
		}
	}
}
