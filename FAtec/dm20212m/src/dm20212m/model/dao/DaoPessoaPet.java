/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.model.dao;

import dm20212m.model.bean.PessoaPet;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author marcelo
 */
public class DaoPessoaPet {
    
        public List<PessoaPet> listar(PessoaPet p){
        System.out.println("EXE LISTAR");
        List<PessoaPet> listaP = new ArrayList<>();
            listaP.add(p);
            
             return listaP;
    }

  public PessoaPet inserir(PessoaPet p){
        System.out.println("EXE INSERIR");
            p.setId(1);
             return p;
    }
   
    
     public PessoaPet buscar(PessoaPet p){
        System.out.println("EXE BUSCAR");
             return p;
    }
    public PessoaPet alterar(PessoaPet p){
        System.out.println("EXE ALTERAR");
             return p;
    }
    public PessoaPet excluir(PessoaPet p){
        System.out.println("EXE EXCLUIR");
             return p;
    }
    
    
 

    
}
