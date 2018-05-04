package src.dao;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    private static Connection con = null;
    private static String url = "jdbc:mysql://localhost:3306/mysql";
    private static String login = "root";
    private static String senha = "Ensino";
    
    public static Connection getConexaoDAO(){
        if(con==null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url,login,senha);
            }catch(ClassNotFoundException erro){
                JOptionPane.showMessageDialog(null, "O driver não foi localixado, veja as configurações");
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null, "Problemas com a conexão com SGBD");
            }
        }
        return con;
    }
    
    public static Statement getStatement(){
        Statement stm = null;
        try{
            stm = getConexaoDAO().createStatement();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Problema de conexão com SGBD");
        }
        return stm;
    }
    
    public static void closeConexao(){
     try{
         if(con != null){
             con.close();
             con = null;
         }
     }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Problema de conexão com SGBD");
        }  
    }    
}
