import java.util.*;

public class Ejercicio_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");

        int numero = scanner.nextInt();
        for (int i = 1; i <= numero; i += 2) {
            if (i > 1) {
                System.out.print(", ");
            }
            System.out.print(i);
        }
    }
}