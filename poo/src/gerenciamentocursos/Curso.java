package gerenciamentocursos;

import java.util.List;

public class Curso {
    private String nome;
    private Professor coordenador;
    private List<Semestre> semestres;

    public Curso() {
    }

    public Curso(String nome, Professor coordenador, List<Semestre> semestres) {
        this.nome = nome;
        this.coordenador = coordenador;
        this.semestres = semestres;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Professor getCoordenador() {
        return coordenador;
    }
    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }
    public List<Semestre> getSemestres() {
        return semestres;
    }
    public void setSemestres(List<Semestre> semestres) {
        this.semestres = semestres;
    }
    

}
