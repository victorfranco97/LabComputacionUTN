/*
Cree una clase FuncionesPrograma y codifique una función estática que reciba
como parámetro una fecha de tipo Date y retorne la fecha como una cadena.
public static String getFechaString(Date fecha){
……….
}
Cree una clase Principal que contenga un método main y haga uso de la función
getFechaString.
 */
package TrabajoPractico2;

import java.util.Date;

/**
 *
 * @author victorfranco
 */
public class Diecisiete {

    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println(FuncionesPrograma.getFechaString(fecha));
    }

}
