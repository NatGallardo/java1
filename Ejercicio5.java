//Se desea una aplicación que solicite 2 números enteros y realice la operación
//de multiplicacion por sumas sucesivas

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            if (true) {
                System.out.println("Ingrese 2 numeros positivos");
                int n1 = sc.nextInt();
                if (999 == n1) {
                    System.out.println("\nGracias por usar nuestra aplicación.");
                }

                int n2 = sc.nextInt();
                if (999 == n2) {
                    System.out.println("\nGracias por usar nuestra aplicación.");

                }

                int multiplicacion = 0;
                for (int i = 0; i < Math.abs(n2); i++) {
                    multiplicacion += n1;
                }

                if (n1 <= 0 && n2 <= 0 || n1 >= 0 && n2 >= 0) {

                    System.out.println("multiplicacion:" + (multiplicacion));
                }

            }

        }
    }
}
