
package dm20212m.controller;

import dm20212m.model.bean.Professor;
import dm20212m.model.bean.ProfessorAula;
import dm20212m.model.bean.Aula;
import dm20212m.model.dao.DaoProfessorAula;
import java.sql.SQLException;
import java.util.List;

public class ControleProfessorAula {
    
    static DaoProfessorAula paulaDao;
    static ControleProfessor cPr;
    static ControleAula cAu;
    
    public ProfessorAula inserir (ProfessorAula p) throws SQLException, ClassNotFoundException {
        paulaDao = new DaoProfessorAula();
        return paulaDao.inserir(p);
    }
    
    public ProfessorAula buscar (ProfessorAula p) throws SQLException, ClassNotFoundException {
        paulaDao = new DaoProfessorAula();
        return paulaDao.buscar(p);
    }

    public List<ProfessorAula> listar (ProfessorAula p) throws SQLException, ClassNotFoundException {
        paulaDao = new DaoProfessorAula();
        List<ProfessorAula> listaPP = paulaDao.listar(p);
        for (ProfessorAula listaPP2 : listaPP) {
            cPr = new ControleProfessor();
            cAu = new ControleAula();
            Professor proEntrada = new proEntrada (listaPP2.getIdPro());
            Aula aulaEntrada = new Aula(listaPP2.getIdAula());
            Professor proSaida = cPr.buscar(proEntrada);
            Aula aulaSaida = cAu.buscar(aulaEntrada);
            listaPP2.setPro(proSaida);
            listaPP2.setAula(aulaSaida);
        }
        return listaPP;
    }

    public ProfessorAula alterar (ProfessorAula p) throws SQLException, ClassNotFoundException {
        paulaDao = new DaoProfessorAula();
        return paulaDao.alterar(p);
    }

    public ProfessorAula excluir (ProfessorAula p) throws SQLException, ClassNotFoundException {
        paulaDao = new DaoProfessorAula();
        return paulaDao.excluir(p);
    }
}