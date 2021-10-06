import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Números primos:");
        System.out.println(Arrays.toString(calcularPrimos(n)));
        System.out.println("Sucesión de Fibonacci:");
        System.out.println(Arrays.toString(fibonacci(n)));
    }

    public static int[] calcularPrimos(int num){

        int primos[] = new int[num];
        int p = 0;
        int i = 1;
        while (p < primos.length){
            i++;
            if (esPrimo(i)){
                primos[p] = i;
                p++;
            }
        }
        return primos;

    }

    public static int[] fibonacci(int num){
        int fibonacci[] = new int[num];
        int p = 0;
        int f1=1;
        int f2=1;
        fibonacci[p] = f1;
        for(int i=2;i<=num;i++){
            p++;
            fibonacci[p] = f2;
            f2 = f1 + f2;
            f1 = f2 - f1;
        }
        return  fibonacci;
    }

    public static Boolean esPrimo(int num)
    {
        boolean primo = (num==1)?false:true;
        int divisor=2;
        while(primo && divisor<=Math.sqrt(num)){
            if(num%divisor==0){
                primo = false;
            }
            divisor++;
        }
        return primo;
    }
}
