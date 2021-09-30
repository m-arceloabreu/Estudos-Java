/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m;

import dm20212m.view.manterprofessoraula.ManterProfessorAula;
import dm20212m.view.manterprofessor.ManterProfessor;
import dm20212m.view.manteraula.ManterAula;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ProfessorAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        int ops = Integer.parseInt(JOptionPane.showInputDialog("PROFESSOR = 1, AULA = 2, PROAULA = 3"));
        if(ops == 1 ) ManterProfessor.montarTela();
        if(ops == 2 ) ManterAulamontarTela();
        if(ops == 3 ) ManterProfessorAula.montarTela();

    }
}
