/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_temperatura;

import java.util.Scanner;

/**
 *
 * @author alberto soto
 */
public class EVA1_10_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp, far, kelvin;
        Scanner captu = new Scanner(System.in);
        //SOLICITAR LOS DATOS AL USUARIO
    
        System.out.print("Introduce la temperatura en Centigrado");
        temp = captu.nextDouble();
        far = temp * 1.8 + 32  ;// grados farenheit
        kelvin = temp + 273.15;//kelvin
        //MOSTRAR RESULTADOS AL USUARIO 
        System.out.println(temp + "ºC = " + far + "ºF");
        System.out.println(temp + "ºC = " + kelvin + "ºK");
    
    //HACER CALCULO
    //MOSTRAR RESULTADOS AL USUARIO
    
        
        
        
    }
    
}
