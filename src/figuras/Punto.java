/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author Alumno
 */
public class Punto {
    
    private double coordenadax;
    private double coordenaday;
    
    
    //constructor
    public Punto (double coordenadax, double coordenaday){
     this.coordenadax= coordenadax;
     this.coordenaday= coordenaday;
    }
    
    
    

    public double getCoordenadax() {
        return coordenadax;
    }

    public void setCoordenadax(double coordenadax) {
        this.coordenadax = coordenadax;
    }

    public double getCoordenaday() {
        return coordenaday;
    }

    public void setCoordenaday(double coordenaday) {
        this.coordenaday = coordenaday;
    }
    
    
    
    
    
    
    
}
