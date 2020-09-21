/*
 3) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta,
multiplicación, división y módulo (resto de la división).
 */
package TrabajoPractico1;

import java.util.Scanner;

/**
 *
 * @author VictorFranco
 */
public class Tres {
    public static void main(String[] args) {
        int num1, num2;
        Scanner x = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num1 = x.nextInt();
        System.out.println("Segundo numero");
        num2 = x.nextInt();
        
        System.out.println("Su resultado de la suma es " + (num1+num2));
        System.out.println("Su resultado de la resta es " + (num1-num2));
        System.out.println("Su resultado de la multiplicacion es " + (num1*num2));
        System.out.println("Su resultado de la modulo es " + (num1%num2));
        if(num2 == 0){
            System.out.println("La division por cero no se puede realizar");
        }else System.out.println("Su resultado de la division es " + (num1/num2));
    }
          
}
