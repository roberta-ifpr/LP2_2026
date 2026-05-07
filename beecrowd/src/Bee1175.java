import java.util.Scanner;

public class Bee1175 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[] N = new double[20];

        for (int i = 0; i < N.length; i++) {
            N[i]= leia.nextDouble();
        }

        double aux = 0;
        int pos = 0;
        
        for(int i =0; i<N.length/2;i++){
            pos = N.length-1-i;
            aux = N[i];
            N[i] = N[pos];
            N[pos] = aux;
        }

        for (int i = 0; i < N.length; i++) {
            System.out.print(N[i]+" ");
        }
    }
}
