package gerenciamentocursos;

public class Turma {
    private String nome;
    private Semestre semestre;
    public Turma() {
    }

    public Turma(String nome, Semestre semestre) {
        this.nome = nome;
        this.semestre = semestre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Semestre getSemestre() {
        return semestre;
    }
    
    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }
    
    

}
