/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_tenperatura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_10_Tenperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp, far, kel;
        Scanner captu = new Scanner(System.in);
        //Solisitar datos al usuario
        System.out.println("Introduce la temperatura en grados:  ");
        temp = captu.nextDouble();
        //Hacer calculo
        far = temp * 1.8 + 32;
        kel = temp + 273.15;  //Kelvin
        //Mostrar el resultado
        System.out.println(temp + "c  " + far + "F  ");//sumar cadena te texto 
        System.out.println(temp + "c  " + kel + "K  ");
        
        // TODO code application logic here
    }
    
}
