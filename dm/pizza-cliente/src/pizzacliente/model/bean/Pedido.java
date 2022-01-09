/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacliente.model.bean;

/**
 *
 * @author marcelo
 */
public class Pedido {
    
    private int id;
    private String sabor;
    private String tamanho;
    private String borda;
    private String obs;
    private String bebida;
   


    public Pedido(int id) {
        this.id = id;
    }

    public Pedido(String sabor) {
        this.sabor = sabor;
    }

    public Pedido(int id, String sabor, String tamanho, String borda, String obs, String bebida) {
        this.id = id;
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.borda = borda;
        this.obs = obs;
        this.bebida = bebida;
       
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getBorda() {
        return borda;
    }

    public void setBorda(String borda) {
        this.borda = borda;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }
    
    public String toString() {
        return "Pedido{" + "id=" + id + ", Sabor=" + sabor + ", Tamanho=" + tamanho + ", Borda=" + borda + ", Observação=" + obs + ", Bebida=" + bebida  + '}';
    }
}
