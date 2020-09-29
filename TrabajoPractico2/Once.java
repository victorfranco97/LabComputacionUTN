/*
11- Pedir dos palabras por teclado, indicar si son iguales. (equals, compareTo,
compareToIgnoreCase)
 */
package TrabajoPractico2;

import javax.swing.JOptionPane;

/**
 *
 * @author victorfranco
 */
public class Once {

    public static void main(String[] args) {

        String palabra1 = JOptionPane.showInputDialog("Ingrese la palabra n°1");
        String palabra2 = JOptionPane.showInputDialog("Ingrese la palabra n°2");

        JOptionPane.showMessageDialog(null, "Vamos a comparar usando el metodo \"equals\", el cual compara segun el contenido de cada String para ver si son exactamente iguales ");
        if (palabra1.equals(palabra2)) {
            JOptionPane.showMessageDialog(null, "Usando el metodo \"equals\", las dos palabras son exactamente iguales ");
        } else {
            JOptionPane.showMessageDialog(null, "Usando el metodo \"equals\", las dos palabras NO son exactamente iguales ");
        }

        JOptionPane.showMessageDialog(null, "Vamos a comparar usando el metodo \"compareTo\", comparando los códigos ASCII \n de cada letra de ambas cadenas hasta que se encuentre alguna diferencia \n o hasta que se acabe la cadena por lo que ordena los \n strings alfabéticamente en principio aunque si tienen \n letras con acentos o letras mayúsculas y minúsculas no lo hace correctamente \n porque compara los códigos ASCII. ");
        if (palabra1.compareTo(palabra2) == 0) {
            JOptionPane.showMessageDialog(null, "Usando el metodo \"compareTo\", las dos palabras son iguales");
        } else {
            JOptionPane.showMessageDialog(null, "Usando el metodo \"compareTo\", las dos palabras NO son  iguales ");
        }

        JOptionPane.showMessageDialog(null, "Vamos a comparar usando el metodo \"compareToIgnoreCase\", el cual compara ignorando las mayusculas y minusculas ");
        if (palabra1.compareToIgnoreCase(palabra2) == 0) {
            JOptionPane.showMessageDialog(null, "Usando el metodo \"compareToIgnoreCase\", las dos palabras son iguales");
        } else {
            JOptionPane.showMessageDialog(null, "Usando el metodo \"compareToIgnoreCase\", las dos palabras NO son  iguales ");
        }
    }

}
