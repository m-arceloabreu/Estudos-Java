/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.view.manterpessoa;


import dm20212m.controller.ControlePessoa;
import dm20212m.model.bean.Pessoa;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class ManterPessoa {
    
    public static void montarTela(){
        int ops = Integer.parseInt(JOptionPane.showInputDialog("Inserir = 1, Listar = 2, Buscar = 3, Alterar = 4, Excluir = 5"));
        
        if( ops == 1){
            inserirPessoa();
    }
        if( ops == 2){
            listarPessoa();
        }
        if( ops == 3){
            buscarPessoa();
        }
        if( ops == 4){
            alterarPessoa();
        }
        if( ops == 5){
            excluirPessoa();
        }
    }
    
    public static void inserirPessoa(){
             JOptionPane.showMessageDialog(null, "INSERIR PESSOA");
        
        String nome = JOptionPane.showInputDialog("Entre com o nome: ");
        String idade = JOptionPane.showInputDialog("Entre com o idade: ");
        String genero = JOptionPane.showInputDialog("Entre com o genero: ");
        String peso = JOptionPane.showInputDialog("Entre com o peso: ");
        String altura = JOptionPane.showInputDialog("Entre com o altura: ");
        
        Pessoa pes = new Pessoa(0, nome, idade, genero, altura, peso);
        ControlePessoa contP = new ControlePessoa();
        pes = contP.inserirPessoa(pes);
        JOptionPane.showMessageDialog(null, "Pessoa = " +pes.toString());
        
    }
    public static void listarPessoa(){
         JOptionPane.showMessageDialog(null, "Listar PESSOA");
       
        String nome = JOptionPane.showInputDialog("Entre com o nome: ");
       
        
        Pessoa pes = new Pessoa(nome);
        ControlePessoa contP = new ControlePessoa();
        List<Pessoa> listaP = contP.listarPessoa(pes);
        
        listaP.forEach((pesL) -> {
            JOptionPane.showMessageDialog(null,pesL.toString());
        });
        
    }
     public static void buscarPessoa(){
         JOptionPane.showMessageDialog(null, "Buscar PESSOA");
        int idPes = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        
        
        Pessoa pes = new Pessoa(idPes);
        ControlePessoa contP = new ControlePessoa();
        pes = contP.buscarPessoa(pes);
        
        JOptionPane.showMessageDialog(null, "Pessoa = " +pes.toString());
      
    }
      public static void alterarPessoa(){
         JOptionPane.showMessageDialog(null, "ALTERAR PESSOA");
        int idPes = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        String nome = JOptionPane.showInputDialog("Entre com o nome: ");
        String idade = JOptionPane.showInputDialog("Entre com o idade: ");
        String genero = JOptionPane.showInputDialog("Entre com o genero: ");
        String peso = JOptionPane.showInputDialog("Entre com o peso: ");
        String altura = JOptionPane.showInputDialog("Entre com o altura: ");
        
        Pessoa pes = new Pessoa(idPes, nome, idade, genero, altura, peso);
        ControlePessoa contP = new ControlePessoa();
        pes = contP.alterarPessoa(pes);
        JOptionPane.showMessageDialog(null, "Pessoa = " +pes.toString());
        
    }
       public static void excluirPessoa(){
         JOptionPane.showMessageDialog(null, "EXCLUIR PESSOA");
        int idPes = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        Pessoa pes = new Pessoa(idPes);
      
        ControlePessoa contP = new ControlePessoa();
        pes = contP.excluirPessoa(pes);
        JOptionPane.showMessageDialog(null, "Pessoa = " +pes.toString());
        
    }
}
