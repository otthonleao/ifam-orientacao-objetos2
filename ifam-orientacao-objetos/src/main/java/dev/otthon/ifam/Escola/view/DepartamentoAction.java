package dev.otthon.ifam.Escola.view;

import java.util.Scanner;

import dev.otthon.ifam.Escola.model.Departamento;

public class DepartamentoAction {

	public Departamento cadastrarDepartamento() {
		
		Departamento departamento = new Departamento();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a sigla do Departamento: ");
		departamento.setSigla(scan.nextLine());
		
		System.out.println("Insira o nome do Departamento: ");
		departamento.setNome(scan.nextLine());
		
		System.out.println("\nDEPARTAMENTO CADASTRADO COM SUCESSO!");
		
		return departamento;
	}
}
