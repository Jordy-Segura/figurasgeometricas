/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeometricas.figuras;

/**
 *
 * @author jordy
 */
public class Triangulo {
    public float base;
    public float altura;

    public Triangulo() {
    }
    
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularAreaTri() {
        return (base * altura) / 2;
    }

    public double calcularPerimetroTri() {
        double hipotenusa = calcularHipotenusa();
        return base + altura + hipotenusa;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public String tipoTriangulo() {
        double hipotenusa = calcularHipotenusa();
        if (base == altura && altura == hipotenusa) {
            return "Equilátero";
        } else if (base == altura || base == hipotenusa || altura == hipotenusa) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}
