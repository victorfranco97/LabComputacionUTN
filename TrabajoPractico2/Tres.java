/*
3- Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos (100 -
999) y por medio del uso de las operaciones matemáticas módulo 10 y división
por 10 efectué la suma de los 3 dígitos del número. Ejemplo ingreso 563, salida
del algoritmo 14.
 */
package TrabajoPractico2;
import java.util.Scanner;
/**
 *
 * @author victorfranco
 */
public class Tres {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un numero de 3 digitos");
        int num = sc.nextInt();
        
        if ((num>=100)& (num<=999)) {
            int centena = num/100;
            int decena = (num%100)/10;
            int unidad = (num%10);
            
            int sumaDigitos = (centena + decena + unidad) ;
            System.out.println("La suma de los digitos es de: "+ sumaDigitos);
        }else {
            System.out.println("Su numero no es de 3 digitos o ingreso cualquiera");
        }
    }
}
