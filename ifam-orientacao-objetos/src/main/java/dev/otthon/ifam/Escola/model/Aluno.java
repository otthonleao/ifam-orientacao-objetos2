package dev.otthon.ifam.Escola.model;

public class Aluno {
	
	private String matricula;
	private String nome;
	private Curso curso;
	
	public Aluno() {
	}
	
	public Aluno(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
}
