package csv;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import modelo.Produto;

public class ArquivoProdutoCSV {
    private String nomeArquivo = "produtos.csv";

    public void inserir(Produto produto){
        try {
            FileWriter arquivo = new FileWriter(nomeArquivo, true);//cria arquivo ou acrescenta - false cria o arquivo vazio
            PrintWriter escritor = new PrintWriter(arquivo);
            escritor.println(produto.getId()+","+produto.getNome()+","+produto.getPreco());
            escritor.close();

        
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao acessar arquivo "+e.getMessage());
        }
        
    }

}
