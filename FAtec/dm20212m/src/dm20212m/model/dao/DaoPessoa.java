/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.model.dao;

import dm20212m.model.bean.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcelo
 */
public class DaoPessoa {
    
    
    
    
    public Pessoa inserirPessoa(Pessoa p){
        System.out.println("EXE INSERIR");
            p.setId(1);
             return p;
    }
    public List<Pessoa> listarPessoa(Pessoa p){
        System.out.println("EXE LISTAR");
        List<Pessoa> listaP = new ArrayList<>();
            listaP.add(p);
            
             return listaP;
    }
    public Pessoa buscarPessoa(Pessoa p){
        System.out.println("EXE BUSCAR");
             return p;
    }
    public Pessoa alterarPessoa(Pessoa p){
        System.out.println("EXE ALTERAR");
             return p;
    }
    public Pessoa excluirPessoa(Pessoa p){
        System.out.println("EXE EXCLUIR");
             return p;
    }
    
}
