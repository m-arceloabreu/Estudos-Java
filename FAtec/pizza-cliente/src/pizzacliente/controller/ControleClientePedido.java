/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacliente.controller;

import java.sql.SQLException;
import java.util.List;
import pizzacliente.model.bean.ClientePedido;
import pizzacliente.model.bean.Cliente;
import pizzacliente.model.bean.Pedido;
import pizzacliente.model.dao.DaoClientePedido;

/**
 *
 * @author marcelo
 */
public class ControleClientePedido {
    static DaoClientePedido cpDao;
    static ControleCliente cCli;
    static ControlePedido cPed;
    
    public ClientePedido inserir (ClientePedido cp) throws SQLException, ClassNotFoundException {
        cpDao = new DaoClientePedido();
        return cpDao.inserir(cp);
    }
    
    public ClientePedido buscar (ClientePedido cp) throws SQLException, ClassNotFoundException {
        cpDao = new DaoClientePedido();
        return cpDao.buscar(cp);
    }

    public List<ClientePedido> listar (ClientePedido cp) throws SQLException, ClassNotFoundException {
        cpDao = new DaoClientePedido();
        List<ClientePedido> listaCp = cpDao.listar(cp);
        for (ClientePedido listaCp2 : listaCp) {
            cCli = new ControleCliente();
            cPed = new ControlePedido();
            
            Cliente cliEntrada = new Cliente(listaCp2.getIdCli());
            Pedido pedEntrada = new Pedido(listaCp2.getIdPed());
            Cliente cliSaida = cCli.buscar(cliEntrada);
            Pedido pedSaida = cPed.buscar(pedEntrada);
            listaCp2.setCli(cliSaida);
            listaCp2.setPed(pedSaida);
        }
        return listaCp;
    }

    public ClientePedido alterar (ClientePedido cp) throws SQLException, ClassNotFoundException {
        cpDao = new DaoClientePedido();
        return cpDao.alterar(cp);
    }

    public ClientePedido excluir (ClientePedido cp) throws SQLException, ClassNotFoundException {
        cpDao = new DaoClientePedido();
        return cpDao.excluir(cp);
    }
}
