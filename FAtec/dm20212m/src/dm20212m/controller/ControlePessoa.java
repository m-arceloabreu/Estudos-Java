/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.controller;

import dm20212m.model.bean.Pessoa;
import dm20212m.model.dao.DaoPessoa;
import java.util.List;


/**
 *
 * @author marcelo
 */
public class ControlePessoa {
    
    static DaoPessoa daoP = new DaoPessoa();
    
    
    public Pessoa inserirPessoa(Pessoa p){
       
           
             return daoP.inserirPessoa(p);
    }
    public List<Pessoa> listarPessoa(Pessoa p){
     
             return daoP.listarPessoa(p);
    }
    public Pessoa buscarPessoa(Pessoa p){
        
            return daoP.buscarPessoa(p);
    }
    public Pessoa alterarPessoa(Pessoa p){
        
        return daoP.alterarPessoa(p);
    }
    public Pessoa excluirPessoa(Pessoa p){
       
        return daoP.excluirPessoa(p);
    }
 
}
