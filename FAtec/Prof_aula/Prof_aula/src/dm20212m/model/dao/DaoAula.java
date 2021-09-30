
package dm20212m.model.dao;

import dm20212m.model.bean.Aula;
import dm20212m.util.ConexaoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoAula {
    
    private final Connection c;
   
    public DaoAula() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();
    }

    public Aula inserir (Aula p) throws SQLException {
        
        String sql = "insert into aula_aula" + " (aula_nome,aula_tipo,aula_materi)" + " values (?,?,?)";

        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            // seta os valores
            stmt.setString(1,p.getNome());
            stmt.setString(2,p.getTipo());
            stmt.setString(3,p.getMateria());
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
    
    public Aula buscar (Aula p) throws SQLException {
        String sql = "select * from aula_aula WHERE aula_id = ?";
        Aula retorno;
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,p.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
                // criando o objeto Usuario
                retorno = new Aula(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                // adiciona o usu à lista de aula
            }
        }
        c.close();
        return retorno;
    }

    public List<Aula> listar (Aula p) throws SQLException {
         // usus: array armazena a lista de registros
        List<Aula> listaP = new ArrayList<>();
       
        String sql = "select * from aula_aula where aula_nome like ?";
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,"%" + p.getNome()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                Aula pSaida = new Aula(
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

    public Aula alterar (Aula p) throws SQLException {
        String sql = "UPDATE aula_aula SET aula_nome = ?, aula_tipo = ?, aula_materia = ? WHERE aula_id = ?";
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

    public Aula excluir (Aula p) throws SQLException {
         String sql = "delete from aula_aula WHERE aula_id = ?";
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
