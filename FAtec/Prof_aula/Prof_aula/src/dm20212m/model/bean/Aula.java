/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.model.bean;

/**
 *
 * @author User
 */
public class Aula {
    
    private int id;
    private String materia;
    private String area;
    private String tipo;
    private String nome;

    public Aula(int id) {
        this.id = id;
    }

    public Aula(String nome) {
        this.nome = nome;
    }

    public Aula(int id, String materia, String area, String tipo) {
        this.id = id;
        this.materia = materia;
        this.area = area;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getArea() {
        return area;
    }

    public void setIdade(String area) {
        this.area = area;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Aula{" + "id=" + id + ", materia=" + materia + ", area=" + area + ", tipo=" + tipo + '}';
    }

    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
