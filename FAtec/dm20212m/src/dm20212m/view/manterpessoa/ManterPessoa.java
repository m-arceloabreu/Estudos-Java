/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.view.manterpessoa;

import dm20212m.controller.ControlePessoa;
import dm20212m.model.bean.Pessoa;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ManterPessoa {
    
    public static void montarTela() throws SQLException, ClassNotFoundException  {
        int ops = Integer.parseInt(JOptionPane.showInputDialog("INSERIR = 1, LISTAR = 2, BUSCAR = 3, ALTERAR = 4, EXCLUIR = 5"));
        if(ops == 1 ) inserir();
        if(ops == 2 ) listar();
        if(ops == 3 ) buscar();
        if(ops == 4 ) alterar();
        if(ops == 5 ) excluir();
    }

    public static void inserir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"INSERIR PESSOA");
        String nome = JOptionPane.showInputDialog("ENTRE COM O NOME");
        String idade = JOptionPane.showInputDialog("ENTRE COM O IDADE");
        String genero = JOptionPane.showInputDialog("ENTRE COM O GENERO");
        String peso = JOptionPane.showInputDialog("ENTRE COM O PESO");
        String altura = JOptionPane.showInputDialog("ENTRE COM O ALTURA");
        Pessoa pes = new Pessoa(0,nome,idade,altura,genero,peso);
        ControlePessoa contP = new ControlePessoa();
        pes = contP.inserir(pes);
        JOptionPane.showMessageDialog(null,"PESSOA = " + pes.toString());
    }

    public static void listar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"LISTAR PESSOA");
        String nome = JOptionPane.showInputDialog("ENTRE COM O NOME");
        Pessoa pes = new Pessoa(nome);
        ControlePessoa contP = new ControlePessoa();
        List<Pessoa> listaP = contP.listar(pes);
        listaP.forEach((pesL) -> {
            JOptionPane.showMessageDialog(null,pesL.toString());
        });
    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"BUSCAR PESSOA");
        int idPes = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        Pessoa pes = new Pessoa(idPes);
        ControlePessoa contP = new ControlePessoa();
        pes = contP.buscar(pes);
        JOptionPane.showMessageDialog(null,"PESSOA = " + pes.toString());
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"ALTERAR PESSOA");
        int idPes = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        String nome = JOptionPane.showInputDialog("ENTRE COM O NOME");
        String idade = JOptionPane.showInputDialog("ENTRE COM O IDADE");
        String genero = JOptionPane.showInputDialog("ENTRE COM O GENERO");
        String peso = JOptionPane.showInputDialog("ENTRE COM O PESO");
        String altura = JOptionPane.showInputDialog("ENTRE COM O ALTURA");
        Pessoa pes = new Pessoa(idPes,nome,idade,altura,genero,peso);
        ControlePessoa contP = new ControlePessoa();
        pes = contP.alterar(pes);
        JOptionPane.showMessageDialog(null,"PESSOA = " + pes.toString());
    }
    
    public static void excluir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"EXCLUIR PESSOA");
        int idPes = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        Pessoa pes = new Pessoa(idPes);
        ControlePessoa contP = new ControlePessoa();
        pes = contP.excluir(pes);
        JOptionPane.showMessageDialog(null,"PESSOA = " + pes.toString());
    }

}
