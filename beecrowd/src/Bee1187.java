x
public class Bee1187 {
    public final static Scanner TECLADO = new Scanner(System.in);
    public static double[][] M = new double[3][3];
    public static char O;
    public static void main(String[] args) {
        O = TECLADO.next().toUpperCase().charAt(O);
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = TECLADO.nextDouble();
            }
            
        }

        double soma=0;
        double media =0;
        int cont = 0;
        for (int i = 0; i < M.length/2-1; i++) {
            for (int j = 0; j < M.length; j++) {
                if(j>i && j<M.length-1-i){
                    soma+=M[i][j];
                    cont++;
                }
                
            } 
        }
        if(O=='S') System.out.printf("%.1f",soma);
            else if (O=='M') System.out.printf("%.1f",soma/cont);


    TECLADO.close();
    }

}
