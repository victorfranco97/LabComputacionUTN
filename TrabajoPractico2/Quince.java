/*
- Indique que sucede si realizo la siguiente declaración de variable:
int numero = null;
¿Qué debo modificar para poder asignar null a la variable?
 */
package TrabajoPractico2;

/**
 *
 * @author dell
 */
public class Quince {
    public static void main(String[] args) {
        //int numero = null; //Me sale ahi un error de que "tipos incompatibles: no se puede convertir null en un int"
        // Para asignarlo a la variable hay que asignarlo al tipo de referencia: Integer que se usa para los enteros.
        //La clase Integer envuelve el tipo primitivo int en un objeto.
        
        Integer numero = null;
        System.out.println(numero);
        //salida: null
    }
}
