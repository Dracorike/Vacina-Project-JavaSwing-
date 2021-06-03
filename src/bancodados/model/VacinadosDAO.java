/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.model;

import bancodados.connection.ConectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import usuarios.Vacinados;

/**
 *
 * @author pedro
 */
public class VacinadosDAO {
    
    public void create(Vacinados vacinado){
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO vacinados"
                    + " (nome, idade, trabalho_saude, endereco, data_vacinacao)"
                    + "VALUES (?, ?, ?, ?, ?)");
            
            stmt.setString(1, vacinado.getNome());
            stmt.setInt(2, vacinado.getIdade());
            stmt.setBoolean(3, vacinado.isTrabalho_saude());
            stmt.setString(4, vacinado.getEndereco());
            stmt.setDate(5, new Date(vacinado.getData_vacinacao().getYear(),
            vacinado.getData_vacinacao().getMonth().getValue(),
                    vacinado.getData_vacinacao().getDayOfMonth()));
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Vacinação cadastrada com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Houve o seguinte erro: " + ex);
        }finally{
            ConectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Vacinados> read(){
        List<Vacinados> listaVacinados = new ArrayList();
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement("SELECT * FROM vacinados");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Vacinados novo = new Vacinados();
                novo.setNome(rs.getString("nome"));
                novo.setIdade(rs.getInt("idade"));
                novo.setTrabalho_saude(rs.getBoolean("trabalho_saude"));
                novo.setEndereco(rs.getString("endereco"));
                novo.setData_vacinacao(rs.getDate("data_vacinacao").toLocalDate());
                
                listaVacinados.add(novo);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro: " + ex);
        }finally{
            ConectionFactory.closeConnection(con, stmt, rs);
        }
        
        return listaVacinados;
    }
    
    public void delete(Vacinados vacinado){
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM vacinados WHERE _id = ?");
            stmt.setInt(1, vacinado.getId());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro: " + ex);
        }
                
    }
}
