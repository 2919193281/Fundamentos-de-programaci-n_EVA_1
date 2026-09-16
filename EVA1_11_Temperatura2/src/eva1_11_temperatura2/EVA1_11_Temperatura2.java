/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_temperatura2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_11_Temperatura2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tem, cel, kel;
        System.out.println("Temeratura a Fahernheit: ");
        Scanner captu = new Scanner(System.in);
        //Capturar los valores 
        tem = captu.nextDouble();
        //Calcular 
        cel = (tem - 32) / 1.8;
        kel = (tem -32) * (5/9.0) + 273.15;//Si divide por un entero te da como resultado cero 
        //Para dividir en decimal los numero tienen que ser decimal
        //Responder
        System.out.println( tem + "F  " + cel + "c  ");
        System.out.print( tem + "F  " + kel + "k  ");
       
        
        
       
        
        // TODO code application logic here
    }
    
}
