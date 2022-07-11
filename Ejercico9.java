//Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.

import java.util.Scanner;

public class Ejercico9 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Ingrese Frase: ");
            String frase = sc.nextLine();

            System.out.println("Ingrese letra para contar: ");
            String letra = sc.nextLine();

            int numOfOcurrences = frase.length() - frase.replaceAll(letra, letra).length();
            System.out.println(numOfOcurrences + letra + ": ");
        }
    }

}
