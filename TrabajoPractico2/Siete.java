/*
7- Solicite el ingreso de una cadena y determine el tamaño de la misma y cuantas
vocales tiene en total (recorre el String con charAt)
 */
package TrabajoPractico2;
import java.util.Scanner;
/**
 *
 * @author victorfrano
 */
public class Siete {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese una cadena de texto");
        String cadena = sc.nextLine();
        int contador = 0;
        cadena = cadena.toUpperCase();
        for (int x = 0; x < cadena.length(); x++) {
            if ((cadena.charAt(x) == 'A') || (cadena.charAt(x) == 'E') || (cadena.charAt(x) == 'I') || (cadena.charAt(x) == 'O') || (cadena.charAt(x) == 'U')||(cadena.charAt(x) == 'a') || (cadena.charAt(x) == 'e') || (cadena.charAt(x) == 'i') || (cadena.charAt(x) == 'o') || (cadena.charAt(x) == 'u')) {
                contador++;
            }
        }
        System.out.println("El tamaño del String es de: "+cadena.length() );
        System.out.println("La cantidad de vocales es de: "+contador);
    }
}
