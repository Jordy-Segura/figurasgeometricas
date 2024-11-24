/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeometricas.figuras;

/**
 *
 * @author carla
 */
public class Cuadrado {
    
    public double Lado;

    public Cuadrado() {
    }

    public Cuadrado(double Lado) {
        this.Lado = Lado;
    }
    
    public double calcularAreaCua(){
        return Lado * Lado ;
    }
    public double calcularPerimetroCua(){
        return 4 * Lado;
   
    }
    
    
    
    
}
