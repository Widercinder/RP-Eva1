/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_formula_general;

import java.util.Scanner;

/**
 *
 * @author alberto soto
 */
public class EVA1_14_FORMULA_GENERAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c, resultado, resultado2; 
        
        Scanner captu = new Scanner(System.in);
        System.out.println("a =");
        a = captu.nextDouble();
        System.out.println("b =");
        b = captu.nextDouble();
        System.out.println("c =");
        c = captu.nextDouble();
        resultado = (-1*b  + Math.sqrt(b * b - (4.0 * a * c)  )) / (2 * a);
        resultado2 = (-1*b  - Math.sqrt(b * b - (4.0 * a * c)  )) / (2 * a);
        System.out.println("X1 = " + resultado);
        System.out.println("X2 = " + resultado2);
        
       
       
        
        
        
        
        
        
    }
    
}
