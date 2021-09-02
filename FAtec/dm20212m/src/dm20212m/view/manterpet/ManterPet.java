/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.view.manterpet;

import dm20212m.controller.ControlePet;
import dm20212m.model.bean.Pet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ManterPet {

    public static void montarTela() throws SQLException, ClassNotFoundException {
        int ops = Integer.parseInt(JOptionPane.showInputDialog("INSERIR = 1, LISTAR = 2, BUSCAR = 3, ALTERAR = 4, EXCLUIR = 5"));
        if(ops == 1 ) inserir();
        if(ops == 2 ) listar();
        if(ops == 3 ) buscar();
        if(ops == 4 ) alterar();
        if(ops == 5 ) excluir();
    }

    public static void inserir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"INSERIR PET");
        String nome = JOptionPane.showInputDialog("ENTRE COM O NOME");
        String idade = JOptionPane.showInputDialog("ENTRE COM O IDADE");
        String tipo = JOptionPane.showInputDialog("ENTRE COM O TIPO");
        Pet pet = new Pet(0,nome,idade,tipo);
        ControlePet contPet = new ControlePet();
        pet = contPet.inserir(pet);
        JOptionPane.showMessageDialog(null,"PET = " + pet.toString());
    }

    public static void listar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"LISTAR PET");
        String nome = JOptionPane.showInputDialog("ENTRE COM O NOME");
        Pet pet = new Pet(nome);
        ControlePet contPet = new ControlePet();
        List<Pet> listaP = contPet.listar(pet);
        listaP.forEach((pesL) -> {
            JOptionPane.showMessageDialog(null,pesL.toString());
        });
    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"BUSCAR PET");
        int idPet = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        Pet pet = new Pet(idPet);
        ControlePet contPet = new ControlePet();
        pet = contPet.buscar(pet);
        JOptionPane.showMessageDialog(null,"PET = " + pet.toString());
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"ALTERAR PET");
        int idPes = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        String nome = JOptionPane.showInputDialog("ENTRE COM O NOME");
        String idade = JOptionPane.showInputDialog("ENTRE COM O IDADE");
        String tipo = JOptionPane.showInputDialog("ENTRE COM O TIPO");
        Pet pet = new Pet(idPes,nome,idade,tipo);
        ControlePet contPet = new ControlePet();
        pet = contPet.alterar(pet);
        JOptionPane.showMessageDialog(null,"PET = " + pet.toString());
    }
    
    public static void excluir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"EXCLUIR PET");
        int idPes = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        Pet pet = new Pet(idPes);
        ControlePet contPet = new ControlePet();
        pet = contPet.excluir(pet);
        JOptionPane.showMessageDialog(null,"PET = " + pet.toString());
    }
    
}
