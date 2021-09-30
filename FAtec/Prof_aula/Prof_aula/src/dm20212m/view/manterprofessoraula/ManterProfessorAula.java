/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.view.manterprofessoraula;

import dm20212m.controller.ControleProfessorAula;
import dm20212m.model.bean.ProfessorAula;
import dm20212m.model.bean.ProfessorAula;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ManterProfessorAula {

    public static void montarTela() throws SQLException, ClassNotFoundException  {
        int ops = Integer.parseInt(JOptionPane.showInputDialog("INSERIR = 1, LISTAR = 2, BUSCAR = 3, ALTERAR = 4, EXCLUIR = 5"));
        if(ops == 1 ) inserir();
        if(ops == 2 ) listar();
        if(ops == 3 ) buscar();
        if(ops == 4 ) alterar();
        if(ops == 5 ) excluir();
    }

    public static void listar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"LISTAR Professor Aula");
        String obs = JOptionPane.showInputDialog("ENTRE COM O OBS");
        ProfessorAula pespet = new ProfessorAula(obs);
        ControleProfessorAula contPP = new ControleProfessorAula();
        List<ProfessorAula> listaPP = contPP.listar(pespet);
        listaPP.forEach((pespetL) -> {
            JOptionPane.showMessageDialog(null,pespetL.toString());
            JOptionPane.showMessageDialog(null,"Professor = " + pespetL.getPro().getNome());
            JOptionPane.showMessageDialog(null,"Aula = " + pespetL.getAula().getNome());
        });
    }

    public static void inserir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"INSERIR AULA");
        int idPro = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O IDPRO"));
        int idAula = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O IDAULA"));
        String obs = JOptionPane.showInputDialog("ENTRE COM O OBS");
        ProfessorAula pp = new ProfessorAula(0,idPro,idAula,obs);
        ControleProfessorAula contPAula = new ControleProfessorAula();
        pp = contPAula.inserir(pp);
        JOptionPane.showMessageDialog(null,"PROFESSORAULA = " + pp.toString());

    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"BUSCAR AULA");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        ProfessorAula pp = new ProfessorAula(id);
        ControleProfessorAula contPAula = new ControleProfessorAula();
        pp = contPAula.buscar(pp);
        JOptionPane.showMessageDialog(null,"PROFESSORAULA = " + pp.toString());
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"ALTERAR PULA");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        int idPro = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O IDPRO"));
        int idAula = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O IDAULA"));
        String obs = JOptionPane.showInputDialog("ENTRE COM O OBS");
        ProfessorAula pp = new ProfessorAula(id,idPro,idAula,obs);
        ControleProfessorAula contPAula = new ControleProfessorAula();
        pp = contPAula.alterar(pp);
        JOptionPane.showMessageDialog(null,"PROFESSORAULA = " + pp.toString());
    }
    
    public static void excluir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"EXCLUIR AULA");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        ProfessorAula pp = new ProfessorAula(id);
        ControleProfessorAula contPAula = new ControleProfessorAula();
        pp = contPAula.excluir(pp);
        JOptionPane.showMessageDialog(null,"PROFESSORAULA = " + pp.toString());
    }
}
