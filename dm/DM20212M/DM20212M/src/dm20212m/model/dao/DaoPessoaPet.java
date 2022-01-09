/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.model.dao;

import dm20212m.model.bean.PessoaPet;
import dm20212m.util.ConexaoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class DaoPessoaPet {
    
    private final Connection c;
   
    public DaoPessoaPet() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();
    }

    public PessoaPet inserir (PessoaPet p) throws SQLException {
        
        String sql = "insert into ppr_pespet" + " (ppr_idPes,ppr_idPet,ppr_obs)" + " values (?,?,?)";

        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            // seta os valores
            stmt.setInt(1,p.getIdPes());
            stmt.setInt(2,p.getIdPet());
            stmt.setString(3,p.getObs());
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
    
    public PessoaPet buscar (PessoaPet p) throws SQLException {
        String sql = "select * from ppr_pespet WHERE ppr_id = ?";
        PessoaPet retorno;
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,p.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
                // criando o objeto Usuario
                retorno = new PessoaPet(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4));
                // adiciona o usu à lista de pessoa
            }
        }
        c.close();
        return retorno;
    }

    public List<PessoaPet> listar (PessoaPet p) throws SQLException {
         // usus: array armazena a lista de registros
        List<PessoaPet> listaP = new ArrayList<>();
       
        String sql = "select * from ppr_pespet where ppr_obs like ?";
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,"%" + p.getObs()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                PessoaPet pSaida = new PessoaPet(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4));
                // adiciona o usu à lista de usus
                listaP.add(pSaida);
            }
            
            rs.close();
        }
        return listaP;
    }

    public PessoaPet alterar (PessoaPet p) throws SQLException {
        String sql = "UPDATE ppr_pespet SET ppr_idPes = ?, ppr_idPet = ?, ppr_obs = ? WHERE ppr_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,p.getIdPes());
            stmt.setInt(2,p.getIdPet());
            stmt.setString(3,p.getObs());
            stmt.setInt(4,p.getId());
            // executa
            stmt.execute();
        }
        return p;

    }

    public PessoaPet excluir (PessoaPet p) throws SQLException {
         String sql = "delete from ppr_pespet WHERE ppr_id = ?";
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
