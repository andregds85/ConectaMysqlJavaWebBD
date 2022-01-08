import java.sql.*;

import java.sql.SQLException;

public class Conecta {

	public static Connection getConexao() throws
	SQLException{
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Conectado com Sucesso ao Banco dados empresa");
		
		
		return 
			
				
DriverManager.getConnection("jdbc:mysql://localhost/empresa","root","");

		}catch (Exception e) {
				throw new SQLException(e);
						
		}
		

	
		
	}
}

		
		
			
	
		
		
	
	
	

