import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Números primos:");
        System.out.println(Arrays.toString(calcularPrimos(n)));

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
