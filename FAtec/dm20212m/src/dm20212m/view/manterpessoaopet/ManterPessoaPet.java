/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.view.manterpessoaopet;

import dm20212m.controller.ControlePessoa;
import dm20212m.controller.ControlePessoaPet;
import dm20212m.controller.ControlePet;
import dm20212m.model.bean.Pessoa;
import dm20212m.model.bean.PessoaPet;
import dm20212m.model.bean.Pet;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class ManterPessoaPet {

     public static void montarTela(){
        int ops = Integer.parseInt(JOptionPane.showInputDialog("Inserir = 1, Listar = 2, Buscar = 3, Alterar = 4, Excluir = 5"));
        
        if( ops == 1){
            inserir();
    }
        if( ops == 2){
            listar();
        }
        if( ops == 3){
            buscar();
        }
        if( ops == 4){
            alterar();
        }
        if( ops == 5){
            excluir();
        }
    }
     
    public static void inserir(){
          JOptionPane.showMessageDialog(null,"Inserir Pessoa PET");
            
            int idPes = Integer.parseInt(JOptionPane.showInputDialog("Entre como o ID pessoa"));
            int idPet = Integer.parseInt(JOptionPane.showInputDialog("Entre como o ID PET"));
            String obs = JOptionPane.showInputDialog("ENTRE COM A observação");
            
            PessoaPet pp = new PessoaPet(0, idPes, idPet, obs);
            ControlePessoaPet contPP = new ControlePessoaPet();
            pp = contPP.inserir(pp);
            JOptionPane.showMessageDialog(null,"PESSOAPET = " + pp.toString());
       
             
    }
    public static void listar(){
         JOptionPane.showMessageDialog(null, "Listar PESSOA PET");
       
        String obs = JOptionPane.showInputDialog("Entre  COM O OBS ");
       
        
        PessoaPet pespet = new PessoaPet(obs);
        ControlePessoaPet contPP = new ControlePessoaPet();
        
        
        List<PessoaPet> listaP = contPP.listar(pespet);
        
        listaP.forEach((pespetL) -> {
            ControlePessoa contP = new ControlePessoa();
            ControlePet contPet = new ControlePet();
            
            Pessoa pes = new Pessoa(pespetL.getIdPes());
            Pet animal = new Pet (pespetL.getIdPet());
            
            pespetL.setPes(contP.buscarPessoa(pes));
            pespetL.setAnimal(contPet.buscar(animal));
            JOptionPane.showMessageDialog(null,pespetL.toString());
        });
        
    }
     public static void buscar(){
         JOptionPane.showMessageDialog(null,"buscar  PessoaPET");
            int id = Integer.parseInt(JOptionPane.showInputDialog("Entre como o ID "));
            
            
            PessoaPet pp = new PessoaPet(id);
            ControlePessoaPet contPP = new ControlePessoaPet();
            pp = contPP.buscar(pp);
            JOptionPane.showMessageDialog(null,"PESSOAPET = " + pp.toString());
    }
      public static void alterar(){
          JOptionPane.showMessageDialog(null,"Alterar PessoaPET");
            int id = Integer.parseInt(JOptionPane.showInputDialog("Entre como o ID "));
            int idPes = Integer.parseInt(JOptionPane.showInputDialog("Entre como o ID pessoa"));
            int idPet = Integer.parseInt(JOptionPane.showInputDialog("Entre como o ID PET"));
            String obs = JOptionPane.showInputDialog("ENTRE COM A observação");
            
            PessoaPet pp = new PessoaPet(id, idPes, idPet, obs);
            ControlePessoaPet contPP = new ControlePessoaPet();
            pp = contPP.alterar(pp);
            JOptionPane.showMessageDialog(null,"PESSOAPET = " + pp.toString());
        
    }
       public static void excluir(){
           JOptionPane.showMessageDialog(null,"excluir  PessoaPET");
            int id = Integer.parseInt(JOptionPane.showInputDialog("Entre como o ID "));
            
            
            PessoaPet pp = new PessoaPet(id);
            ControlePessoaPet contPP = new ControlePessoaPet();
            pp = contPP.excluir(pp);
            JOptionPane.showMessageDialog(null,"PESSOAPET = " + pp.toString());
         
    }
}
    

