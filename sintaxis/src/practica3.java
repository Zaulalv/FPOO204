import java.util.Scanner;

public class practica3 {
    
    public static void main(String[] args) {
        
         Scanner scn = new Scanner(System.in);

         System.out.println("Ingrese numero de horas trabajadas: ");
         int horasTrabajadas = scn.nextInt();

         System.out.println("Ingrese coste por hora tarbajada: ");
         double costeHora = scn.nextDouble();

         System.out.println("Usted cobrara " + horasTrabajadas * costeHora);

    }
}
