import java.util.Scanner;

public class Ejercicio2Ex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número entre 200 y 400: ");
            numero = scanner.nextInt();
        } while (numero < 200 || numero > 400);

        System.out.println("Números pares entre " + numero + " y 400:"); 
        for (int i = numero; i <= 400; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
