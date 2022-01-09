/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacliente.controller;


import pizzacliente.model.bean.Cliente;
import pizzacliente.model.dao.DaoCliente;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author marcelo
 */
public class ControleCliente {
     static DaoCliente daoC;
    
    public ControleCliente () throws SQLException, ClassNotFoundException {
        daoC = new DaoCliente();
    }

    public Cliente inserir(Cliente cl) throws SQLException {
        return daoC.inserir(cl);
    }

    public List<Cliente> listar(Cliente cl) throws SQLException {
        return daoC.listar(cl);
    }

    public Cliente buscar(Cliente cl) throws SQLException {
        return daoC.buscar(cl);
    }

    public Cliente alterar(Cliente cl) throws SQLException {
        return daoC.alterar(cl);
    }
    
    public Cliente excluir(Cliente cl) throws SQLException {
        return daoC.excluir(cl);
    }
    
}

