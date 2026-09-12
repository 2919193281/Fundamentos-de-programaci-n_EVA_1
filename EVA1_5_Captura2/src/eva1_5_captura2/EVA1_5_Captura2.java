/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_captura2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_5_Captura2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        double salario;
        Scanner captu = new Scanner(System.in);
        //CAPTURAR
        System.out.println("Introduce tu nombre");
        nombre = captu.nextLine();
        System.out.print("edad");
        edad = captu.nextInt();
        System.out.print("Cuantos ganas ");
        salario = captu.nextDouble();
        System.out.print("Tu nomre es: " );
        System.out.print(nombre);
        System.out.print("Tu edad es: ");
        System.out.print(edad);
        System.out.print("Ganas: $");
        System.out.print(salario);
        
        
        
        
        
    }
    
}
