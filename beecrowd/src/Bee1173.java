import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Bee1173 {
 
    public static void main(String[] args) throws IOException {
       Scanner leia = new Scanner(System.in);
       int[] N = new int[10];
       N[0] = leia.nextInt();
       for (int i = 1; i<N.length;i++){
           N[i] = N[i-1]*2;
       }
       for (int i = 0; i<N.length;i++){
          System.out.printf("N[%d] = %d%n",i,N[i]);
       }
       leia.close();
    }
 
}