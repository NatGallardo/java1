import java.util.Scanner;

public class Ejercicio4 {

  private static int numero;

  public static void main(String[] args) {
    System.out.println("\nIngrese un numero");

    try (Scanner sc = new Scanner(System.in)) {
      int numero = sc.nextInt();

      int hecho = 1;
      for (int i = 1; i < numero; i++) {
        hecho += hecho * i;
      }
      System.out.println("\nEl factorial de '" + numero + "' es: " + hecho);
    }
  }

  public static void main(int numero) {

    int hecho = factorial(numero);
    System.out.println("Factorial de" + numero + "es:" + hecho);
  }

  public static int factorial(int number) {
    if (numero == 0) {

    }
    return (numero * factorial(numero - 1));
  }

}
