package com.agenda.service;

import com.agenda.dao.PessoaDAO;
import com.agenda.model.Pessoa;

public class CadastraUsuarioService {

	public void cadastra(Pessoa pessoa) {
		PessoaDAO dao = new PessoaDAO();
		dao.cadastra(pessoa);
	}

}
