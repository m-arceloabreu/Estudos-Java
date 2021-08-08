/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.model.bean;

/**
 *
 * @author marcelo
 */
public class Pet {
    
    private int idPet;
    private String nomePet;
    private String idadePet;
    private String tipo;

    public Pet(int idPet) {
        this.idPet = idPet;
    }

    public Pet(String nomePet) {
        this.nomePet = nomePet;
    }

    public Pet(int idPet, String nomePet, String idadePet, String tipo) {
        this.idPet = idPet;
        this.nomePet = nomePet;
        this.idadePet = idadePet;
        this.tipo = tipo;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getIdadePet() {
        return idadePet;
    }

    public void setIdadePet(String idadePet) {
        this.idadePet = idadePet;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pet{" + "idPet=" + idPet + ", nomePet=" + nomePet + ", idadePet=" + idadePet + ", tipo=" + tipo + '}';
    }

    
    
    
    
}

