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
import pizzacliente.model.bean.ClientePedido;
import pizzacliente.util.ConexaoDb;

/**
 *
 * @author marcelo
 */
public class DaoClientePedido {
    private final Connection c;
   
    public DaoClientePedido() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();
    }

    public ClientePedido inserir (ClientePedido cp) throws SQLException {
        
        String sql = "insert into cp_clientepedido" + " (cp_idCli,cp_idPed,cp_servir,cp_paga)" + " values (?,?,?,?)";

        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            // seta os valores
            stmt.setInt(1,cp.getIdCli());
            stmt.setInt(2,cp.getIdPed());
            stmt.setString(3,cp.getServir());
            stmt.setString(4,cp.getPaga());
            // executa
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                cp.setId(id);
            }
        }
        c.close();
        return cp;
    }
    
    public ClientePedido buscar (ClientePedido cp) throws SQLException {
        String sql = "select * from cp_clientepedido WHERE cp_id = ?";
        ClientePedido retorno;
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,cp.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
                // criando o objeto Usuario
                retorno = new ClientePedido(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5));
                // adiciona o usu à lista de pessoa
            }
        }
        c.close();
        return retorno;
    }

    public List<ClientePedido> listar (ClientePedido cp) throws SQLException {
         // usus: array armazena a lista de registros
        List<ClientePedido> listaCp = new ArrayList<>();
       
        String sql = "select * from cp_clientepedido where cp_servir like ?";
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,"%" + cp.getServir()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                ClientePedido cpSaida = new ClientePedido(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5));
                // adiciona o usu à lista de usus
                listaCp.add(cpSaida);
            }
            
            rs.close();
        }
        return listaCp;
    }
//parei aqui
    public ClientePedido alterar (ClientePedido cp) throws SQLException {
        String sql = "UPDATE cp_clientepedido SET cp_idCli = ?, cp_idPed = ?, cp_servir = ?, cp_paga = ? WHERE cp_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,cp.getIdCli());
            stmt.setInt(2,cp.getIdPed());
            stmt.setString(3,cp.getServir());
            stmt.setString(4,cp.getPaga());
            stmt.setInt(5,cp.getId());
            // executa
            stmt.execute();
        }
        return cp;

    }

    public ClientePedido excluir (ClientePedido cp) throws SQLException {
         String sql = "delete from cp_clientepedido WHERE cp_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,cp.getId());
            // executa
            stmt.execute();
        }
        c.close();
        return cp;
    }
    
}
