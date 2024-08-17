/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factura;

import java.util.Scanner;

/**
 *
 * @author German
 */
public class Factura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //declara funcion par aingresar por teclado
        Scanner leer=new Scanner(System.in);
        //delcalrar las variables
        double cantidad=0;
        double precio=0;
        double totalPagar=0;
        
        
        System.out.println("Ingrese cantidad de productos");
        cantidad=leer.nextDouble();
        System.out.println("Ingrese precio del producto");
        precio=leer.nextDouble();
        
        //================================
        Calcular fac1=new Calcular(cantidad, precio);
        totalPagar=fac1.calularVenta();
        System.out.println("El valor a pagar es: "+totalPagar);
        //================================
    }
    
}
