//Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números (incrementos de 1) de la siguiente forma:
//aporte 
// 5
//resolución
//1
//12
//123
//1234
//12345

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int pisos;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("ingrese el numero");
            pisos = teclado.nextInt();
        }
        for (int i = 1; i <= pisos; i++) {
            System.out.println("");
            for (int x = 1; x <= i; x++) {
                System.out.println(x);

            }
        }
        System.out.println("");
    }
}