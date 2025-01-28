import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdusca edad: ");
        int edad = scanner.nextInt();

        
        if (edad < 4) {
            System.out.println("La entrada es gratis.");
        } else if (edad >= 4 && edad <= 18) {
            System.out.println("Favor de pagar $110");
        } else {
            System.out.println("Favor de pagar $190");
        }
        
    }
}
