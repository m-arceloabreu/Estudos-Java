
package dm20212m.view.manterpet;

import dm20212m.controller.ControleAula;
import dm20212m.model.bean.Aula;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class ManterAula {

    public static void montarTela() throws SQLException, ClassNotFoundException {
        int ops = Integer.parseInt(JOptionPane.showInputDialog("INSERIR = 1, LISTAR = 2, BUSCAR = 3, ALTERAR = 4, EXCLUIR = 5"));
        if(ops == 1 ) inserir();
        if(ops == 2 ) listar();
        if(ops == 3 ) buscar();
        if(ops == 4 ) alterar();
        if(ops == 5 ) excluir();
    }

    public static void inserir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"INSERIR AULA");
        String materia = JOptionPane.showInputDialog("ENTRE COM O MATERIA");
        String area = JOptionPane.showInputDialog("ENTRE COM O AREA");
        String tipo = JOptionPane.showInputDialog("ENTRE COM O TIPO");
        Aula aula = new Aula(0,materia,area,tipo);
        ControleAula contAula = new ControleAula();
        aula = contAula.inserir(aula);
        JOptionPane.showMessageDialog(null,"AULA = " + aula.toString());
    }

    public static void listar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"LISTAR PET");
        String nome = JOptionPane.showInputDialog("ENTRE COM O NOME");
        Aula aula = new Aula(nome);
        ControleAula contAula = new ControleAula();
        List<Aula> listaP = contAula.listar(aula);
        listaP.forEach((pesL) -> {
            JOptionPane.showMessageDialog(null,pesL.toString());
        });
    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"BUSCAR PET");
        int idAula = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        Aula aula = new Aula(idAula);
        ControleAula contAula = new ControleAula();
        aula = contAula.buscar(aula);
        JOptionPane.showMessageDialog(null,"PET = " + aula.toString());
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"ALTERAR PET");
        int idPro = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        String nome = JOptionPane.showInputDialog("ENTRE COM O NOME");
        String idade = JOptionPane.showInputDialog("ENTRE COM O IDADE");
        String tipo = JOptionPane.showInputDialog("ENTRE COM O TIPO");
        Aula aula = new Aula(idPro,nome,idade,tipo);
        ControleAula contAula = new ControleAula();
        aula = contAula.alterar(aula);
        JOptionPane.showMessageDialog(null,"AULA = " + aula.toString());
    }
    
    public static void excluir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"EXCLUIR AULA");
        int idPro = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        Aula aula = new Aula(idPro);
        ControleAula contAula = new ControleAula();
        aula = contAula.excluir(aula);
        JOptionPane.showMessageDialog(null,"AULA = " + aula.toString());
    }
    
}
