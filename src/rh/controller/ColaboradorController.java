package rh.controller;

import java.util.ArrayList;

import rh.model.Colaborador;
import rh.repository.ColaboradorRepository;

public class ColaboradorController implements ColaboradorRepository {

	private ArrayList<Colaborador> lista = new ArrayList<Colaborador>();

	@Override
	public Colaborador procurarPorId(int id) {

		for (var colaborador : lista) {
			if (colaborador.getId() == id)
				return colaborador;
		}

		return null;
	}

	@Override
	public void listarTodos() {
		for (var colaborador : lista) {
			colaborador.visualizar();
		}

	}

	@Override
	public void buscarPorId(int id) {
		var buscaColaborador = procurarPorId(id);

		if (buscaColaborador != null)
			buscaColaborador.visualizar();
		else
			System.out.println("Colaborador não foi encontrado!");
	}

	@Override
	public void cadastrar(Colaborador colaborador) {
		lista.add(colaborador);
		System.out.println("O Usuário foi cadastrado!");

	}

	@Override
	public void atualizar(Colaborador colaborador) {
		var buscaColaborador = procurarPorId(colaborador.getId());

		if (buscaColaborador != null) {
			lista.set(lista.indexOf(buscaColaborador), colaborador);
			System.out.println("Os  dados do Colaborador foram atializados!");
		}else
			System.out.println("Colaborador não foi encontrado!");

	}

	@Override
	public void deletar(int id) {
		var buscaColaborador = procurarPorId(id);

		if (buscaColaborador != null)
			if(lista.remove(buscaColaborador) == true)
				System.out.println("Colaborador foi excluído!");
		else
			System.out.println("Colaborador não foi encontrado!");

	}

	public int gerarNumero() {
		return lista.size() + 1;
	}
}
