/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.cliente;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import pizzacliente.view.mantercliente.manterCliente;
import pizzacliente.view.mantertipo.ManterTipo;

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

        int ops = Integer.parseInt(JOptionPane.showInputDialog("CLIENTE = 1, PEDIDO = 2 "));
        if(ops == 1 ) {
            manterCliente.montarTela();
        }
        if(ops == 2){
            ManterTipo.montarTela();
        }
        }

    }
    

