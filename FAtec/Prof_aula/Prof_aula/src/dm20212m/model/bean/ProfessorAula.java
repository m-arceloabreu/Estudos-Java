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
public class ProfessorAula {
    
    private int id;
    private int idPro;
    private int idAula;
    private String obs;
    private Professor pro;
    private Aula aula;

    public ProfessorAula(int id) {
        this.id = id;
    }

    public ProfessorAula(String obs) {
        this.obs = obs;
    }

    public ProfessorAula(int id, int idPro, int idAula, String obs) {
        this.id = id;
        this.idPro = idPro;
        this.idAula = idAula;
        this.obs = obs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPro() {
        return idPro;
    }

    public void setIdPro(int idPro) {
        this.idPro = idPro;
    }

    public int getIdAula() {
        return idAula;
    }

    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Professor getPro() {
        return pro;
    }

    public void setPro(Professor pro) {
        this.pro = pro;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    @Override
    public String toString() {
        return "ProfessorAula{" + "id=" + id + ", idPro=" + idPro + ", idAula=" + idAula + ", obs=" + obs + '}';
    }

    
}
