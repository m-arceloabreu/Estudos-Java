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
public class ClientePedido {
    
   private int id;
   private int idCli;
   private int idPed;
   private String servir;
   private String paga;
   private Cliente cli;
   private Pedido ped;

    public ClientePedido(int id) {
        this.id = id;
    }

    public ClientePedido(String servir) {
        this.servir = servir;
    }

    public ClientePedido(int id, int idCli, int idPed, String servir, String paga) {
        this.id = id;
        this.idCli = idCli;
        this.idPed = idPed;
        this.servir = servir;
        this.paga = paga;
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

    public int getIdPed() {
        return idPed;
    }

    public void setIdPed(int idPed) {
        this.idPed = idPed;
    }

    public String getServir() {
        return servir;
    }

    public void setServir(String servir) {
        this.servir = servir;
    }

    public String getPaga() {
        return paga;
    }

    public void setPaga(String paga) {
        this.paga = paga;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Pedido getPed() {
        return ped;
    }

    public void setPed(Pedido ped) {
        this.ped = ped;
    }
   
  public String toString() {
        return "ClientePedido{" + "id=" + id + ", idCli=" + idCli + ", idPed=" + idPed + ", Local de Retirada=" + servir +"Forma de Pagamento="+ paga + '}';
    }
    
}
