package persistencia;

import java.sql.*;

public class Principal {
	public static void main(String[] args) throws Exception {

		String url     = "jdbc:mysql://localhost/agenda";
		String usuario = "root";
		String senha   = "root";
		
		// o necessario esta em:
		// java.sql.*
		// javax.sql.* // nao eh necessario
		
		// JDBC Java DataBase Connectivity
		// registrar o driver do banco:
		Class.forName("com.mysql.jdbc.Driver");
		
		// para conectar:
		Connection con = 
				DriverManager.getConnection(url, usuario, senha);
		
		// criar um comando:
		Statement comando = con.createStatement();
		
		comando.execute("DELETE from contatos");
		// executar uma instrução:
		comando.execute("INSERT INTO contatos VALUES ('testenome','99999999','testeemail')");
		
		comando.execute("INSERT INTO contatos VALUES ('bilhalva','22234455','bi@lhalva.com')");
		
		// fechar conexão:
		con.close();
		
		System.out.println("OK");
		
	}
}
