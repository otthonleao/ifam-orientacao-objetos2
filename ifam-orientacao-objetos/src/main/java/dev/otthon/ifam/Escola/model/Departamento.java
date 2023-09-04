package dev.otthon.ifam.Escola.model;

public class Departamento {
	
	private String sigla;
	private String nome;
	private Campi campi;
	
	public Departamento() {
	}
	
	public Departamento(String sigla, String nome, Campi campi) {
		this.sigla = sigla;
		this.nome = nome;
		this.campi = campi;
	}
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Campi getCampus() {
		return campi;
	}
	public void setCampus(Campi campi) {
		this.campi = campi;
	}
}
