import java.util.Scanner;

public class AcimaDaDiagonal {

    public final static Scanner board = new Scanner(System.in);

    public static char readChar() {
        char c;
        c = board.next().charAt(0);
        return c;
    }
    
    public static double readDoubleValue() {
        double d;
        d = board.nextDouble();
        return d;
    }

    public static void readMultiArray(double[][] m){
        int lines = m.length;
        int columns = m[0].length;

        for(int i = 0; i < lines; i++){

            for(int j = 0; j < columns; j++){
                m[i][j] = readDoubleValue();
            }

        }
    }

    public static double[] sum(double[][] m){
        double[] sum = new double[2];

        for(int i = 0; i < m.length; i++){

            for(int j = 0; j < m[0].length; j++){
                if(i < j){
                    sum[0] += m[i][j];
                    sum[1]++;
                }
            }

        }

        return sum;
    }

    public static double media(double[][]m){
        double[] sum = new double[2];
        sum = sum(m);
        double media = sum[0] / sum[1];
        return media;
    }

    public static double resolution(double[][]m, char c){
        double answer = 0;

        if(c == 'S'){
            double[] sum = new double[2];
            sum = sum(m);
            answer = sum[0]; 
        }else if(c == 'M'){
            answer = media(m);
        }

        
        return answer;
    }

    public static void main(String[] args) {
        double[][]m = new double[2][2];
        double answer = 0;
        char c = readChar();
        readMultiArray(m);

        answer = resolution(m,c);
        System.out.printf("%.1f\n",answer);
    }
}
