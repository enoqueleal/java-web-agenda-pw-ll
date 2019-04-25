package com.agenda.service;

import java.util.List;

import com.agenda.dao.PessoaDAO;
import com.agenda.model.Pessoa;

public class CadastraUsuarioService {
	
	private PessoaDAO dao;
	
	public CadastraUsuarioService() {
		this.dao = new PessoaDAO();
	}

	public void adiciona(Pessoa pessoa) {
		this.dao.adiciona(pessoa);
	}
	
	public List<Pessoa> buscaPessoas() {
		return this.dao.buscaPessoas();
	}
	
	public void remove(Pessoa pessoa) {
		this.dao.remove(pessoa);
	}
	
}
