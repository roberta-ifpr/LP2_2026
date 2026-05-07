import java.util.Scanner;

public class Bee1435MatrizQuadrada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder saida = new StringBuilder();

        while (true) {
            int n = sc.nextInt();
            //char c = sc.next().charAt(0);
            //if (c=='a') System.out.println("bom dia");
            

            if (n == 0) break;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int valor = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j)) + 1;

                    if (j > 0) {
                        saida.append(" ");
                    }

                    if (valor < 10) {
                        saida.append("  ");
                    } else if (valor < 100) {
                        saida.append(" ");
                    }

                    saida.append(valor);
                }
                saida.append("\n");
            }
            saida.append("\n");
        }

        System.out.print(saida);
        sc.close();
    }
}