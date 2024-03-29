package dev.otthon.ifam.Escola.model;

public class Departamento {
	
	private String sigla;
	private String nome;
	private Campus campus;
	
	public Departamento() {
	}
	
	public Departamento(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
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
	
	public Campus getCampi() {
		return campus;
	}
	public void setCampi(Campus campus) {
		this.campus = campus;
	}
}
