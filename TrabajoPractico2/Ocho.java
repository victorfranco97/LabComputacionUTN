/*
8- Reemplaza todas las a del String anterior por una e. (aplique replace)
 */
package TrabajoPractico2;

/**
 *
 * @author dell
 */
public class Ocho {
    public static void main(String[] args) {
        String i = "La lluvia en Mendoza es escasa";
        System.out.println("La cadena original es esta: "+i);
        String cadenaReemplazada = i.replace("a", "e");
        System.out.println(("La cadena reemplazando las \"a\" por \"e\" queda:")+cadenaReemplazada)   ;
        
    }
   
}
