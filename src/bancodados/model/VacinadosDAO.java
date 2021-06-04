package bancodados.model;

import bancodados.connection.ConectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import usuarios.Vacinados;

public class VacinadosDAO {
    
    public void create(Vacinados vacinado){
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO vacinados"
                    + " (nome, idade, trabalho_saude, endereco, prioridade)"
                    + "VALUES (?, ?, ?, ?, ?)");
            
            stmt.setString(1, vacinado.getNome());
            stmt.setInt(2, vacinado.getIdade());
            stmt.setBoolean(3, vacinado.isTrabalho_saude());
            stmt.setString(4, vacinado.getEndereco());
//            stmt.setDate(5, new Date(vacinado.getData_vacinacao().getYear(),
//            vacinado.getData_vacinacao().getMonth().getValue(),
//                    vacinado.getData_vacinacao().getDayOfMonth()));
//            stmt.executeUpdate();
            stmt.setInt(5, vacinado.getPrioridade());
            
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
    
    public void update(Vacinados vacinado){
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("UPDATE vacinados SET "
                    + "data_vacinacao = ?, vacinado = ?  "
                    + "WHERE _id = ?");
            stmt.setDate(1, new Date(vacinado.getData_vacinacao().getYear() - 1900,
            vacinado.getData_vacinacao().getMonth().getValue() - 1,
            vacinado.getData_vacinacao().getDayOfMonth()));
            stmt.setBoolean(2, true);
            stmt.setInt(3, vacinado.getId());

            stmt.executeUpdate();            
            
            JOptionPane.showMessageDialog(null, "Registro feito!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Algo deu errado: " + ex);

        }finally{
            ConectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    public List<Vacinados> getVacinadosByPrioridade(int prioridade){
        List<Vacinados> listaVacinados = new ArrayList();
        
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement("SELECT * FROM vacinados WHERE prioridade = ?");
            stmt.setInt(1, prioridade);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Vacinados vac = new Vacinados();
                
                vac.setId(rs.getInt("_id"));
                vac.setNome(rs.getString("nome"));
                vac.setIdade(rs.getInt("idade"));
                vac.setEndereco(rs.getString("endereco"));
                vac.setPrioridade(rs.getInt("prioridade"));
                vac.setTrabalho_saude(rs.getBoolean("trabalho_saude"));
                vac.setData_vacinacao(rs.getDate("data_vacinacao").toLocalDate());
                vac.setVacinado(rs.getBoolean("vacinado"));
                
                listaVacinados.add(vac);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Algo deu errado: " + ex);            
        }finally{
            ConectionFactory.closeConnection(con, stmt, rs);
        }
        
        return listaVacinados;
    }
    
    public List<Vacinados> getVacinadosGroupPrioridade(){
        List<Vacinados> listaVacinados = new ArrayList();
        
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement("SELECT * FROM vacinados order by prioridade;");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Vacinados vac = new Vacinados();
                
                vac.setId(rs.getInt("_id"));
                vac.setNome(rs.getString("nome"));
                vac.setIdade(rs.getInt("idade"));
                vac.setEndereco(rs.getString("endereco"));
                vac.setPrioridade(rs.getInt("prioridade"));
                vac.setTrabalho_saude(rs.getBoolean("trabalho_saude"));
                vac.setVacinado(rs.getBoolean("vacinado"));
                
                listaVacinados.add(vac);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Algo deu errado: " + ex);            
        }finally{
            ConectionFactory.closeConnection(con, stmt, rs);
        }
        
        return listaVacinados;
    }

    public List<Vacinados> getVacinadosToDate(LocalDate inicio, LocalDate ate){
        List<Vacinados> vacinados = new ArrayList();
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement("SELECT * FROM vacinados WHERE vacinado = ? and data_vacinacao between ? and ?");
            stmt.setBoolean(1, true);
            stmt.setDate(2, new Date(inicio.getYear()-1900, inicio.getMonthValue()-1, inicio.getDayOfMonth()));
            stmt.setDate(3, new Date(ate.getYear()-1900, ate.getMonthValue()-1, ate.getDayOfMonth()));
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Vacinados vac = new Vacinados();
                
                vac.setId(rs.getInt("_id"));
                vac.setNome(rs.getString("nome"));
                vac.setIdade(rs.getInt("idade"));
                vac.setEndereco(rs.getString("endereco"));
                vac.setPrioridade(rs.getInt("prioridade"));
                vac.setTrabalho_saude(rs.getBoolean("trabalho_saude"));
                vac.setVacinado(rs.getBoolean("vacinado"));
                
                vacinados.add(vac);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Algo deu errado: " + ex);
        }finally{
            ConectionFactory.closeConnection(con, stmt, rs);
        }
        
        return vacinados;
    }
}
