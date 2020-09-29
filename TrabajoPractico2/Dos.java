/*
 2- Si se asigna un valor a una variable fuera de rango (mayor de lo establecido)
¿Qué ocurre? ¿Existe alguna forma de resolverlo? Ejemplifique.
 */
package TrabajoPractico2;

/**
 *
 * @author victorfranco 
 */
public class Dos {
    public static void main(String[] args) {
       int num1 = 10000000;
       short num2 = (short) num1;
        System.out.println("El valor del int es "+num1 +" que esta fuera de rango del short ocasionando una perdida de datos quedando en" +num2);
    }
}
