public class Questao7 {
    public static void espelhar(int[][] img, int linhas, int colunas) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas / 2; j++) {
                int temp = img[i][j];
                img[i][j] = img[i][colunas - 1 - j];
                img[i][colunas - 1 - j] = temp;
            }
        }
    }

    public static void escreva(int[][] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] A = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        espelhar(A, 4, 4);
        escreva(A);

    }
}
