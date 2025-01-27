import java.util.Scanner;

public class practica3 {
    
    public static void main(String[] args) {

         Scanner scn = new Scanner(System.in);

         /*Programa #1

         System.out.println("Ingrese numero de horas trabajadas: ");
         int horasTrabajadas = scn.nextInt();

         System.out.println("Ingrese coste por hora tarbajada: ");
         double costeHora = scn.nextDouble();

         System.out.println("Usted cobrara: " + horasTrabajadas * costeHora);

          */

         /*Programa #2

         System.out.println("Ingrese sus primeros dos nombres: ");
         String nombres = scn.nextLine();

         System.out.println("Ingrese su apellido paterno: ");
         String apellidoPaterno = scn.nextLine();

         System.out.println("Ingrese su apellido materno: ");
         String apellidoMaterno = scn.nextLine();
          */

          /*Prigrama #5

          int payaso, muñeca;
          payaso = 112;
          muñeca = 75;

          System.out.println("Ingrese numero de payasos por paquete: ");
          int numPayasos = scn.nextInt();

          System.out.println("Ingresa el numero de muñecas por paquete: ");
          int numMuñecas = scn.nextInt();

          int pesoTotal = (numPayasos * payaso) + (numMuñecas * muñeca);
          System.out.println("El total de peso del paquete es de: " + pesoTotal + " gramos");
           */

           //Programa #6 

           System.out.println("Introduzca una frase: ");
           String frase = scn.nextLine();

           StringBuilder sb = new StringBuilder(frase);

           System.out.println("Frase Original: " +frase);
           System.out.println("Frase al reves: " + sb.reverse().toString());

    }
}
