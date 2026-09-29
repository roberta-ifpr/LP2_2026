import csv.ArquivoProdutoCSV;
import modelo.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Produto p = new Produto(1, "Mouse", 25);
        Produto p1 = new Produto(2,"Teclado", 100);

        ArquivoProdutoCSV arquivo = new ArquivoProdutoCSV();

        System.out.println("Brincando com CSV");
       // System.out.println(p.getId()+","+p.getNome()+","+p.getPreco());
       arquivo.inserir(p);
       arquivo.inserir(p1);
    }
}
