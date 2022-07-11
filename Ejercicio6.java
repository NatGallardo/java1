//Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia (sin uso de librerías)

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        int base, exponente;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Ingrese la base positiva");
            base = sc.nextInt();
            System.out.println("Ingrese el exponente positivo");
            exponente = sc.nextInt();

            int resultado = 1;
            for (int i = 1; i <= exponente; i++) {
                resultado *= base;
            }
            System.out.println("poder:" + resultado);
        }

    }
}
