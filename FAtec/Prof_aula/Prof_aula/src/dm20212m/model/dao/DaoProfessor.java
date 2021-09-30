
package dm20212m.model.dao;

import dm20212m.model.bean.Professor;
import dm20212m.util.ConexaoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoProfessor {
    
    private final Connection c;
    
    public DaoProfessor() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();
    }
    
     public Professor inserir (Professor p) throws SQLException {
        
        String sql = "insert into pro_professor" + " (pro_nome,pro_classificacao,pro_materia,pro_area)" + " values (?,?,?,?,?)";

        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            // seta os valores
            stmt.setString(1,p.getNome());
            stmt.setString(2,p.getClassificacao());
            stmt.setString(3,p.getMateria());
            stmt.setString(4,p.getArea());

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
    
    public Professor buscar (Professor p) throws SQLException {
        String sql = "select * from pro_professor WHERE pro_id = ?";
        Professor retorno;
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,p.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
                // criando o objeto Usuario
                retorno = new Professor(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
                // adiciona o usu à lista de professor
            }
        }
        c.close();
        return retorno;
    }

    public List<Professor> listar (Professor p) throws SQLException {
         // usus: array armazena a lista de registros
        List<Professor> listaP = new ArrayList<>();
       
        String sql = "select * from pro_professor where pro_nome like ?";
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,"%" + p.getNome()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                Professor pSaida = new Professor(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
                // adiciona o usu à lista de usus
                listaP.add(pSaida);
            }
            
            rs.close();
        }
        return listaP;
    }

    public Professor alterar (Professor p) throws SQLException {
        String sql = "UPDATE pro_professor SET pro_nome = ?, pro_classificacao = ?, pro_materia = ?, pro_area = ? WHERE pes_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,p.getNome());
            stmt.setString(2,p.getClassificacao());
            stmt.setString(3,p.getMateria());
            stmt.setString(4,p.getArea());
            stmt.setInt(6,p.getId());
            // executa
            stmt.execute();
        }
        return p;

    }

    public Professor excluir (Professor p) throws SQLException {
         String sql = "delete from pro_professor WHERE pes_id = ?";
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
