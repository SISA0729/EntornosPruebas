import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SaliendoDeLaCrisis {
    public static void main(String[] args) {
        //mientras no introduzca un 0 seguimos pidiendo
        // un numero
        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();
        int n = teclado.nextInt();
        while (n != 0){
            String cadena = teclado.nextLine();
            String[] n1 = cadena.split(" ");
            System.out.println(Arrays.toString(n1));

        }


    }
}
