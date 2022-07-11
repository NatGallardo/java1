//Crear una aplicación que solicite de entrada los datos de una persona en este orden:
//Nombre y Apellido
//Edad
//Dirección
//Ciudad
//Luego imprimirá el siguiente mensaje:
//{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese Nombre y Apellido: ");
        String fn_Ln = sc.nextLine();

        System.out.println("Ingrese Edad: ");
        int Edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese Dirección: ");
        String direccion = sc.nextLine();

        System.out.println("Ingrese Ciudad: ");
        String ciudad = sc.nextLine();

        sc.close();

        System.out.println(ciudad + "- " +
                direccion + "- " +
                Edad + "- " +
                fn_Ln);

    }

}
