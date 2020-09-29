/*
21- Codifique un programa que solicite un número entero mayor a cero y que
mediante recursión sume todos los números números naturales desde el
número ingresado hasta 1.
Ejemplo: Ingreso 10
El programa debe sumar 10 + 9 + 8 +7 +6 + 5 + 4 + 3 + 2 + 1
 */
package TrabajoPractico2;

import javax.swing.JOptionPane;

/**
 *
 * @author victorfranco
 */
public class Veintiuno {

    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero mayor a cero"));
        JOptionPane.showMessageDialog(null, suma(num));
    }

    static int suma(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + suma(num - 1);
        }
    }
}
