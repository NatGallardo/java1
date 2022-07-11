//Realizar un programa que solicite por consola 2 números enteros.
// Para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números.

import java.util.Scanner;
class Operacion{

public class Ejercicio2 {
    public static void main(String ags[]){
        try (Scanner teclado = new Scanner (System.in)) {
            System.out.println("Ingrese el primer número: ");
            int primerNumero = teclado.nextInt();
            System.out.println("Ingrese el segundo número: ");
            int segundoNumero =  teclado.nextInt();
   
            int suma = primerNumero + segundoNumero;
            int resta = primerNumero - segundoNumero;
            int multiplicacion = primerNumero * segundoNumero;
            int División = primerNumero / segundoNumero;
            int modulo = primerNumero % segundoNumero;

            System.out.println(primerNumero + " + " + segundoNumero + ": " + suma);
            System.out.println(primerNumero + " - " + segundoNumero + ": " + resta);
            System.out.println(primerNumero + " * " + segundoNumero + ": " + multiplicacion);
            System.out.println(primerNumero + " / " + segundoNumero + ": "+ División);
            System.out.println(primerNumero + " % " + segundoNumero + ": " + modulo);
        }
        
    }
    
}
}
