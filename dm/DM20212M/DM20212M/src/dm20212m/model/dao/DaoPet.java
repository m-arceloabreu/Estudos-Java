/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.model.dao;

import dm20212m.model.bean.Pet;
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
public class DaoPet {
    
    private final Connection c;
   
    public DaoPet() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();
    }

    public Pet inserir (Pet p) throws SQLException {
        
        String sql = "insert into pet_pet" + " (pet_nome,pet_tipo,pet_idade)" + " values (?,?,?)";

        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            // seta os valores
            stmt.setString(1,p.getNome());
            stmt.setString(2,p.getTipo());
            stmt.setString(3,p.getIdade());
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
    
    public Pet buscar (Pet p) throws SQLException {
        String sql = "select * from pet_pet WHERE pet_id = ?";
        Pet retorno;
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,p.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
                // criando o objeto Usuario
                retorno = new Pet(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                // adiciona o usu à lista de pessoa
            }
        }
        c.close();
        return retorno;
    }

    public List<Pet> listar (Pet p) throws SQLException {
         // usus: array armazena a lista de registros
        List<Pet> listaP = new ArrayList<>();
       
        String sql = "select * from pet_pet where pet_nome like ?";
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,"%" + p.getNome()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                Pet pSaida = new Pet(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                // adiciona o usu à lista de usus
                listaP.add(pSaida);
            }
            
            rs.close();
        }
        return listaP;
    }

    public Pet alterar (Pet p) throws SQLException {
        String sql = "UPDATE pet_pet SET pet_nome = ?, pet_tipo = ?, pet_idade = ? WHERE pet_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,p.getNome());
            stmt.setString(2,p.getTipo());
            stmt.setString(3,p.getIdade());
            stmt.setInt(4,p.getId());
            // executa
            stmt.execute();
        }
        return p;

    }

    public Pet excluir (Pet p) throws SQLException {
         String sql = "delete from pet_pet WHERE pet_id = ?";
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
