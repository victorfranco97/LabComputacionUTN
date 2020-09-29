/*
22- Suma los dígitos de un número ingresado por el usuario de forma recursiva.
Ejemplo: el usuario ingresa 1596
El programa debe sumar 1 + 5 + 9 + 6

 */
package TrabajoPractico2;

import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Veintidos {

    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero mayor a cero"));

        JOptionPane.showMessageDialog(null, suma(num));
    }

    static int suma(int num) {
        if (num == 0) {
            return 0;
        } else {
            return suma(num / 10) + num % 10;
        }
    }
}
