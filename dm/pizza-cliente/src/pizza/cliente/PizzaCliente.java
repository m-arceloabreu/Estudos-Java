/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.cliente;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import pizzacliente.view.mantercliente.manterCliente;
import pizzacliente.view.manterclientepedido.manterClientePedido;
import pizzacliente.view.manterpedido.manterPedido;
import pizzacliente.view.manterusuario.ManterUsuario;

/**
 *
 * @author marcelo
 */
public class PizzaCliente {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public  static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        boolean retorno = ManterUsuario.validaUsuario();

        int ops = Integer.parseInt(JOptionPane.showInputDialog("CLIENTE = 1, PEDIDO = 2 , CLIENTE-PEDIDO = 3, USUARIO = 4"));
        
        if(retorno){
        if(ops == 1 ) {
            manterCliente.montarTela();
        }
        if(ops == 2){
            manterPedido.montarTela();
        }
        if(ops == 3){
            manterClientePedido.montarTela();
        }
        if(ops == 4 ) ManterUsuario.montarTela();
        
        else {
            JOptionPane.showMessageDialog(null,"Usuario invalido");
        }
        
        }
        }

    }
    

