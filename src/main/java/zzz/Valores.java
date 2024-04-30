package zzz;
import java.util.Scanner;

    public class Valores {
        public static void main(String[] args) {
            int valor = obtenerValor();
            if (valor >= 0 && valor <= 10) {
                System.out.println("El valor introducido es: " + valor);
            } else {
                System.out.println("El valor introducido no está dentro del rango especificado.");
            }
        }

        public static int obtenerValor() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce un valor entre 0 y 10:");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, introduce un valor numérico.");
                scanner.next();
            }
            return scanner.nextInt();
        }
    }
