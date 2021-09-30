/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacliente.view.manterpedido;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.List;
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

    public static void inserir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"INSERIR PEDIDO");
        String sabor = JOptionPane.showInputDialog("ENTRE COM O SABOR");
        String tamanho = JOptionPane.showInputDialog("ENTRE COM O TAMANHO");
        String borda = JOptionPane.showInputDialog("ENTRE COM A BORDA");
        String obs = JOptionPane.showInputDialog("ENTRE COM ALGUMA OBSERVAÇÃO");
        String bebida = JOptionPane.showInputDialog("ENTRE COM A BEBIDA");
        
        Pedido ped = new Pedido(0,sabor,tamanho,borda,obs,bebida);
        ControlePedido contP = new ControlePedido();
        ped = contP.inserir(ped);
        JOptionPane.showMessageDialog(null,"Pedido = " + ped.toString());
    }
//estou aqui
       public static void listar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"LISTAR PEDIDO");
        String sabor = JOptionPane.showInputDialog("ENTRE COM O SABOR");
        Pedido ped = new Pedido(sabor);
        ControlePedido contP = new ControlePedido();
        List<Pedido> listaPe = contP.listar(ped);
        listaPe.forEach((pedL) -> {
            JOptionPane.showMessageDialog(null,pedL.toString());
        });
    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"BUSCAR PEDIDO");
        int idPed = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        Pedido ped = new Pedido(idPed);
        ControlePedido contP = new ControlePedido();
        ped = contP.buscar(ped);
        JOptionPane.showMessageDialog(null,"Pedido = " + ped.toString());
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"ALTERAR PEDIDO");
        int idPed= Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        String sabor = JOptionPane.showInputDialog("ENTRE COM O Sabor");
        String tamanho = JOptionPane.showInputDialog("ENTRE COM O TAMANHO");
        String borda = JOptionPane.showInputDialog("ENTRE COM A BORDA");
        String obs = JOptionPane.showInputDialog("ENTRE COM A OBS");
        String bebida = JOptionPane.showInputDialog("ENTRE COM A BEBIDA");
        Pedido ped = new Pedido(idPed,sabor,tamanho,borda,obs,bebida);
        ControlePedido contP = new ControlePedido();
        ped = contP.alterar(ped);
        JOptionPane.showMessageDialog(null,"Pedido = " + ped.toString());
    }
    
    public static void excluir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"EXCLUIR PEDIDO");
        int idPed = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        Pedido ped = new Pedido(idPed);
        ControlePedido contP = new ControlePedido();
        ped = contP.excluir(ped);
        JOptionPane.showMessageDialog(null,"Pedido = " + ped.toString());
    }
  
}
