//Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}”



import java.util.Scanner;

public class Ejercicio1 {
    public static <nombreUsuario> void main(String[]args){
        
        try (Scanner scanner = new
        Scanner(System.in)) {
            System.out.println("Ingrese su Nombre: ");
            java.lang.String nombreUsuario = scanner.next();
            System.out.println("Hola "  +  nombreUsuario);
        }

    }
    
}
