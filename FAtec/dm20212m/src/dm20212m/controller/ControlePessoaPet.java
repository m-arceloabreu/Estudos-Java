/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.controller;

import dm20212m.model.bean.Pessoa;
import dm20212m.model.bean.PessoaPet;
import dm20212m.model.bean.Pet;
import dm20212m.model.dao.DaoPessoaPet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author User
 */
public class ControlePessoaPet {
    
    static DaoPessoaPet ppetDao;
    static ControlePessoa cPe;
    static ControlePet cPt;
    
    public PessoaPet inserir (PessoaPet p) throws SQLException, ClassNotFoundException {
        ppetDao = new DaoPessoaPet();
        return ppetDao.inserir(p);
    }
    
    public PessoaPet buscar (PessoaPet p) throws SQLException, ClassNotFoundException {
        ppetDao = new DaoPessoaPet();
        return ppetDao.buscar(p);
    }

    public List<PessoaPet> listar (PessoaPet p) throws SQLException, ClassNotFoundException {
        ppetDao = new DaoPessoaPet();
        List<PessoaPet> listaPP = ppetDao.listar(p);
        for (PessoaPet listaPP2 : listaPP) {
            cPe = new ControlePessoa();
            cPt = new ControlePet();
            
            Pessoa pesEntrada = new Pessoa(listaPP2.getIdPes());
            Pet petEntrada = new Pet(listaPP2.getIdPet());
            Pessoa pesSaida = cPe.buscar(pesEntrada);
            Pet petSaida = cPt.buscar(petEntrada);
            listaPP2.setPes(pesSaida);
            listaPP2.setPet(petSaida);
        }
        return listaPP;
    }

    public PessoaPet alterar (PessoaPet p) throws SQLException, ClassNotFoundException {
        ppetDao = new DaoPessoaPet();
        return ppetDao.alterar(p);
    }

    public PessoaPet excluir (PessoaPet p) throws SQLException, ClassNotFoundException {
        ppetDao = new DaoPessoaPet();
        return ppetDao.excluir(p);
    }
}