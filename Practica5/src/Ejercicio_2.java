import java.util.*;

public class Ejercicio_2 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");

        int numero = scanner.nextInt();
        for (int i = numero; i > 0; i--) {
            if (i > 1) {
                System.out.print(i + ", ");
            }
        }

    }
}
