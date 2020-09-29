/*
9- Recorre el String del ejercicio 6 y transforma cada carácter a su código ASCII.
Muéstralos en línea recta, separados por un espacio entre cada carácter.

 */
package TrabajoPractico2;

/**
 *
 * @author victorfranco
 */
public class Nueve {
    public static void main(String[] args) {
        String cadenaSeis = "La lluvia en Mendoza es escasa";
        cadenaSeis = cadenaSeis.toUpperCase();
        for (int i = 0; i < cadenaSeis.length() ;i++){
            System.out.print((int)cadenaSeis.charAt(i));
            System.out.print("  ");
           
        }
        
        
    }
}
