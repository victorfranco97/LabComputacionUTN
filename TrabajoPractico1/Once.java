/*
11) Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te
pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá más la contraseña 
y mostrara un mensaje diciendo “Acceso Correcto”. Piensa bien en la condición de
salida (3 intentos y si acierta sale, aunque le queden intentos).

 */
package TrabajoPractico1;

/**
 *
 * @author dell
 */
import java.util.Scanner;

public class Once {

    public static void main(String[] args) {

        final String password = "imposible";
        String cadena;
        int intentos;
        Scanner x = new Scanner(System.in);

        intentos = 0;
        do {
            System.out.println("Ingrese la contraseña");
            cadena = x.nextLine();
            if (cadena.equals(password)) {
                intentos = 5;
            } else {
                intentos++;
            }
        } while (intentos < 3);

        if (intentos < 4) {
            System.out.println("Se paso de los 3 intentos, intente recordar mejor su contraseña");

        } else {
            System.out.println("Acceso correcto");
        }
    }

}
