/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Dos {
    public static void main(String[] args) {
    //Con Scanner
        String nombre;
        Scanner x = new Scanner(System.in);
        nombre = x.nextLine();
        
        System.out.println("Bienvenido " + nombre); 
    //Con JOption
        String nombre2 = JOptionPane.showInputDialog("Ingrese un nombre a saludar");
        JOptionPane.showMessageDialog(null, "Bienvenido "+nombre2);
        
    }
}
