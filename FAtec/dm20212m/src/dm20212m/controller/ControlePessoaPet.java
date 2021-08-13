/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.controller;

import dm20212m.model.bean.PessoaPet;
import dm20212m.model.dao.DaoPessoaPet;
import java.util.List;

/**
 *
 * @author marcelo
 */
public class ControlePessoaPet {
    
    static DaoPessoaPet daoPP = new DaoPessoaPet();
    
     public List<PessoaPet> listar(PessoaPet p){
             return daoPP.listar(p);
    }

  public PessoaPet inserir(PessoaPet p){
      
           return daoPP.inserir(p);
    }
   
    
     public PessoaPet buscar(PessoaPet p){
         
        return daoPP.buscar(p);
    }
    public PessoaPet alterar(PessoaPet p){
        
        return daoPP.alterar(p);
    }
    public PessoaPet excluir(PessoaPet p){
        
        return daoPP.excluir(p);
    }
    
}
