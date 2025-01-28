import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {

        
        String password = "saul12345";
        
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la contraseña: ");
        String userInput = scanner.nextLine();
        
       
        if (password.equalsIgnoreCase(userInput)) {
            System.out.println("La contraseña es correcta ACCESO PERMITIDO");
        } else {
            System.out.println("La contraseña es incorrecta ACCESO DENEGADO");
        }
        
    }
}
