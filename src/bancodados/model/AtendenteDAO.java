package bancodados.model;

import bancodados.connection.ConectionFactory;
import usuarios.Atendente;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AtendenteDAO {
    public void create(Atendente atendente){
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;

        try{
            stmt = con.prepareStatement("INSERT INTO atendentes (nome, cpf, usuario, senha) " +
                    "VALUES (?, ?, ?, ?, ?)");

            stmt.setString(1, atendente.getNome());
            stmt.setString(2, atendente.getCpf());
            stmt.setString(3, atendente.getUsuario());
            stmt.setString(4, atendente.getSenha());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        }catch (SQLException ex){
            System.out.println(ex);
        }finally {
            ConectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Atendente> read(){
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Atendente> atendenteList = new ArrayList();

        try{
            stmt = con.prepareStatement("SELECT * FROM atendentes");
            rs = stmt.executeQuery();

            while (rs.next()){
                Atendente novo = new Atendente();
                novo.setId(rs.getInt("_id"));
                novo.setNome(rs.getString("nome"));
                novo.setCpf(rs.getString("cpf"));
                novo.setUsuario(rs.getString("usuario"));
                novo.setSenha(rs.getString("senha"));
                
                atendenteList.add(novo);
            }
        }catch (SQLException ex){
            System.out.println(ex);
        }finally {
            ConectionFactory.closeConnection(con, stmt, rs);
        }
        return atendenteList;
    }

    public void delete(Atendente atendente){
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;

        try{
            stmt = con.prepareStatement("DELETE FROM atendentes WHERE _id = ?");
            stmt.setInt(1, atendente.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        }finally {
            ConectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean autenticar(String usuario, String senha){
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean confirm = false;
        
        try{
            stmt = con.prepareStatement("SELECT usuario, senha FROM atendentes"
                    + " WHERE usuario = ? and senha = ?");
           stmt.setString(1, usuario);
           stmt.setString(2, senha);
           rs = stmt.executeQuery();
           String usuario_confirma= "";
           String senha_confirma = ""; 
           if(rs != null && rs.next()){
                usuario_confirma = rs.getString("usuario");
                senha_confirma = rs.getString("senha");
           }
            confirm = (usuario_confirma.equals(usuario) && senha_confirma.equals(senha));
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao fazer a busca: " + ex);
        }finally{
            ConectionFactory.closeConnection(con, stmt, rs);
        }
        
        return confirm;
    }
}
