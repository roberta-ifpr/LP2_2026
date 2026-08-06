package gerenciamentoCursos;

import java.util.List;

public class Semestre {
    private String nome;
    private List<Disciplina> disciplinas;
    
    public Semestre() {
    }

    public Semestre(String nome, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
}
