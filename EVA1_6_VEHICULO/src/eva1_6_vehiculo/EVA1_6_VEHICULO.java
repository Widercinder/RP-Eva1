/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_vehiculo;

import java.util.Scanner;

/**
 *
 * @author alberto soto
 */
public class EVA1_6_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String marca;
        String modelo;
        int year;
        String color;
        int kilometraje;
        double precio;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura la marca");
        marca = captu.nextLine();
        System.out.println("Captura el modelo");
        modelo = captu.nextLine();
        System.out.println("Captura el año");
        year = captu.nextInt();
        captu.nextLine();
        System.out.println("Captura el color:");
        color = captu.nextLine();
        System.out.println("Captura el kilometraje");
        kilometraje = captu.nextInt();
        System.out.println("captura el precio");
        precio = captu.nextDouble();
        
        System.out.print("Marca:");
        System.out.println(marca);
        System.out.print("Modelo:");
        System.out.println(modelo);
        System.out.print("Año:");
        System.out.println(year);
        System.out.print("Color:");
        System.out.println(color);
        System.out.print("Kilometraje:");
        System.out.println(kilometraje);
        System.out.print("Precio:");
        System.out.println(precio);
                              
               
        
            
        
        

        
        
        
        
        
        
        
    }
    
}
