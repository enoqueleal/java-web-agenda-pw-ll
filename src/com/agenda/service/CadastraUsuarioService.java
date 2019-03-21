package com.agenda.service;

import com.agenda.dao.PessoaDAO;
import com.agenda.model.Pessoa;

public class CadastraUsuarioService {
	
	private PessoaDAO dao;

	public void adiciona(Pessoa pessoa) {
		this.dao = new PessoaDAO();
		this.dao.adiciona(pessoa);
	}
	
}
