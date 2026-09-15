/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_captura_2;

import java.util.Scanner;

/**
 *
 * @author alberto soto
 */
public class EVA1_5_CAPTURA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DECLARE LAS VARIABLES
        String nombre;
        int edad;
        double salario;
        //scanner
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura el nombre del usuario:");
        nombre = captu.nextLine();//Lee texto hasta el enter
        System.out.println("Captura la Edad:");
        edad = captu.nextInt();
        System.out.println("Captura el salario:");
        salario = captu.nextDouble();
        System.out.print("Nombre:");
        System.out.println(nombre);
        System.out.print("Edad:");
        System.out.println(edad);
        System.out.print("Salario:");
        System.out.println(salario);
        
    }
    
    
}
