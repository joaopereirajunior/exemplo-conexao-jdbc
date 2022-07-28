package br.com.caelum.jdbc.teste;

import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteListarContato {

	public static void main(String[] args) {

		ContatoDao dao = new ContatoDao();

		List<Contato> contatoLista = dao.listarContatos();

		for (Contato lstContato : contatoLista) {
			
			Contato contato = new Contato();
			contato.setId(lstContato.getId());
			contato.setNome(lstContato.getNome());
			
			

			System.out.println("id: " + contato.getId() + " nome: " + contato.getNome());

		}

	}

}
