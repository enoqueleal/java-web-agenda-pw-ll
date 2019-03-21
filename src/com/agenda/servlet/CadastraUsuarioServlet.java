package com.agenda.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Pessoa;
import com.agenda.service.CadastraUsuarioService;

public class CadastraUsuarioServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	CadastraUsuarioService service;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome(request.getParameter("nome"));
		pessoa.setEmail(request.getParameter("email"));
		pessoa.setEndereco(request.getParameter("endereco"));
		pessoa.setTelefone(request.getParameter("telefone"));
		
		this.service = new CadastraUsuarioService();
		
		PrintWriter out = response.getWriter();

		try {
			this.service.adiciona(pessoa);
			
			out.println("<html>");
			out.println("<body>");
			out.println("Contato " + pessoa.getNome() + " cadastrado com sucesso!");
			out.println("</body>");
			out.println("</html>");
			
		} catch (Exception e) {
			out.println("<html>");
			out.println("<body>");
			out.println("Falha ao realizar o cadastro!");
			out.println("</body>");
			out.println("</html>");
		}
		
	}
	
}
