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
    
    private int id;
    private String nome;
    private String idade;
    private String tipo;

    public Pet(int id) {
        this.id = id;
    }

    public Pet(String nome) {
        this.nome = nome;
    }

    public Pet(int id, String nome, String idade, String tipo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pet{" + "id=" + id + ", nome=" + nome + ", idade=" + idade + ", tipo=" + tipo + '}';
    }

   


    
    
    
    
}

