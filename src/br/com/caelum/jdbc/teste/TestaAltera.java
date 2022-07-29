package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAltera {
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Caroline Rodrigues");
		contato.setEmail("carol@email");
		contato.setEndereco("rua maravilha");

		ContatoDao dao = new ContatoDao();

		dao.altera(contato);

	}

}
