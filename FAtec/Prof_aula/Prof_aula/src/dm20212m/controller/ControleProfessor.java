/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.controller;

import dm20212m.model.bean.Professor;
import dm20212m.model.dao.DaoProfessor;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author User
 */
public class ControleProfessor {

    static DaoProfessor daoP;
    
    public ControleProfessor () throws SQLException, ClassNotFoundException {
        daoP = new DaoProfessor();
    }

    public Professor inserir(Professor p) throws SQLException {
        return daoP.inserir(p);
    }

    public List<Professor> listar(Professor p) throws SQLException {
        return daoP.listar(p);
    }

    public Professor buscar(Professor p) throws SQLException {
        return daoP.buscar(p);
    }

    public Professor alterar(Professor p) throws SQLException {
        return daoP.alterar(p);
    }
    
    public Professor excluir(Professor p) throws SQLException {
        return daoP.excluir(p);
    }
    
}
