/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_temperatura2;

import java.util.Scanner;

/**
 *
 * @author alberto soto
 */
public class EVA1_11_TEMPERATURA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp, cel, kelvin;
        Scanner captu = new Scanner (System.in);
        System.out.print("Introduce la temperatura en Fahrenheit");
        temp = captu.nextDouble();
        cel = (temp - 32) / 1.8  ;// celcius
        kelvin = (temp - 32) * (5 / 9.0) + 273.15;//kelvin
        //5/9 da 0 //5/9.da 0.55
        //MOSTRAR RESULTADOS AL USUARIO 
        System.out.println(temp + "ºF = " + cel + "ºC");
        System.out.println(temp + "ºF = " + kelvin + "ºK");
    
    }
    
}
