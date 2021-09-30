/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacliente.controller;

import java.sql.SQLException;
import java.util.List;
import pizzacliente.model.bean.Pedido;
import pizzacliente.model.dao.DaoPedido;

/**
 *
 * @author marcelo
 */
public class ControlePedido {
    static DaoPedido daoP;
    
    public ControlePedido () throws SQLException, ClassNotFoundException {
        daoP = new DaoPedido();
    }

    public Pedido inserir(Pedido pe) throws SQLException {
        return daoP.inserir(pe);
    }

    public List<Pedido> listar(Pedido pe) throws SQLException {
        return daoP.listar(pe);
    }

    public Pedido buscar(Pedido pe) throws SQLException {
        return daoP.buscar(pe);
    }

    public Pedido alterar(Pedido pe) throws SQLException {
        return daoP.alterar(pe);
    }
    
    public Pedido excluir(Pedido pe) throws SQLException {
        return daoP.excluir(pe);
    }
    
}
