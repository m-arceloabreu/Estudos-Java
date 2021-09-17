/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacliente.view.manterpedido;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import pizzacliente.controller.ControlePedido;
import pizzacliente.model.bean.Pedido;

/**
 *
 * @author marcelo
 */
public class manterPedido {
public static void montarTela() throws SQLException, ClassNotFoundException  {
        int ops = Integer.parseInt(JOptionPane.showInputDialog("INSERIR = 1, LISTAR = 2, BUSCAR = 3, ALTERAR = 4, EXCLUIR = 5"));
        if(ops == 1 ) inserir();
        if(ops == 2 ) listar();
        if(ops == 3 ) buscar();
        if(ops == 4 ) alterar();
        if(ops == 5 ) excluir();
    }

    public static void listar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"LISTAR Pedido");
        String sabor = JOptionPane.showInputDialog("ENTRE COM O SABOR");
        Pedido ped = new Pedido(sabor);
        ControlePedido contPed = new ControlePedido();
        List<Pedido> listaPed = contPed.listar(ped);
        listaPed.forEach((pedL) -> {
            JOptionPane.showMessageDialog(null,pedL.toString());
            JOptionPane.showMessageDialog(null,"Cliente = " + pedL.getCli().getNome());
        });
    }

    public static void inserir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"INSERIR Pedido");
        int idCli = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O IDCliente"));
        String sabor = JOptionPane.showInputDialog("ENTRE COM O SAbor");
        String tamanho = JOptionPane.showInputDialog("ENTRE COM O Tamanho");
        String borda = JOptionPane.showInputDialog("ENTRE COM BORDA");
        String saborborda = JOptionPane.showInputDialog("ENTRE COM O SaborBorda");
        Pedido ped = new Pedido(0,idCli,sabor,tamanho,borda,saborborda);
        ControlePedido contPed = new ControlePedido();
        ped = contPed.inserir(ped);
        JOptionPane.showMessageDialog(null,"PEDIDO = " + ped.toString());

    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"BUSCAR Pedido");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        Pedido ped = new Pedido(id);
        ControlePedido contPed = new ControlePedido();
        ped = contPed.buscar(ped);
        JOptionPane.showMessageDialog(null,"Pedido = " + ped.toString());
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"ALTERAR Pedido");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        int idCli = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O IDCLI"));
        String sabor = JOptionPane.showInputDialog("ENTRE COM O SAbor");
        String tamanho = JOptionPane.showInputDialog("ENTRE COM O Tamanho");
        String borda = JOptionPane.showInputDialog("ENTRE COM BORDA");
        String saborborda = JOptionPane.showInputDialog("ENTRE COM O SaborBorda");
        
        
        Pedido ped = new Pedido(id,idCli,sabor,tamanho,borda,saborborda);
        ControlePedido contPed = new ControlePedido();
        ped = contPed.alterar(ped);
        JOptionPane.showMessageDialog(null,"PEDIDO = " + ped.toString());
    }
    
    public static void excluir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"EXCLUIR PEDIDO");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        Pedido ped = new Pedido(id);
        ControlePedido contPed = new ControlePedido();
        ped = contPed.excluir(ped);
        JOptionPane.showMessageDialog(null,"PEdido = " + ped.toString());
    }
    
    
}
