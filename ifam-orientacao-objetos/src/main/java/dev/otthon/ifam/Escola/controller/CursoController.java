package dev.otthon.ifam.Escola.controller;

import java.util.ArrayList;
import java.util.List;

import dev.otthon.ifam.Escola.model.Curso;
import dev.otthon.ifam.Escola.view.CursoInterfaceCadastro;

public class CursoController {
	
	List<Curso> cursos = new ArrayList<>();
	
	CursoInterfaceCadastro cic = new CursoInterfaceCadastro();
	
	public void cadastrarCurso() {
		cursos.add(cic.cadastrarCurso());
		System.out.printf("Total de cursos: %d\n", cursos.size());
	}
	
	public void visualizarCurso() {
		for(Curso curso:cursos) {
			System.out.printf("Nome: %s\t", curso.getNome());
			System.out.printf("Sigla: %s\t", curso.getSigla());
			System.out.printf("Duração: %dh\n", curso.getDuracao());
		}
	}
}