package dev.otthon.ifam.Escola.controller;

import java.util.ArrayList;
import java.util.List;

import dev.otthon.ifam.Escola.model.Aluno;
import dev.otthon.ifam.Escola.view.AlunoInterfaceCadastro;

public class AlunoController {
	List<Aluno> alunos = new ArrayList<>();
	
	public void cadastrar() {
		AlunoInterfaceCadastro aic = new AlunoInterfaceCadastro();
		alunos.add(aic.cadastrarAluno());
		System.out.printf("Total de alunos: %d\n", alunos.size());
	}
	
	public void visualizar() {
		for(Aluno aluno:alunos) {
			System.out.printf("Matrícula: %s\t", aluno.getMatricula());
			System.out.printf("Nome: %s\n", aluno.getNome());
		}
	}
}
