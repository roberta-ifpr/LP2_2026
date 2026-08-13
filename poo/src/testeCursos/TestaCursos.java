package testeCursos;

import gerenciamentocursos.*;
import java.util.Scanner;

public class TestaCursos {
    
    private static Scanner TECLADO = new Scanner(System.in);
    private static Professor professor;
    private static Disciplina disciplina;

    public static void main(String[] args) {
        int op;
        do { 
            System.out.println("==============================");
            System.out.println("       Sistema Academico");
            System.out.println("==============================");
            System.out.println("1 - Curso");
            System.out.println("2 - Disciplina");
            System.out.println("3 - Professor");
            System.out.println("4 - Turma");
            System.out.println("5 - Aluno");
            System.out.println("6 - Semestre");
            System.out.println("7 - Matricula");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            op = TECLADO.nextInt();
            TECLADO.nextLine();
            switch (op) {
                case 1:
                    
                    break;
                case 2:
                    cadastrarDisciplina();
                    break;
                case 3:
                    cadastrarProfessor();
                    break;
                default:
                    throw new AssertionError();
            }
        } while (true);
      
        
    }

    public static void cadastrarDisciplina(){
        System.out.println("======== Cadastro de Disciplina ========");
        System.out.println();
        System.out.print("Nome: ");
        String nome = TECLADO.nextLine();
        System.out.println("Carga Horaria: ");
        int cargaHoraria = TECLADO.nextInt();
        
        disciplina = new Disciplina(nome, cargaHoraria, professor);
       
        System.out.println("Professor cadastrado");
    }

    public static void cadastrarProfessor(){
        System.out.println("======== Cadastro de Professor ========");
        System.out.println();
        System.out.print("Nome: ");
        String nome = TECLADO.nextLine();
        System.out.println("Titulo: ");
        String titulo = TECLADO.nextLine();
        professor = new Professor(nome, titulo);
        System.out.println("Professor cadastrado");
    }

}
