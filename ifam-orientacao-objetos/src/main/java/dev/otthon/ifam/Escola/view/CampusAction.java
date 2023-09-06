package dev.otthon.ifam.Escola.view;

import java.util.Scanner;

import dev.otthon.ifam.Escola.model.Campus;

public class CampusAction {

	public Campus cadastrarCampi() {
		
		Campus campus = new Campus();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a sigla do Campus: ");
		campus.setSigla(scan.nextLine());
		
		System.out.println("Insira o nome do Campus: ");
		campus.setNome(scan.nextLine());
		
		System.out.println("Insira o Bairro do Campus: ");
		campus.setBairro(scan.nextLine());
		
		System.out.println("Qual a cidade do Campus: ");
		campus.setCidade(scan.nextLine());
		
		System.out.println("\nCAMPUS CADASTRADO COM SUCESSO");
		
		return campus;
		
	}

}
