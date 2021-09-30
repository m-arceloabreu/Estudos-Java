
package dm20212m.view.manterpessoa;

import dm20212m.controller.ControleProfessor;
import dm20212m.model.bean.Professor;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class ManterProfessor {
    
    public static void montarTela() throws SQLException, ClassNotFoundException  {
        int ops = Integer.parseInt(JOptionPane.showInputDialog("INSERIR = 1, LISTAR = 2, BUSCAR = 3, ALTERAR = 4, EXCLUIR = 5"));
        if(ops == 1 ) inserir();
        if(ops == 2 ) listar();
        if(ops == 3 ) buscar();
        if(ops == 4 ) alterar();
        if(ops == 5 ) excluir();
    }

    public static void inserir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"INSERIR PROFESSOR");
        String nome = JOptionPane.showInputDialog("ENTRE COM O NOME");
        String classificacao = JOptionPane.showInputDialog("ENTRE COM O CLASSIFICACAO");
        String materia = JOptionPane.showInputDialog("ENTRE COM O MATERIA");
        String area = JOptionPane.showInputDialog("ENTRE COM O AREA");
        Professor pro = new Professor(0,nome,classificacao,materia,area);
        ControleProfessor contP = new ControleProfessor();
        pro = contP.inserir(pro);
        JOptionPane.showMessageDialog(null,"PESSOA = " + pro.toString());
    }

    public static void listar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"LISTAR PESSOA");
        String nome = JOptionPane.showInputDialog("ENTRE COM O NOME");
        Professor pro = new Professor(nome);
        ControleProfessor contP = new ControleProfessor();
        List<Professor> listaP = contP.listar(pro);
        listaP.forEach((pesL) -> {
            JOptionPane.showMessageDialog(null,pesL.toString());
        });
    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"BUSCAR PESSOA");
        int idPro = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        Professor pes = new Professor(idPro);
        ControleProfessor contP = new ControleProfessor();
        pes = contP.buscar(pes);
        JOptionPane.showMessageDialog(null,"PESSOA = " + pes.toString());
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"ALTERAR PESSOA");
        int idPro = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        String nome = JOptionPane.showInputDialog("ENTRE COM O NOME");
        String classificacao = JOptionPane.showInputDialog("ENTRE COM O IDADE");
        String materia = JOptionPane.showInputDialog("ENTRE COM O GENERO");
        String area = JOptionPane.showInputDialog("ENTRE COM O GENERO");
        Professor pro = new Professor(idPro,nome,classificacao,materia,area);
        ControleProfessor contP = new ControleProfessor();
        pro = contP.alterar(pro);
        JOptionPane.showMessageDialog(null,"Professor = " + pro.toString());
    }
    
    public static void excluir() throws SQLException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null,"EXCLUIR PESSOA");
        int idPro = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID"));
        Professor pro = new Professor(idPro);
        ControleProfessor contP = new ControleProfessor();
        pro = contP.excluir(pro);
        JOptionPane.showMessageDialog(null,"PESSOA = " + pro.toString());
    }

}
