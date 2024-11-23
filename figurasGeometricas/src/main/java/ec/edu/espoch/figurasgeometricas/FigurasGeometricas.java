/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.figurasgeometricas;

import ec.edu.espoch.figurasgeometricas.figuras.Rectangulo;
import ec.edu.espoch.figurasgeometricas.figuras.Triangulo;

/**
 *
 * @author jordy
 * @author carla
 */
public class FigurasGeometricas {

    public static void main(String[] args) {
        Rectangulo objRectangulo=new Rectangulo(4,6);      
        Triangulo objTriangulo=new Triangulo(8,5);
        
        
        System.out.println("\nRectángulo:");
        System.out.println("Área: " + objRectangulo.calcularAreaRec());
        System.out.println("Perímetro: " + objRectangulo.calcularPerimetroRec() );
        
        System.out.println("\nTriángulo Rectángulo:");
        System.out.println("Área: " + objTriangulo.calcularAreaTri());
        System.out.println("Perímetro: " + objTriangulo.calcularPerimetroTri());
        System.out.println("Hipotenusa: " + objTriangulo.calcularHipotenusa());
        System.out.println("Tipo de triángulo: " + objTriangulo.tipoTriangulo());
    }
}
