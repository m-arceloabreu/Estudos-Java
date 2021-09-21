/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faturar;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Faturar {

    
    int numItem;
    int qtdItem;
    double valorItem;
    String descricao;

    public Faturar(int numItem, int qtdItem, double valorItem, String descricao) {
        this.numItem = numItem;
        this.qtdItem = qtdItem;
        this.valorItem = valorItem;
        this.descricao = descricao;
    }

    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    public double getValorItem() {
        return valorItem;
    }

    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        // TODO code application logic here
    numItem = Integer.parseInt( JOptionPane.showInputDialog(null,"Digite o numero do Item: "));
    descricao = JOptionPane.showInputDialog(null,"Digite a descricao do Item: ");
    qtdItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
    valorItem = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do item: "));
    
    
    
    
    }
    
}
