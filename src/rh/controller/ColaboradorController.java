package rh.controller;

import java.util.ArrayList;

import rh.model.Colaborador;
import rh.repository.ColaboradorRepository;

public class ColaboradorController implements ColaboradorRepository{

	private ArrayList<Colaborador> lista = new ArrayList<Colaborador>();
	
	@Override
	public Colaborador procurarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listarTodos() {
		for(var colaborador : lista) {
			colaborador.visualizar();
		}
		
	}

	@Override
	public void buscarPorId(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrar(Colaborador colaborador) {
		lista.add(colaborador);
		System.out.println("O Usuário foi cadastrado!");
		
	}

	@Override
	public void atualizar(Colaborador colaborador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int id) {
		// TODO Auto-generated method stub
		
	}

	public int gerarNumero() {
		return lista.size() + 1;
	}
}
