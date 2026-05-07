public class Questao1 {
    public static void main(String[] args) {
        int[] v = { 4, 2, 7, 1 };

        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] < v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                    System.out.println(i+" "+j+" "+temp+" "+v[j] );
                }
            }
        }

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

    }

}
