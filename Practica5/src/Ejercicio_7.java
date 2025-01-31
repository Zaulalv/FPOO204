import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de asteriscos en la base: ");
        int base = scanner.nextInt();
        int height = (base + 1) / 2;
        int i = 1;

        while (i <= height) {
            int spaces = height - i;
            int stars = 2 * i - 1;

            int j = 0;
            while (j < spaces) {
                System.out.print(" ");
                j++;
            }

            j = 0;
            while (j < stars) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }

        scanner.close();
    }
}
