import java.util.Scanner;

public class Classe {
    final static Scanner TECLADO = new Scanner(System.in); //instanciando declarando objeto
    static int idade;
    //static String nome;
    static char[] vetor = new char[10];
    public static void main(String[] args) {
        
     //   idade = TECLADO.nextInt();
        String teste = new String(vetor);
        String nova = "Fulano de Tal";
        String nome = "bom dia";
        System.out.println(nova.length());
        System.out.println(nova.substring(1,4));
        if (nome == nova){
            System.out.println("comparando objetos");
        }
        if (nome.equals(nova)){
            System.out.println("comparando valores");
        }
        
    }

}
