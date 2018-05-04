package src.dao;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import src.model.*;
import javax.swing.JOptionPane;

public class anteAnalistaDAO implements IDAO{

    @Override
    public void inserir(IPersistente obj) {
      anteAnalista ant = (anteAnalista) obj;
      String sql = "INSERT INTO SOLICITACAO(NUMERO,DATA_PAGAMENTO,DATA_SOLICITADA,CONDICAO) VALUES (?,?,?,?)";
      PreparedStatement stm;
      try{
          stm = ConexaoDAO.getConexaoDAO().prepareStatement(sql);
          stm.setInt(1, ant.getNumero());
          stm.setString(2, ant.getData_pagamento());
          stm.setString(3, ant.getSolicitar());
          stm.setString(4, ant.getStatus());
          stm.execute();
          ConexaoDAO.closeConexao();
      }catch(SQLException erro){
          JOptionPane.showMessageDialog(null, "Erro com a conexão ao SGBD" + erro);
      }
    }

    @Override
     public List<anteAnalista> pesquisar() {
        anteAnalista ant;
        String sql = "SELECT * FROM SOLICITACAO";
        PreparedStatement stm;
        try{
            stm = ConexaoDAO.getConexaoDAO().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            List<anteAnalista> anteLista = new ArrayList<>();
            while(rs.next()){
                ant = new anteAnalista();
                ant.setNumero(rs.getInt("NUMERO"));
                ant.setData_pagamento(rs.getString("DATA_PAGAMENTO"));
                ant.setSolicitar(rs.getString("DATA_SOLICITADA"));
                ant.getStatus();
                anteLista.add(ant);
            }
            return anteLista;
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao conectar com SGBD"+erro);
            return null;
        }
    }    

    @Override
    public void alterar(IPersistente obj) {
      anteAnalista ant = (anteAnalista) obj;
      String sql = "UPDATE NOTAFISCAL SET DATA_PAGAMENTO = ? WHERE NUMERO = ?";
      PreparedStatement stm;
      try{
          stm = ConexaoDAO.getConexaoDAO().prepareStatement(sql);
          stm.setInt(1, ant.getNumero());
          stm.setString(2, ant.getData_pagamento());
          stm.executeUpdate();
          ConexaoDAO.closeConexao();
      }catch(SQLException erro){
          JOptionPane.showMessageDialog(null, "Erro com a conexão ao SGBD" + erro);
      }
    }
}
