/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informatica;

/**
 *
 * @author marcelo
 */
public class Fatura {
    
    int numItem;
    int qtdItem;
    double valorItem;
    String descricao;
    
    double faturaTotal;

    public double getFaturaTotal() {
        
        faturaTotal = qtdItem*valorItem;
        
        return faturaTotal;
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
    
    
    
    Fatura(){
    numItem = 0;
    qtdItem = 0;
    valorItem = 0;
    descricao = "";
}
    Fatura(int nItem, int qtd, double valor, String descricaoItem){
        if(nItem<0){
            numItem = 0;}
        else{
      numItem = nItem;
        }
        if (qtd <0){
            qtdItem = 0;}
        else{
            qtdItem = qtd;
        }
        if(valor <0 ){
            valorItem = 0;
        }
        else{      
            valorItem = valor;
        }
      descricao = descricaoItem;
      
    
    }
    
}

