/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m;

import dm20212m.view.manterpessaopet.ManterPessoaPet;
import dm20212m.view.manterpessoa.ManterPessoa;
import dm20212m.view.manterpet.ManterPet;
import dm20212m.view.manterusuario.ManterUsuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DM20212M {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        boolean retorno = ManterUsuario.validaUsuario();
        
        if(retorno) {
            int ops = Integer.parseInt(JOptionPane.showInputDialog("PESSOA = 1, PET = 2, PESPET = 3, USUARIO = 4"));
            if(ops == 1 ) ManterPessoa.montarTela();
            if(ops == 2 ) ManterPet.montarTela();
            if(ops == 3 ) ManterPessoaPet.montarTela();
            if(ops == 4 ) ManterUsuario.montarTela();
        } else {
            JOptionPane.showMessageDialog(null,"Usuario invalido");
        }
    }
}
