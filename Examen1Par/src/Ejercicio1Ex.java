import java.util.Scanner;

public class Ejercicio1Ex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int numero_entero = scanner.nextInt();

        while (numero_entero != 1) {
            System.out.print(numero_entero + " ");
            if (numero_entero % 2 == 0) {
                numero_entero /= 2;
            } else {
                numero_entero = numero_entero * 3 + 1;
            }
        }
        System.out.println(numero_entero);

    }

}
