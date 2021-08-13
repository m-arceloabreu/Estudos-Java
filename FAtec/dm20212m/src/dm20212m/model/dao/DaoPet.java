/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.model.dao;

import dm20212m.model.bean.Pet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcelo
 */
public class DaoPet {
    public Pet inserir(Pet p){
        System.out.println("EXE INSERIR");
            p.setId(1);
             return p;
    }
     public List<Pet> listar(Pet p){
        System.out.println("EXE LISTAR");
        List<Pet> listaP= new ArrayList<>();
            listaP.add(p);
            
             return listaP;
    }
     public Pet buscar(Pet p){
        System.out.println("EXE BUSCAR");
             return p;
    }
    public Pet alterar(Pet p){
        System.out.println("EXE ALTERAR");
             return p;
    }
    public Pet excluir(Pet p){
        System.out.println("EXE EXCLUIR");
             return p;
    }
    
}
