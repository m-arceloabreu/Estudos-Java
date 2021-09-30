
package dm20212m.model.bean;


public class Professor {
    
    private int id;
    private String nome;
    private String classificacao;
    private String materia;
    private String area;

    public Professor(int id) {
        this.id = id;
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(int id, String nome, String classificacao, String materia, String area) {
        this.id = id;
        this.nome = nome;
        this.classificacao = classificacao;
        this.materia = materia;
        this.area = area;
      
    }

    public Professor(int aInt, String string, String string0, String string1, String string2, boolean add) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String idade) {
        this.classificacao = classificacao;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String genero) {
        this.materia = materia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String peso) {
        this.area = area;
    }


    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", classificacao=" + classificacao + ", materia=" + materia + ", area=" + area + "}";
    }
    
}
