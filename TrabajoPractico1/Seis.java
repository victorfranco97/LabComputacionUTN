/*
6) Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule
el precio final con IVA. El IVA sera una constante que sera del 21%
 */
package TrabajoPractico1;

import java.util.Scanner;

/**
 *
 * @author VictorFranco
 */
public class Seis {
    public static void main(String[] args) {
        double precio, precioconIva;
        final double iva = 1.21;
        Scanner x = new Scanner(System.in);
        
        System.out.println("Ingrese el precio de producto (sin le IVA)");
        precio = x.nextDouble();
        
        precioconIva = (precio*iva);
        System.out.println("El precio del producto incluyendo ahora el IVA es de: "+precioconIva);
        
    }
}
