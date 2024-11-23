/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeometricas.figuras;

/**
 *
 * @author jordy
 */
public class Rectangulo {
    public float base;
    public float altura;

    public Rectangulo() {

    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularAreaRec() {
        return base * altura;
    }

    public double calcularPerimetroRec() {
        return 2 * (base + altura);
    }
    
}
