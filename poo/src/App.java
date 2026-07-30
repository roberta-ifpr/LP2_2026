
import modelo.Endereco;
import modelo.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Programação Orientada a Objetos");
        Pessoa p; //declarando
        Endereco endereco;
        p = new Pessoa();
        p.setNome("Frederico Wanderley");
        p.setEmail("frederico@gmail.com");
        p.setCpf("438309");
        endereco = new Endereco("Av das Pombas", "2020", "IFPR", "Floresta", "Cascavel", "PR", "Br");
        p.setEndereco(endereco);
        //p.setEndereco(new Endereco(null, null, null, null, null, null, null));

    }
}
