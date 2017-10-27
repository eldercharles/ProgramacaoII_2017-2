
package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
     
      private static final String URL_BANCO = "jdbc:postgresql://localhost:5432/progii_bd";
      private static String USUARIO = "postgres";//user
      private static String SENHA = "postgres";//estacio@123
      
      private static String status = "Não conectado ...";
          
      public static Connection criarConexao() {
          Connection conexao = null;
          
          try {
          conexao = DriverManager.getConnection(URL_BANCO , USUARIO, SENHA);
       }  catch (SQLException ex) {
           ex.printStackTrace();
       }
          
        if (conexao != null)
            status = "CONECTADO!!!";
        else 
            status = "CONECTADO!!!";
          
          return conexao;
      }
      
           
      public String getStatus() {
          return status;
      }
      
      
}

