/*
1- CASTEO: Codifique un programa que solicite el ingreso de un numero decimal y
asigne el mismo a una variable valorDecimal de tipo double, aplique las
operaciones de CASTING para convertir la variable a los siguientes tipos de
datos, short, int, long, String, float investigue las diferentes formas de lograr la
conversión. Muestre por pantalla el resultado de las conversiones.
 */
package TrabajoPractico2;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Uno {
    public static void main(String[] args) {
      double valorDecimal;
      Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un valor para castear");
        valorDecimal = sc.nextDouble();
        
        //conversion a short
        float numShort= (short)valorDecimal;
        System.out.println("El double casteado a short: "+numShort);
        //conversion a int
        int numInt= (int)valorDecimal;
        System.out.println("El double casteado a int: "+numInt);
        //conversion a long
        long numLong= (long)valorDecimal;
        System.out.println("El double casteado a long: "+numLong);
        //conversion a String
        String numString = String.valueOf(valorDecimal); 
        System.out.println("El double casteado a string: "+numString);
        //conversion a float
        float numFloat= (float)valorDecimal;
        System.out.println("El double casteado a f8loat: "+numFloat);
    }
           
}
