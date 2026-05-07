import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ArrayList<String> nomes = new ArrayList<>();
        int op = 0;
        do{
            System.out.println("Escolha ações na lista");
            System.out.println("1 - Adicionar nome ");
            System.out.println("2 - Listar nomes ");
            System.out.println("3 - Alterar nome");
            System.out.println("4 - Remover nome");
            System.out.println("0 - Sair");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    adicionarNome(nomes);
                    break;
            
                case 2:
                    listarNomes(nomes);
                default:
                    break;
            }

        }while (op!= 0);
       
        

    }

    public static void adicionarNome(ArrayList<String> nomes){
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        nomes.add(nome);
    }

    public static void listarNomes(ArrayList<String> nomes){
        if (nomes.isEmpty()){
            System.out.println("Lista Vazia");
            return;
        }
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

}
