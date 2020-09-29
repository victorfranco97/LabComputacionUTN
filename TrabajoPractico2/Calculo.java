/*
Cree una clase Calculo que contenga un método main, donde cree una
instancia de la clase OperacionMatematica, asigne 2 valores para las variables
de la instancia y ejecute la función aplicarOperacion, pasando como parámetro
primero “+”, después “-”, a continuación “*” y finalmente “/”. Muestre por
pantalla el resultado de las operaciones
 */
package TrabajoPractico2;

/**
 *
 * @author victorfranco
 */
public class Calculo {
    public static void main(String[] args) {
        
        OperacionMatematica operacion = new OperacionMatematica();
        
        operacion.setValor1(20);
        operacion.setValor2(10);
        
        System.out.println(operacion.aplicarOperacion("+"));
        System.out.println(operacion.aplicarOperacion("-"));
        System.out.println(operacion.aplicarOperacion("*"));
        System.out.println(operacion.aplicarOperacion("/"));
    }
}
