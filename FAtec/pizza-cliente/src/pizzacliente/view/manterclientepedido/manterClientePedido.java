/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacliente.view.manterclientepedido;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import pizzacliente.controller.ControleClientePedido;
import pizzacliente.model.bean.ClientePedido;

/**
 *
 * @author marcelo
 */
public class manterClientePedido {
    
    public static void montarTela() throws SQLException, ClassNotFoundException  {
        int ops = Integer.parseInt(JOptionPane.showInputDialog("INSERIR = 1, LISTAR = 2, BUSCAR = 3, ALTERAR = 4, EXCLUIR = 5"));
        if(ops == 1 ) inserir();
        if(ops == 2 ) listar();
        if(ops == 3 ) buscar();
        if(ops == 4 ) alterar();
        if(ops == 5 ) excluir();
    }

    public static void listar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"LISTAR CLIENTE PEDIDO");
        String servir = JOptionPane.showInputDialog("ENTRE COM LOCAL DE RETIRADA ");
        ClientePedido cp = new ClientePedido(servir);
        ControleClientePedido contCp = new ControleClientePedido();
        List<ClientePedido> listaCp = contCp.listar(cp);
        listaCp.forEach((cpL) -> {
            JOptionPane.showMessageDialog(null,cpL.toString());
            JOptionPane.showMessageDialog(null,"Cliente = " + cpL.getCli().getNome());
            JOptionPane.showMessageDialog(null,"Pedido = " + cpL.getPed().getSabor());
        });
    }

    public static void inserir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"INSERIR Cliente-Pedido");
        int idCli = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O IDCLI"));
        int idPed = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O IDPED"));
        String servir = JOptionPane.showInputDialog("ENTRE COM O LOCAL DE RETIRADA");
        String paga = JOptionPane.showInputDialog("ENTRE COM a FORMA DE PAGAMENTO");
        ClientePedido cp = new ClientePedido(0,idCli,idPed,servir,paga);
        ControleClientePedido contCp = new ControleClientePedido();
        cp = contCp.inserir(cp);
        JOptionPane.showMessageDialog(null,"Cliente Pedido = " + cp.toString());

    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"BUSCAR Cliente Pedido");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        ClientePedido cp = new ClientePedido(id);
        ControleClientePedido contCp = new ControleClientePedido();
        cp = contCp.buscar(cp);
        JOptionPane.showMessageDialog(null,"CLIENTE PEDIDO = " + cp.toString());
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"ALTERAR CLIENTE PEDIDO");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        int idCli = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O IDCli"));
        int idPed = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O IDPEd"));
        String servir = JOptionPane.showInputDialog("ENTRE COM O LOCAL DE RETIRADA");
        String paga = JOptionPane.showInputDialog("ENTRE COM A FORMA DE PAGAMENTO");
        ClientePedido cp = new ClientePedido(id,idCli,idPed,servir,paga);
        ControleClientePedido contCp = new ControleClientePedido();
        cp = contCp.alterar(cp);
        JOptionPane.showMessageDialog(null,"ClientePedido = " + cp.toString());
    }
    
    public static void excluir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"EXCLUIR Cliente Pedido");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        ClientePedido cp = new ClientePedido(id);
        ControleClientePedido contCp = new ControleClientePedido();
        cp = contCp.excluir(cp);
        JOptionPane.showMessageDialog(null,"ClientePedido = " + cp.toString());
    }
    
}
