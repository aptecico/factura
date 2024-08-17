/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura;

/**
 *
 * @author German
 */
public class Calcular {
    private double cant;
    private double preci;
    /*
    Constructores y debe ser  sin parametros la 
    primera clase osea Calcular
    */
    //debe ser el mismo nombre del archivo
    public Calcular(){
           //inializar las variables
           setCant(0);
           setPreci(0);
    }
    public Calcular(double cant, double preci){
        //inicializar varibales
        this.setCant(cant);
        this.setPreci(preci);
    }
    
   //funcion para calcular el total de laventa
    public double calularVenta(){
        double total=0;
        total=cant*preci;
        return total;
    }
   
    

    public double getCant() {
        return cant;
    }

    public void setCant(double cant) {
        this.cant = cant;
    }

    public double getPreci() {
        return preci;
    }

    public void setPreci(double preci) {
        this.preci = preci;
    }
    
}
