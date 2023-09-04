package dev.otthon.ifam.Escola.controller;

import java.util.ArrayList;
import java.util.List;

import dev.otthon.ifam.Escola.model.Campi;
import dev.otthon.ifam.Escola.model.Departamento;
import dev.otthon.ifam.Escola.view.CampiInterfaceCadastro;

public class CampiController {
	
	List<Campi> campus = new ArrayList<>();
	
	CampiInterfaceCadastro campiInterface = new CampiInterfaceCadastro();

	public void cadastrarCampi() {
		campus.add(campiInterface.cadastrarCampi());
		System.out.println("CAMPI ADICIONADO COM SUCESSO!");
		System.out.printf("\nTotal de Campus: %d\n", campus.size());
	}

	public void visualizarCampus() {
		for(Campi campi:campus) {
			System.out.printf("Sigla: %s\t", campi.getSigla());
			System.out.printf("Nome: %s\t", campi.getNome());
			System.out.printf("Campus: %s\n", campi.getCidade());
			System.out.printf("Campus: %s\n", campi.getBairro());
		}
		
	}

}
