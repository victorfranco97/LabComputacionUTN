/*
5- Solicite el ingreso de un número y conviértalo a un String mediante
String.valueOf
 */
package TrabajoPractico2;
import java.util.Scanner;
/**
 *
 * @author victorfranco
 */
public class Cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese un numero para convertirlo a String");
        int num = sc.nextInt();
        
        String NumConvertido = String.valueOf(num);
        
        System.out.println("El numero pasado a String queda asi: "+NumConvertido);
    }
}
