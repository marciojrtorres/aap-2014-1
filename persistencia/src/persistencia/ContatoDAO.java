package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {

	public void salva(Contato c) throws ClassNotFoundException, SQLException {
		
		String url     = "jdbc:mysql://localhost/agenda";
		String usuario = "root";
		String senha   = "root";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = 
				DriverManager.getConnection(url, usuario, senha);
		
		String sql = "INSERT INTO contatos VALUES (DEFAULT, ?, ?, ?)";
		// ? é um placeholder para parametrizar
		
		PreparedStatement comando = con.prepareStatement(sql);
		
		comando.setString(1, c.getNome());
		comando.setString(2, c.getTelefone());
		comando.setString(3, c.getEmail());
		
		comando.execute();
		
		con.close();
		
	}

	public void exclui(int id) throws ClassNotFoundException, SQLException {
		
		String url     = "jdbc:mysql://localhost/agenda";
		String usuario = "root";
		String senha   = "root";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = 
				DriverManager.getConnection(url, usuario, senha);
		
		Statement comando = con.createStatement();
		
		comando.execute("DELETE FROM contatos WHERE id = " + id);
		
		con.close();
		
	}

	public Contato carrega(int id) throws ClassNotFoundException, SQLException {
		
		String url     = "jdbc:mysql://localhost/agenda";
		String usuario = "root";
		String senha   = "root";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = 
				DriverManager.getConnection(url, usuario, senha);
		
		Statement comando = con.createStatement();
		
		ResultSet rs = comando.executeQuery("SELECT * FROM contatos WHERE id = " + id);
		
		Contato contato = null;
		
		if (rs.next()) {
			contato = new Contato();
			contato.setId(rs.getInt("id"));
			contato.setNome(rs.getString("nome"));
			contato.setEmail(rs.getString("email"));
			contato.setTelefone(rs.getString("telefone"));
		}

		
		con.close();
		
		return contato;
	}

	public List<Contato> lista() throws ClassNotFoundException, SQLException {
		
		String url     = "jdbc:mysql://localhost/agenda";
		String usuario = "root";
		String senha   = "root";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = 
				DriverManager.getConnection(url, usuario, senha);
		
		Statement comando = con.createStatement();
		
		ResultSet rs = comando.executeQuery("SELECT * FROM contatos");
		
		List<Contato> contatos = new ArrayList<>();
		
		while (rs.next()) {
			Contato contato = new Contato();
			contato.setId(rs.getInt("id"));
			contato.setNome(rs.getString("nome"));
			contato.setEmail(rs.getString("email"));
			contato.setTelefone(rs.getString("telefone"));
			contatos.add(contato);
		}
		
		con.close();
		
		return contatos;
	}
	
}
