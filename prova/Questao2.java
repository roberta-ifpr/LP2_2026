import java.util.Scanner;

public class Questao2 {
    private static Scanner sc = new Scanner(System.in);
    public static int processar(int[][] A, int N) {
    int x = 0;
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            if (i + j == N - 1) {
                if (A[i][j] % 2 != 0) {
                    x += A[i][j];
                }
            }
        }
    }
    return x;
}
public static void leMatriz(int n, int[][] A){
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            A[i][j]=sc.nextInt();
        }
        
    }
}

public static void main(String[] args) {
    int[][] A = new int[3][3];
    leMatriz(3,A);
    int x = processar(A,3);
    System.out.println(x);
}

}
