public class Recursividade {
    public static int fatorial(int n){
        int fat = 1;
        for(int i=n;i>0;i--){
            fat *= i;
        }
        return fat;
    }
//neste caso o else é desnecessário
    public static int fat(int n){
        if (n<0){
            return -1;
        }
        if (n==1 || n==0){
            return 1;
        }
        return n*fat(n-1);
    }

    //somatorio de m e n onde m<=n
    public static int somatorio(int m, int n){
        
        if(m>n){
            return -1; //caso não aceitável
        }
        if (m==n){
            return m;
        }
        return m + somatorio(m+1, n);
        
        
    }





    public static void main(String[] args) {
        System.out.println(fatorial(3));
    }

}
