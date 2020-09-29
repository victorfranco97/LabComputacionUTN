/*
10- Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el
usuario lo pida y mostraremos el resultado por pantalla.
 */
package TrabajoPractico2;
import java.util.Scanner;
/**
 *
 * @author victorfranco
 */
public class Diez {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Escriba una frase");
        String frase = sc.nextLine();
        System.out.println("Queres cambiar la frase a \n 1. mayusculas \n 2. minusculas");
        int decision = sc.nextInt();
        
        switch (decision) {
            case 1:
                System.out.println(frase.toUpperCase());
                break;
            case 2:
                System.out.println(frase.toLowerCase());
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }
}
