import java.util.Scanner;

public class Bee1174 {
    public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
        int[] N = new int[20];

        for (int i = 0; i < N.length; i++) {
            N[i]= leia.nextInt();
        }

        int aux = 0;
        int pos = 0;
        
        for(int i =0; i<N.length/2;i++){
            pos = N.length-1-i;
            aux = N[i];
            N[i] = N[pos];
            N[pos] = aux;
        }

        for (int i = 0; i < N.length; i++) {
             System.out.printf("N[%d] = %d%n",i,N[i]);
        }  
        leia.close();
    }
}
