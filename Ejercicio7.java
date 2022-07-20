//Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas.
//Sin uso de métodos o librerías que realicen toUppercase().

public class Ejercicio7 {
    public static void main(String args[]) {
        String input = " hola";
        System.out.println("Ingrese Texto: " + input);
        char strArr[] = input.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] >= 'a' && strArr[i] <= 'z') {
                strArr[i] = (char) ((int) strArr[i] - 32);
            }
        }
        System.out.print("Texto: ");
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]);
        }
    }
}