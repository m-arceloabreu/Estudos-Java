/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacliente.view.mantercliente;

import pizzacliente.controller.ControleCliente;
import pizzacliente.model.bean.Cliente;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class manterCliente {
 
    
    public static void montarTela() throws SQLException, ClassNotFoundException  {
        int ops = Integer.parseInt(JOptionPane.showInputDialog("INSERIR = 1, LISTAR = 2, BUSCAR = 3, ALTERAR = 4, EXCLUIR = 5"));
        if(ops == 1 ) inserir();
        if(ops == 2 ) listar();
        if(ops == 3 ) buscar();
        if(ops == 4 ) alterar();
        if(ops == 5 ) excluir();
    }

    public static void inserir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"INSERIR CLIENTE");
        String nome = JOptionPane.showInputDialog("ENTRE COM O NOME");
        String telefone = JOptionPane.showInputDialog("ENTRE COM O TELEFONE");
        String endereco = JOptionPane.showInputDialog("ENTRE COM O ENDEREÇO");
        Cliente cli = new Cliente(0,nome,telefone,endereco);
        ControleCliente contC = new ControleCliente();
        cli = contC.inserir(cli);
        JOptionPane.showMessageDialog(null,"CLIENTE = " + cli.toString());
    }

       public static void listar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"LISTAR CLIENTE");
        String nome = JOptionPane.showInputDialog("ENTRE COM O NOME");
        Cliente cli = new Cliente(nome);
        ControleCliente contC = new ControleCliente();
        List<Cliente> listaCl = contC.listar(cli);
        listaCl.forEach((cliL) -> {
            JOptionPane.showMessageDialog(null,cliL.toString());
        });
    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"BUSCAR CLiente");
        int idCli = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        Cliente cli = new Cliente(idCli);
        ControleCliente contC = new ControleCliente();
        cli = contC.buscar(cli);
        JOptionPane.showMessageDialog(null,"Cliente = " + cli.toString());
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"ALTERAR PESSOA");
        int idCli= Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        String nome = JOptionPane.showInputDialog("ENTRE COM O NOME");
        String telefone = JOptionPane.showInputDialog("ENTRE COM O TELEFONE");
        String endereco = JOptionPane.showInputDialog("ENTRE COM O ENDERECO");
        Cliente cli = new Cliente(idCli,nome,telefone,endereco);
        ControleCliente contC = new ControleCliente();
        cli = contC.alterar(cli);
        JOptionPane.showMessageDialog(null,"Cliente = " + cli.toString());
    }
    
    public static void excluir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"EXCLUIR Cliente");
        int idCli = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        Cliente cli = new Cliente(idCli);
        ControleCliente contC = new ControleCliente();
        cli = contC.excluir(cli);
        JOptionPane.showMessageDialog(null,"Cliente = " + cli.toString());
    }

}

