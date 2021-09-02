/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.view.manterpessaopet;

import dm20212m.controller.ControlePessoaPet;
import dm20212m.model.bean.PessoaPet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ManterPessoaPet {

    public static void montarTela() throws SQLException, ClassNotFoundException  {
        int ops = Integer.parseInt(JOptionPane.showInputDialog("INSERIR = 1, LISTAR = 2, BUSCAR = 3, ALTERAR = 4, EXCLUIR = 5"));
        if(ops == 1 ) inserir();
        if(ops == 2 ) listar();
        if(ops == 3 ) buscar();
        if(ops == 4 ) alterar();
        if(ops == 5 ) excluir();
    }

    public static void listar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"LISTAR PESSOA PET");
        String obs = JOptionPane.showInputDialog("ENTRE COM O OBS");
        PessoaPet pespet = new PessoaPet(obs);
        ControlePessoaPet contPP = new ControlePessoaPet();
        List<PessoaPet> listaPP = contPP.listar(pespet);
        listaPP.forEach((pespetL) -> {
            JOptionPane.showMessageDialog(null,pespetL.toString());
            JOptionPane.showMessageDialog(null,"Pessoa = " + pespetL.getPes().getNome());
            JOptionPane.showMessageDialog(null,"Pet = " + pespetL.getPet().getNome());
        });
    }

    public static void inserir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"INSERIR PET");
        int idPes = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O IDPES"));
        int idPet = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O IDPET"));
        String obs = JOptionPane.showInputDialog("ENTRE COM O OBS");
        PessoaPet pp = new PessoaPet(0,idPes,idPet,obs);
        ControlePessoaPet contPPet = new ControlePessoaPet();
        pp = contPPet.inserir(pp);
        JOptionPane.showMessageDialog(null,"PESSOAPET = " + pp.toString());

    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"BUSCAR PET");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        PessoaPet pp = new PessoaPet(id);
        ControlePessoaPet contPPet = new ControlePessoaPet();
        pp = contPPet.buscar(pp);
        JOptionPane.showMessageDialog(null,"PESSOAPET = " + pp.toString());
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"ALTERAR PET");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        int idPes = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O IDPES"));
        int idPet = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O IDPET"));
        String obs = JOptionPane.showInputDialog("ENTRE COM O OBS");
        PessoaPet pp = new PessoaPet(id,idPes,idPet,obs);
        ControlePessoaPet contPPet = new ControlePessoaPet();
        pp = contPPet.alterar(pp);
        JOptionPane.showMessageDialog(null,"PESSOAPET = " + pp.toString());
    }
    
    public static void excluir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"EXCLUIR PET");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        PessoaPet pp = new PessoaPet(id);
        ControlePessoaPet contPPet = new ControlePessoaPet();
        pp = contPPet.excluir(pp);
        JOptionPane.showMessageDialog(null,"PESSOAPET = " + pp.toString());
    }
}
