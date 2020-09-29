/*
codifique una función estática que reciba
como parámetro una fecha de tipo Date y retorne la fecha como una cadena.
public static String getFechaString(Date fecha){
……….
}
Cree una clase Principal que contenga un método main y haga uso de la función
getFechaString.
 */
package TrabajoPractico2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author victorfranco
 */
public class FuncionesPrograma {

    public static String getFechaString(Date fecha) {
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String fechaComoCadena =sdf.format(fecha);
        
        return fechaComoCadena;

    }
/*
18- En la clase FuncionesPrograma codifique una función estática que reciba como
parámetro 3 valores enteros, día, mes, anio y retorne la fecha de tipo Date
correspondiente.
public static Date getFechaDate(int día, int mes, int anio){
……….
}
En la clase Principal creada en el punto anterior haga uso de la función
getFechaDate.

 */
    public static Date getFechaDate(int dia, int mes, int anio) {
        Date fechaDate = new Date();

        fechaDate.setDate(dia);
        fechaDate.setMonth(mes - 1);
        fechaDate.setYear(anio - 1900);

        return fechaDate;
    }
}
