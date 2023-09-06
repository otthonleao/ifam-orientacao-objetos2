package dev.otthon.ifam.Escola.controller;

import java.util.ArrayList;
import java.util.List;

import dev.otthon.ifam.Escola.model.Departamento;
import dev.otthon.ifam.Escola.view.DepartamentoAction;

public class DepartamentoController {
	
	List<Departamento> departamentos = new ArrayList<>();
	
	DepartamentoAction departamentoInterface = new DepartamentoAction();
	
	public void cadastrarDepartamento() {
			departamentos.add(departamentoInterface.cadastrarDepartamento());
			System.out.printf("\nTotal de Departamentos: %d\n", departamentos.size());
	}

	public void visualizarDepartamento() {
		for(Departamento departamento:departamentos) {
			System.out.printf("Sigla: %s\t", departamento.getSigla());
			System.out.printf("Nome: %s\t", departamento.getNome());
			System.out.printf("Campus: %s\n", departamento.getCampi());
		}
	}

}
