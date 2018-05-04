package src.dao;
import java.sql.*;
import java.util.List;
import src.model.*;
import javax.swing.JOptionPane;

public class AnalistaDAO implements IDAO{
    
    @Override
    public void inserir(IPersistente obj){
        Analista an = (Analista) obj;
        String sql = "INSERT INTO NOTAFISCAL (NUMERO,DESCRICAO,DATA_FATURAMENTO,DATA_PAGAMENTO,CONDICAO) VALUES(?,?,?,?,?)";
        PreparedStatement stm;
        try{
            stm = ConexaoDAO.getConexaoDAO().prepareStatement(sql);
            stm.setInt(1, an.getNumero());
            stm.setString(2, an.getDescricao());
            stm.setString(3, an.getData_fatura());
            stm.setString(4, an.getData_pagamento());
            stm.setString(5, an.getStatus());
            stm.execute();
            ConexaoDAO.closeConexao();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro com a conexão do SGBD" +erro);            
        }
    }    
    
    @Override
    public List<anteAnalista> pesquisar() {
        return null;    
    }

    @Override
    public void alterar(IPersistente obj) {
      anteAnalista ant = (anteAnalista) obj;
      String sql = "UPDATE NOTAFISCAL SET DATA_PAGAMENTO = ?, CONDICAO = ? WHERE NUMERO = ?";
      PreparedStatement stm;
      try{
          stm = ConexaoDAO.getConexaoDAO().prepareStatement(sql);          
          stm.setString(1, ant.getData_pagamento());
          stm.setString(2, ant.getStatus());
          stm.setInt(1, ant.getNumero());
          stm.executeUpdate();
          ConexaoDAO.closeConexao();
      }catch(SQLException erro){
          JOptionPane.showMessageDialog(null, "Erro com a conexão ao SGBD" + erro);
      }
    }
}
