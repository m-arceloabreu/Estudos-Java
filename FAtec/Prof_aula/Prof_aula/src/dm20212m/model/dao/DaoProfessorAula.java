
package dm20212m.model.dao;

import dm20212m.model.bean.ProfessorAula;
import dm20212m.util.ConexaoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DaoProfessorAula {
    
    private final Connection c;
   
    public DaoProfessorAula() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();
    }

    public ProfessorAula inserir (ProfessorAula p) throws SQLException {
        
        String sql = "insert into ppr_pespet" + " (ppr_idPes,ppr_idPet,ppr_obs)" + " values (?,?,?)";

        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            // seta os valores
            stmt.setInt(1,p.getIdPro());
            stmt.setInt(2,p.getIdAula());
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
    
    public ProfessorAula buscar (ProfessorAula p) throws SQLException {
        String sql = "select * from ppr_pespet WHERE ppr_id = ?";
        ProfessorAula retorno;
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,p.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
                // criando o objeto Usuario
                retorno = new ProfessorAula(
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

    public List<ProfessorAula> listar (ProfessorAula p) throws SQLException {
         // usus: array armazena a lista de registros
        List<ProfessorAula> listaP = new ArrayList<>();
       
        String sql = "select * from ppr_pespet where ppr_obs like ?";
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,"%" + p.getObs()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                ProfessorAula pSaida = new ProfessorAula(
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

    public ProfessorAula alterar (ProfessorAula p) throws SQLException {
        String sql = "UPDATE ppr_pespet SET ppr_idPro = ?, ppr_idAula = ?, ppr_obs = ? WHERE ppr_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,p.getIdPro());
            stmt.setInt(2,p.getIdAula());
            stmt.setString(3,p.getObs());
            stmt.setInt(4,p.getId());
            // executa
            stmt.execute();
        }
        return p;

    }

    public ProfessorAula excluir (ProfessorAula p) throws SQLException {
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
