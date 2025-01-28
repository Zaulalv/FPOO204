import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una palabra: ");
        String cadena_texto = sc.nextLine().toLowerCase();
        
        boolean esPalindromo = true;
        int longitud = cadena_texto.length();
        
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena_texto.charAt(i) != cadena_texto.charAt(longitud - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }
        
        if (esPalindromo) {
            System.out.println("La palabra es palíndromo");
        } else {
            System.out.println("La palabra no es palíndromo");
        }
        
        sc.close();
    }
}


