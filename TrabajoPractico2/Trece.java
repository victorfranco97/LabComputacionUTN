/*
13- Pedir el ingreso de dos cadenas por por teclado, indicar si la segunda cadena se
encuentra dentro de la primera (usar indexOf o contains).
 */
package TrabajoPractico2;

import javax.swing.JOptionPane;

/**
 *
 * @author victorfranco
 */
public class Trece {

    public static void main(String[] args) {

        String cadena1 = JOptionPane.showInputDialog("Ingrese la cadena n°1");
        String cadena2 = JOptionPane.showInputDialog("Ingrese la cadena n°2");

        if (cadena1.contains(cadena2)) {
            JOptionPane.showMessageDialog(null, "La segunda cadena se encuentra dentro de la primera");
        } else {
            JOptionPane.showMessageDialog(null, "La segunda cadena NO se encuentra dentro de la primera");
        }
    }
}
