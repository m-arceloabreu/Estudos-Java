/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacliente.view.manterusuario;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import pizzacliente.controller.ControleUsuario;
import pizzacliente.model.bean.Usuario;

/**
 *
 * @author marcelo
 */
public class ManterUsuario {
    public static void montarTela() throws SQLException, ClassNotFoundException  {
        int ops = Integer.parseInt(JOptionPane.showInputDialog("INSERIR = 1, LISTAR = 2, BUSCAR = 3, ALTERAR = 4, EXCLUIR = 5"));
        if(ops == 1 ) inserir();
        if(ops == 2 ) listar();
        if(ops == 3 ) buscar();
        if(ops == 4 ) alterar();
        if(ops == 5 ) excluir();
    }

      public static boolean validaUsuario() throws SQLException, ClassNotFoundException  {
          boolean retorno = false;
          String login = JOptionPane.showInputDialog("LOGIN");
          String senha = JOptionPane.showInputDialog("SENHA");
          Usuario usuEntrada = new Usuario(login,senha);
          ControleUsuario contUsu = new ControleUsuario();
          Usuario usuSaida = contUsu.valida(usuEntrada);
          if(usuSaida != null) {
              retorno = true;
          }
          return retorno;
      }
    

    public static void inserir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"INSERIR USUÁRIO");
        String login = JOptionPane.showInputDialog("ENTRE COM O LOGIN");
        String senha = JOptionPane.showInputDialog("ENTRE COM O SENHA");
        String status = JOptionPane.showInputDialog("ENTRE COM O STATUS");
        String tipo = JOptionPane.showInputDialog("ENTRE COM O TIPO");
        

        Usuario u = new Usuario(0, login,senha,status,tipo);
        ControleUsuario contU = new ControleUsuario();
        u = contU.inserir(u);
        JOptionPane.showMessageDialog(null,"USUARIO = " + u.toString());
    }

    public static void listar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"LISTAR USUARIO");
        String login = JOptionPane.showInputDialog("ENTRE COM O LOGIN");
        Usuario u = new Usuario(login);
        ControleUsuario contU = new ControleUsuario();
        List<Usuario> listaU = contU.listar(u);
        listaU.forEach((usuL) -> {
            JOptionPane.showMessageDialog(null,usuL.toString());
        });
    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"BUSCAR USUARIO");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        Usuario u = new Usuario(id);
        ControleUsuario contU = new ControleUsuario();
        u = contU.buscar(u);
        JOptionPane.showMessageDialog(null,"PESSOA = " + u.toString());
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"ALTERAR USUARIO");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        String login = JOptionPane.showInputDialog("ENTRE COM O LOGIN");
        String senha = JOptionPane.showInputDialog("ENTRE COM O SENHA");
        String status = JOptionPane.showInputDialog("ENTRE COM O STATUS");
        String tipo = JOptionPane.showInputDialog("ENTRE COM O TIPO");
        
        Usuario u = new Usuario(id,login,senha,status, tipo);
        ControleUsuario contU = new ControleUsuario();
        u = contU.alterar(u);
        JOptionPane.showMessageDialog(null,"Usuario = " + u.toString());
    }
   
    public static void excluir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"EXCLUIR USUARIO");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        Usuario u = new Usuario(id);
        ControleUsuario contU = new ControleUsuario();
        u = contU.excluir(u);
        JOptionPane.showMessageDialog(null,"PESSOA = " + u.toString());
    }
}
