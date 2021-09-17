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
    private int idCli;
    private String sabor;
    private String tamanho;
    private String borda;
    private String saborBorda;
    private Cliente cli;

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }
    

    public Pedido(int id) {
        this.id = id;
    }

    public Pedido(String sabor) {
        this.sabor = sabor;
    }

    public Pedido(int id, int idCli, String sabor, String tamanho, String borda, String saborBorda) {
        this.id = id;
        this.idCli = idCli;
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.borda = borda;
        this.saborBorda = saborBorda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
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

    public String getSaborBorda() {
        return saborBorda;
    }

    public void setSaborBorda(String saborBorda) {
        this.saborBorda = saborBorda;
    }
    
    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", idCLi=" + idCli + ", sabor= " + sabor + ", Tamanho= " + tamanho + ", borda= " + borda + ", SaborBorda= " + saborBorda+ '}';
    }
}
