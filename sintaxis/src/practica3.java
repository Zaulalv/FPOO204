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

          System.out.println("Introduce tu nombre completo: ");
          String nombreCompleto = scn.nextLine();
          System.out.println(nombreCompleto.toLowerCase());
          System.out.println(nombreCompleto.toUpperCase());
          String[] palabras = nombreCompleto.split(" ");
          StringBuilder nombreCapitalizado = new StringBuilder();
          for (String palabra : palabras) {
              nombreCapitalizado.append(Character.toUpperCase(palabra.charAt(0)))
                                .append(palabra.substring(1).toLowerCase())
                                .append(" ");
          }
          System.out.println(nombreCapitalizado.toString().trim());


          /* Programa #3

          System.out.println("Introduce tu nombre:  ");
          String nombre = scn.nextLine();
          System.out.println(nombre.toUpperCase() + " tiene " + nombre.length() + " letras");
          */

          // Programa #4
          System.out.println("Introduce un entero X: ");
          int x = scn.nextInt();
          int suma = 0;
          for (int i = 1; i <= x; i++) {
              suma += i;
          }
          System.out.println("La suma de todos los enteros desde 1 hasta " + x + " es: " + suma);

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

           /*Programa #6 

           System.out.println("Introduzca una frase: ");
           String frase = scn.nextLine();

           StringBuilder sb = new StringBuilder(frase);

           System.out.println("Frase Original: " +frase);
           System.out.println("Frase al reves: " + sb.reverse().toString());
            */

    }
}
