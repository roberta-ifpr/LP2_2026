  import java.util.Scanner;
public class Bee1557 {
  



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();

            if (N == 0) break;

            int[][] M = new int[N][N];

            // Preencher matriz
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    M[i][j] = (int) Math.pow(2, i + j);
                }
            }

            // Descobrir tamanho do campo
            int maior = (int) Math.pow(2, 2 * N - 2);
            int T = String.valueOf(maior).length();

            // Impressão
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {

                    if (j == 0)
                        System.out.printf("%" + T + "d", M[i][j]);
                    else
                        System.out.printf(" %" + T + "d", M[i][j]);
                }
                System.out.println();
            }

            System.out.println();
        }

        sc.close();
    }
}


