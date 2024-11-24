/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeometricas.figuras;

/**
 *
 * @author carla
 */
public class Circulo {
    
    public double radio;

    public Circulo() {
        
    }

    public Circulo(double radio) {
        this.radio = radio;
        
    }
    
    public double calcularAreaCir(){
        return Math.PI*(radio * radio);
        
    }
    
    public double calcularPerimetroCir(){
        return 2* Math.PI*radio;   
   }
    
   
}
