public class Questao3 {
    public static void main(String[] args) {
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                cont++;
            }
        }
        System.out.println(cont);
    }
}
