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
package TrabajoPractico2;

/**
 *
 * @author victorfranco
 */
public class Dieciocho {
    public static void main(String[] args) {
        
        System.out.println(FuncionesPrograma.getFechaDate(4, 5, 1988));
    }
}
