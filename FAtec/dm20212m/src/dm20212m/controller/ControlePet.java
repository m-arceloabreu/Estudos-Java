/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.controller;

import dm20212m.model.bean.Pet;
import dm20212m.model.dao.DaoPet;
import java.util.List;

/**
 *
 * @author marcelo
 */
public class ControlePet {
    static DaoPet daoPet = new DaoPet();
    
     public Pet inserir(Pet p){
        
             return daoPet.inserir(p);
    }
     public List<Pet> listar(Pet p){
        return daoPet.listar(p);
    }
     public Pet buscar(Pet p){
        
         return daoPet.buscar(p);
    }
    public Pet alterar(Pet p){
        
        return daoPet.alterar(p);
    }
    public Pet excluir(Pet p){
        
        return daoPet.excluir(p);
    }
}
