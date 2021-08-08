/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.controller;

import dm20212m.model.bean.Pet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcelo
 */
public class ControlePet {
    
     public Pet inserirPet(Pet pe){
        System.out.println("EXE INSERIR");
            pe.setIdPet(1);
             return pe;
    }
     public List<Pet> listarPet(Pet pe){
        System.out.println("EXE LISTAR");
        List<Pet> listaPe= new ArrayList<>();
            listaPe.add(pe);
            
             return listaPe;
    }
     public Pet buscarPet(Pet pe){
        System.out.println("EXE BUSCAR");
             return pe;
    }
    public Pet alterarPet(Pet pe){
        System.out.println("EXE ALTERAR");
             return pe;
    }
    public Pet excluirPet (Pet pe){
        System.out.println("EXE EXCLUIR");
             return pe;
    }
}
