/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.controller;

import dm20212m.model.bean.Pet;
import dm20212m.model.dao.DaoPessoa;
import dm20212m.model.dao.DaoPet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ControlePet {

    static DaoPet daoPet ;
    
    public ControlePet () throws SQLException, ClassNotFoundException {
        daoPet = new DaoPet();
    }

    public Pet inserir(Pet p) throws SQLException {
        return daoPet.inserir(p);
    }

    public List<Pet> listar(Pet p) throws SQLException {
        return daoPet.listar(p);
    }

    public Pet buscar(Pet p) throws SQLException {
        return daoPet.buscar(p);
    }

    public Pet alterar(Pet p) throws SQLException {
        return daoPet.alterar(p);
    }
    
    public Pet excluir(Pet p) throws SQLException {
        return daoPet.excluir(p);
    }

    
}
