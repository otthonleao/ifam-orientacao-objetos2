package dev.otthon.ifam.Escola.model;

public class Curso {
	
	private String nome;
	private String sigla;
	private int duracao;
	private Departamento departamento;
	
	public Curso() {
	}
	
	public Curso(String nome, String sigla, int duracao) {
		this.nome = nome;
		this.sigla = sigla;
		this.duracao = duracao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
}
