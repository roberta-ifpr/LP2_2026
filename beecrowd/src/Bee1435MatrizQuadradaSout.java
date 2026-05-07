import java.util.*;

public class Bee1435MatrizQuadradaSout {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            if (N == 0)
                break;
            for (int cont = 1; cont<=N;cont++) {

                int[][] M = new int[cont][cont];

                for (int i = 0; i < cont; i++) {
                    for (int j = 0; j < cont; j++) {

                        int valor = Math.min(
                                Math.min(i, j),
                                Math.min(cont - 1 - i, cont - 1 - j)) + 1;

                        M[i][j] = valor;
                    }
                }

                // Impressão
                for (int i = 0; i < cont; i++) {
                    for (int j = 0; j < cont; j++) {

                        if (j == 0)
                            System.out.printf("%3d", M[i][j]);
                        else
                            System.out.printf(" %3d", M[i][j]);
                    }
                    System.out.println();
                }

                System.out.println(); // linha em branco entre matrizes
            }

        }

        sc.close();
    }
}
