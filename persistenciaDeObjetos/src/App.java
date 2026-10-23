import csv.ArquivoProdutoCSV;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        ArquivoProdutoCSV arquivo = new ArquivoProdutoCSV();
        int op;
        
        do { 
            
            System.out.println("Escolha a Opção:");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produto");
            System.out.println("3 - Alterar Produto");
            System.out.println("4 - Deletar Produto");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    Produto produto = new Produto();
                    System.out.println("Cadastrar Produto");
                    System.out.print("Id: ");
                    teclado.nextLine();
                    produto.setId(teclado.nextInt());
                    System.out.print("Nome: ");
                    teclado.nextLine();
                    produto.setNome(teclado.nextLine());
                    System.out.print("Preço: ");
                    produto.setPreco(teclado.nextDouble());
                    arquivo.inserir(produto);
                    break;
                case 2:
                    ArrayList<Produto> produtos = arquivo.listar();
                    System.out.println("====================");
                        System.out.println("Listagem de Produtos");
                        System.out.println("====================");
                    for (Produto prod : produtos) {
                        
                        System.out.println(prod.getId()+"    "+prod.getNome()+"    R$"+prod.getPreco());
                        System.out.println("---------------------");
                    }
                    teclado.nextLine();
                    teclado.nextLine();
                    break;
                case 4:
                    System.out.println("====================");
                    System.out.println("   Deletar Produto  ");
                    System.out.println("===================="); 
                    System.out.print("Informe ID do produto a ser deletado: ");
                    int id = teclado.nextInt();
                    if(arquivo.deletar(id)){
                        System.out.println("Produto deletado com sucesso");
                    }else{
                        System.out.println("Produto não encontrado ou erro ao salvar");
                    }

                default:
                    throw new AssertionError();
            }
            
        } while (op!=5);

        
    }
}
