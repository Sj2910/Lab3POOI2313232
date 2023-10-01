/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author Alumno
 */
public class Circulo {
    
    private int radio;
    private Punto centro;
    private String color;
    
    
    //constructor
    
    public Circulo(int radio, Punto centro, String color) {
        this.radio= radio;
        this.centro= centro;
        this.color = color;
    
    }
    
    
    public double getArea(){
    return 2*Math.PI*radio;
    }
    
    public double getPerimetro(){
    return radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
    
    
    
    
    
  
   
    
    
    
    
    
    
}
