/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacliente.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pizzacliente.util.ConexaoDb;
import java.util.ArrayList;
import java.util.List;
import pizzacliente.model.bean.Pedido;

/**
 *
 * @author marcelo
 */
public class DaoPedido {
    
    private final Connection c;
    
    public DaoPedido() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();
    }
    
     public Pedido inserir (Pedido pe) throws SQLException {
        
        String sql = "insert into pedido_ped" + " (ped_sabor,ped_tamanho,ped_borda,ped_obs,ped_bebida)" + " values (?,?,?,?,?)";

        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            // seta os valores
            stmt.setString(1,pe.getSabor());
            stmt.setString(2,pe.getTamanho());
            stmt.setString(3,pe.getBorda());
            stmt.setString(4,pe.getObs());
            stmt.setString(5,pe.getBebida());
            
            // executa
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                pe.setId(id);
            }
        }
        c.close();
        return pe;
    }
    
    public Pedido buscar (Pedido pe) throws SQLException {
        String sql = "select * from pedido_ped WHERE ped_id = ?";
        Pedido retorno;
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,pe.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
                // criando o objeto Usuario
                retorno = new Pedido(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
                // adiciona o usu à lista de pessoa
            }
        }
        c.close();
        return retorno;
    }

    public List<Pedido> listar (Pedido pe) throws SQLException {
         // usus: array armazena a lista de registros
        List<Pedido> listaPe = new ArrayList<>();
       
        String sql = "select * from pedido_ped where ped_sabor like ?";
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,"%" + pe.getSabor()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                Pedido peSaida = new Pedido(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
                // adiciona o usu à lista de usus
                listaPe.add(peSaida);
            }
            
            rs.close();
        }
        return listaPe;
    }

    public Pedido alterar (Pedido pe) throws SQLException {
        String sql = "UPDATE pedido_ped SET ped_sabor = ?, ped_tamanho = ?, ped_borda = ?, ped_obs = ?, ped_bebida = ? WHERE ped_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,pe.getSabor());
            stmt.setString(2,pe.getTamanho());
            stmt.setString(3,pe.getBorda());
            stmt.setString(4,pe.getObs());
            stmt.setString(5,pe.getBebida());
            stmt.setInt(6,pe.getId());
            // executa
            stmt.execute();
        }
        return pe;

    }

    public Pedido excluir (Pedido pe) throws SQLException {
         String sql = "delete from pedido_ped WHERE ped_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,pe.getId());
            // executa
            stmt.execute();
        }
        c.close();
        return pe;
    }
}
