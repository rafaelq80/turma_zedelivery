package rh.repository;

import rh.model.Colaborador;

public interface ColaboradorRepository {

	public Colaborador procurarPorId(int id);
	public void listarTodos();
	public void buscarPorId(int id);
	public void cadastrar(Colaborador colaborador);
	public void atualizar(Colaborador colaborador);
	public void deletar(int id);
	
}
