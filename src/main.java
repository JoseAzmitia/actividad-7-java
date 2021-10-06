import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        //Variable que contiene la cantidad de números a calcular.
        int n = 10;
        //Se imprimen según el formato de la actividad los valores de los arreglos.
        System.out.println("Números primos:");
        System.out.println(Arrays.toString(calcularPrimos(n)));
        System.out.println("Sucesión de Fibonacci:");
        System.out.println(Arrays.toString(fibonacci(n)));
    }

    //Creación del método para calcular los números primos
    public static int[] calcularPrimos(int num){
        //Se declara el arreglo para guardar los números primos
        int primos[] = new int[num];
        //Se declara una variable para la posición del arreglo y una variable para evaluar si es primo
        int p = 0;
        int i = 1;
        //Ciclo que evalúa si la variable i es número primo y la guarda dentro de una posición del arreglo.
        while (p < primos.length){
            i++;
            //Se evalúa por medio de un if y un método para saber si el número es primo y si debe guardarlo en el arreglo.
            if (esPrimo(i)){
                primos[p] = i;
                p++;
            }
        }
        return primos;

    }

    public static int[] fibonacci(int num){
        //Se declara el arreglo para guardar la serie de fibonacci
        int fibonacci[] = new int[num];
        //Se declara una variable para la posición del arreglo y dos variables para guardar los números de la serie.
        int p = 0;
        int f1=1;
        int f2=1;
        //Guardamos el número 1 porque la serie siempre empieza con 1.
        fibonacci[p] = f1;
        //Por medio de un ciclo calculamos el siguiente número en la serie y lo guardamos en el arreglo
        for(int i=2;i<=num;i++){
            p++;
            fibonacci[p] = f2;
            //Primero se suman los últimos dos números de la serie.
            f2 = f1 + f2;
            //Se cambia el valor de la variable por la suma de los números.
            f1 = f2 - f1;
        }
        return  fibonacci;
    }

    //Método para saber si un número es primo
    //El método recibe el número a evaluar y regresa un booleano para saber si cumple la condición.
    public static Boolean esPrimo(int num) {
        //Se declara la variable que guarda si es o no primo en un valor booleano
        //Se crea con una pequeña condición para que en el caso de ser igual a 1 sea falso.
        boolean primo = (num==1)?false:true;
        //Se declara una variable que servirá para recorrer los número entre el 2 y el número a evaluar.
        //Se recorren los números y se evalúa si son divisibles por otro número y se asigna false a la variable primo en tal caso.
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
