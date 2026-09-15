/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_operaciones;

/**
 *
 * @author alberto soto
 */
public class EVA1_7_OPERACIONES {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
               //EL TIPO DE DATO DETERMINA LAS OPERACIONES
    //ENTEROS,REALES,CADENAS,LOGICOS,ETC.
    //EXPRESÍON:
    //VALORES
    //VARIABLES
    //OPERADORES
    //FUNCIONES
    //QUE SE EVALUAN PARA OBTENER UN RESULTADO
    //OPERACIONES CON NÚMEROS
    //ARITMÉTICAS:
    int suma, val1, val2;//declaro 3 variables del mismo tipo
    //ASIGNACION;PONER UN VALOR A UNA VARIABLE
    //operador--simbolo que trabaja SOBRE identificadores.
    //= asignación -->pone un valor
    //== --->comparación
    val1 = 100; //asignar el valor de 100 dentro de la variable val1
    val2 = 50; 
    suma =val1 + val2; //expresión, asignar la variable suma a la operación entre val1 y val 2
            //+-->esta entre dos enteros, se interpreta como que los debe sumar
    System.out.print("val1 =");
    System.out.println(val1);
    System.out.print("val2 =");        
    System.out.println(val2);
    System.out.print("suma =");
    System.out.println(suma);
   
    
   //OPERACIONES RESPETAN REGLAS MATEMATICAS
   //MULTIPLICACION
   int multi;
   multi = val1 * val2;
   System.out.print("Multiplicación = ");
   System.out.println(multi);
   //división
   // / --> operación de división
   int divi;
   divi = val1 / val2;
   System.out.print("Division = ");
   System.out.println(divi);
   val1 = 10;
   val2 = 3;
   divi = val1 / val2;
   System.out.print("val1 =");
   System.out.println(val1);
   System.out.print("val2 =");        
   System.out.println(val2);
   System.out.print("División =");
   System.out.println(divi);
   double resu;
   resu = val1 / val2;
   System.out.print("Resu =");
   System.out.println(resu);
   
   double val2copia;
   val2copia = 3;
   resu = val1 / val2copia;
   System.out.print("Resu =");
   System.out.println(resu);
    }
    
}
