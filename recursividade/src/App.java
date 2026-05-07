public class App {

   public static void escreveNumero(int n) {
    if (n == 0) {
        return; // caso base
    }
    
    escreveNumero(n - 1); // chamada recursiva
    
    System.out.println(n); // ação
    }

    public static void main(String[] args) {
        escreveNumero(10);
        
    }
}
