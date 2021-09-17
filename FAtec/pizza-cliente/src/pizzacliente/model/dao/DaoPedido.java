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
import java.util.ArrayList;
import java.util.List;
import pizzacliente.model.bean.Pedido;
import pizzacliente.util.ConexaoDb;


/**
 *
 * @author marcelo
 */
public class DaoPedido {
    
    
    private final Connection c;
   
    public DaoPedido() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();
    }

    public Pedido inserir (Pedido p) throws SQLException {
        
        String sql = "insert into ped_pedido" + " (ped_idCli,ped_sabor,ped_tamanho,ped_borda,ped_saborborda)" + " values (?,?,?,?,?)";

        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            // seta os valores
            stmt.setInt(1,p.getIdCli());
            stmt.setString(2,p.getSabor());
            stmt.setString(3,p.getTamanho());
            stmt.setString(4,p.getBorda());
            stmt.setString(5,p.getSaborBorda());
            // executa
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                p.setId(id);
            }
        }
        c.close();
        return p;
    }
    
    public Pedido buscar (Pedido p) throws SQLException {
        String sql = "select * from ped_pedido WHERE ped_id = ?";
        
        Pedido retorno;
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,p.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
                // criando o objeto Usuario
                retorno = new Pedido(
                        rs.getInt(1),
                        rs.getInt(2),
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

    public List<Pedido> listar (Pedido p) throws SQLException {
         // usus: array armazena a lista de registros
        List<Pedido> listaPed = new ArrayList<>();
       
        String sql = "select * from ped_pedido where ped_sabor like ?";
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,"%" + p.getSabor()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                Pedido pSaida = new Pedido(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
                
                // adiciona o usu à lista de usus
                listaPed.add(pSaida);
            }
            
            rs.close();
        }
        return listaPed;
    }

    public Pedido alterar (Pedido p) throws SQLException {
        String sql = "UPDATE ped+pedido SET ped_idCli = ?, ped_sabor = ?, ped_tamanho = ?,ped_borda = ?,ped_borda = ?, ped_saborborda = ? WHERE ped_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,p.getIdCli());
            stmt.setString(2,p.getSabor());
            stmt.setString(3,p.getTamanho());
            stmt.setString(4,p.getBorda());
            stmt.setString(5,p.getSaborBorda());
            stmt.setInt(6,p.getId());
            // executa
            stmt.execute();
        }
        return p;

    }

    public Pedido excluir (Pedido p) throws SQLException {
         String sql = "delete from ped_pedido WHERE ped_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,p.getId());
            // executa
            stmt.execute();
        }
        c.close();
        return p;
    }
}

