/*
12- Dada una cadena, extraer la cuarta y quinta letra usando el método substring.
 */
package TrabajoPractico2;

import javax.swing.JOptionPane;

/**
 *
 * @author victorfranco
 */
public class Doce {

    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Ingrese una frase para extraer su 4ta y 5ta letra");

        String subCadena = frase.substring(3, 5);
        JOptionPane.showMessageDialog(null, "La 4ta y 5ta letra son: " +subCadena);
        
    }
}
