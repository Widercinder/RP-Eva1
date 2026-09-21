/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_circulo;

import java.util.Scanner;

/**
 *
 * @author alberto soto
 */
public class EVA1_13_CIRCULO {
    static final double PI = 3.1416;//CONSTANTE
static final String mensaje = ("radio ");
    
    public static void main(String[] args) {
        // TODO code application logic here
        double perimetro, area, volumen, radio;
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        radio = captu.nextDouble();
        perimetro = 2  * 3.1416 * radio;
        area = PI * radio * radio;
        volumen = (4 / 3.0) * Math.PI * Math.pow(radio, 3);
        
        System.out.println("El Perimetro del circulo es = " + perimetro + "cm");
        System.out.println("El Área del circulo es = " + area + "cm");
        System.out.println("El Volumen del circulo es = " + volumen + "cm");
        
        
        
  
        
        
    }
    
    
}
