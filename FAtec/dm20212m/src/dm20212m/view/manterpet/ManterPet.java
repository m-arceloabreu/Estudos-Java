/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.view.manterpet;

import dm20212m.controller.ControlePet;
import dm20212m.model.bean.Pet;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class ManterPet {
        public static void montarTelaPet(){     
            int ops = Integer.parseInt(JOptionPane.showInputDialog("Inserir Pet = 1, Listar Pet= 2, Buscar Pet = 3, Alterar Pet = 4, Excluir Pet = 5"));
            
            if( ops == 1){
            inserirPet();
            }
        if( ops == 2){
            listarPet();
        }
        if( ops == 3){
            buscarPet();
        }
        if( ops == 4){
            alterarPet();
        }
        if( ops == 5){
            excluirPet();
        }
            
            
        }
        public static void inserirPet(){
            JOptionPane.showMessageDialog(null, "INSERIR PET");
            
            String nomePet = JOptionPane.showInputDialog("ENTRE COM O NOME");
            String idadePet = JOptionPane.showInputDialog("ENTRE COM IDADE");
            String tipo = JOptionPane.showInputDialog("ENTRE COM O TIPO");
            
            Pet animal = new Pet(0, nomePet, idadePet, tipo);
            ControlePet contP = new ControlePet();
            animal =  contP.inserirPet(animal);
            JOptionPane.showMessageDialog(null,"Pet = " + animal.toString());
        }
        public static void listarPet(){
            JOptionPane.showMessageDialog(null, "LISTAR PET");
            String nomePet = JOptionPane.showInputDialog("Entre com o nome do Pet");
            
            Pet animal = new Pet(nomePet);
            ControlePet contP = new ControlePet();
            List<Pet> listaPe = contP.listarPet(animal);
            
           listaPe.forEach ((animalL)->{
               JOptionPane.showMessageDialog(null,animalL.toString());
           });
            
        }
        public static void buscarPet(){
            JOptionPane.showMessageDialog(null,"Buscar PET");
            int idPe = Integer.parseInt(JOptionPane.showInputDialog("Entre como o ID PET"));
            
            Pet animal = new Pet(idPe);
            ControlePet contP = new ControlePet();
            animal = contP.buscarPet(animal);
            
            JOptionPane.showMessageDialog(null,"PET = " + animal.toString());
        
        }
        public static void alterarPet(){
            JOptionPane.showMessageDialog(null,"Alterar PET");
            int idPe = Integer.parseInt(JOptionPane.showInputDialog("Entre como o ID PET"));
            String nomePet = JOptionPane.showInputDialog("ENTRE COM O NOME");
            String idadePet = JOptionPane.showInputDialog("ENTRE COM IDADE");
            String tipo = JOptionPane.showInputDialog("ENTRE COM O TIPO");
            
            Pet animal = new Pet(idPe, nomePet, idadePet, tipo);
            ControlePet contP = new ControlePet();
            animal = contP.buscarPet(animal);
            JOptionPane.showMessageDialog(null,"PET = " + animal.toString());
            
        }
        
        public static void excluirPet(){
            JOptionPane.showMessageDialog(null, "EXCLUIR PET");
            int idPe = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID PET"));
            
            Pet animal = new Pet(idPe);
            ControlePet contP = new ControlePet();
            animal = contP.excluirPet(animal);
            JOptionPane.showMessageDialog(null,"Pet = " + animal.toString());
            
        
        }
}
