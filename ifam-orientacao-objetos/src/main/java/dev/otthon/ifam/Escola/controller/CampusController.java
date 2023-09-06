package dev.otthon.ifam.Escola.controller;

import java.util.ArrayList;
import java.util.List;

import dev.otthon.ifam.Escola.model.Campus;
import dev.otthon.ifam.Escola.view.CampusAction;

public class CampusController {
	
	List<Campus> campusLista = new ArrayList<>();
	
	CampusAction campiInterface = new CampusAction();

	public void cadastrarCampi() {
		campusLista.add(campiInterface.cadastrarCampi());
		System.out.printf("\nTotal de Campus cadastrados: %d\n", campusLista.size());
	}

	public void visualizarCampus() {
		for(Campus campus:campusLista) {
			System.out.printf("Sigla: %s\t", campus.getSigla());
			System.out.printf("Nome: %s\t", campus.getNome());
			System.out.printf("Bairro: %s\t", campus.getBairro());
			System.out.printf("Cidade: %s\n", campus.getCidade());

		}
		
	}

}
