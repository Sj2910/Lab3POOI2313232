
import figuras.Circulo;
import figuras.Punto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Alumno
 */
public class TestPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Punto punto1= new Punto(0,0);
        punto1.setCoordenadax(2);
        punto1.setCoordenaday(3);
        
        
        
        
        Circulo circulo1 =new Circulo(2, punto1, "red");
        circulo1.setRadio(2);
        circulo1.setColor("red");
       
    }
    
}
