package zzz;

import java.util.Scanner;

public class Caracteres10 {
    public static void main(String[] args) {
        String input = obtenerCadena();
        verificarLongitud(input);
    }

    public static String obtenerCadena() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de 10 caracteres:");
        return teclado.nextLine();
    }

    public static void verificarLongitud(String cadena) {
        if (cadena.length() != 10) {
            System.out.println("La cadena no tiene 10 caracteres.");
        } else {
            System.out.println("La cadena introducida es: " + cadena);
        }
    }
}
