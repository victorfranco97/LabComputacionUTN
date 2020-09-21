/*
9) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que
desees
 */
package TrabajoPractico1;

/**
 *
 * @author victorfranco
 */
public class Nueve {
    public static void main(String[] args) {
        for(int num=0; num<=100; num++){
            if ((num%2==0)&(num%3==0)){
                System.out.println(num);
        }
        }
    }
}
