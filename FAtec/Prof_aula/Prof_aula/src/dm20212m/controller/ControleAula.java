package dm20212m.controller;

import dm20212m.model.bean.Aula;
import dm20212m.model.dao.DaoProfessor;
import dm20212m.model.dao.DaoAula;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ControleAula {

    static DaoAula daoAula ;
    
    public ControleAula () throws SQLException, ClassNotFoundException {
        daoAula = new DaoAula();
    }

    public Aula inserir(Aula p) throws SQLException {
        return daoAula.inserir(p);
    }

    public List<Aula> listar(Aula p) throws SQLException {
        return daoAula.listar(p);
    }

    public Aula buscar(Aula p) throws SQLException {
        return daoAula.buscar(p);
    }

    public Aula alterar(Aula p) throws SQLException {
        return daoAula.alterar(p);
    }
    
    public Aula excluir(Aula p) throws SQLException {
        return daoAula.excluir(p);
    }

    public ControleAula inserir(ControleAula aula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
