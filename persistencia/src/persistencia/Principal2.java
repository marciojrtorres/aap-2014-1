package persistencia;

import java.sql.SQLException;
import java.util.List;

public class Principal2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
				
		Contato c = new Contato();
		
		// SQL INJECTION:
		// as instruções sql são concatenadas (deve-se evitar)
		// solução: usar instruções parametrizadas
		
		c.setNome("Meu Contato");
		c.setTelefone("99887766");
		c.setEmail("meu@contato.net");
		
		// como salvar?
		// tradicionalmente
		// padrão de arquitetura: DAO
		// Data Access Object: Objeto de Acesso a Dados
		// Ex.: EntidadeDAO, neste caso: ContatoDAO
		
		ContatoDAO dao = new ContatoDAO();
		dao.salva(c);
		
		//dao.exclui(3);
		//dao.exclui(2);
		/*
		Contato c2 = dao.carrega(5); // seleciona, load, abre, ...
		
		if (c2 == null) System.out.println("nao existe 5");
		*/
		List<Contato> contatos = dao.lista();

		System.out.println(contatos);
		
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
		
		
		
	}

}
