package br.com.agenda.aplicacao;
import java.util.Date;
import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

//MVC
/*
 * MODEL
 * VIEW
 * CONTROLLER
 */

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDao= new ContatoDAO();

		//Adicionando o contato
		Contato contato = new Contato();
		contato.setNome("Maria Santos");
		contato.setIdade(62);
		contato.setDataCadastro(new Date());
		
		//contatoDao.save(contato);
		
		//Atualizar o contato.
		Contato c1 = new Contato();
		c1.setNome("Pedro Manoel");
		c1.setIdade(33);
		c1.setDataCadastro(new Date());
		c1.setId(1);// � o n�mero que est� no banco de dados da PK
		
		contatoDao.update(c1);
		
		//Deletar o contato pelo seu n�mero de ID
		//contatoDao.deleteByID(1);
		
		//Visualiza��o dos registros do bando de dados TODOS
			for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contatos: " + c.getNome());
		}
	}

}
