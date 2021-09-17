/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacliente.controller;

import java.sql.SQLException;
import java.util.List;
import pizzacliente.model.bean.Cliente;
import pizzacliente.model.bean.Pedido;
import pizzacliente.model.dao.DaoPedido;

/**
 *
 * @author marcelo
 */
public class ControlePedido {
    
    static DaoPedido pedDao;
    static ControleCliente cCl;
    
    public Pedido inserir (Pedido p) throws SQLException, ClassNotFoundException {
        pedDao = new DaoPedido();
        return pedDao.inserir(p);
    }
    
    public Pedido buscar (Pedido p) throws SQLException, ClassNotFoundException {
        pedDao = new DaoPedido();
        return pedDao.buscar(p);
    }

    public List<Pedido> listar (Pedido p) throws SQLException, ClassNotFoundException {
        pedDao = new DaoPedido();
        List<Pedido> listaPed = pedDao.listar(p);
        for (Pedido listaPed2 : listaPed) {
            cCl = new ControleCliente();
         
            Cliente cliEntrada = new Cliente(listaPed2.getIdCli());
            Cliente cliSaida = cCl.buscar(cliEntrada);
            listaPed2.setCli(cliSaida);
        }
        return listaPed;
    }

    public Pedido alterar (Pedido p) throws SQLException, ClassNotFoundException {
        pedDao = new DaoPedido();
        return pedDao.alterar(p);
    }

    public Pedido excluir (Pedido p) throws SQLException, ClassNotFoundException {
        pedDao = new DaoPedido();
        return pedDao.excluir(p);
    }
    
}
