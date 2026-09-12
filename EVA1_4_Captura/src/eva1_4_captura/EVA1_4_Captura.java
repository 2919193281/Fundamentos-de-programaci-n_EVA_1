/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_captura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_4_Captura {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Todo code application logic here
        //Si vamos a usar variables, se tiene que "Declarar" antes de usar
        //Declarar --> Crear la variable para el uso en el programa
        //Tipo_Dato Nombre_Identificador;
        //Usar nombres Significativos --> DEbe decir para que se usa
        String Nombre;//Declarar la variable
        
        System.out.println("Captura mi nombre");
        //Entrada de datos del teclado (JAVA)
        Scanner captu = new Scanner(System.in);//Otra variable --> captu de tipo Scanner
        // Capturar en una variable (Poner su valor) aASIGMNACION
        //escribiren la variable (poner un valor) ASIGNACION
        Nombre = captu.nextLine();
        System.out.print("El valor se ");
        System.out.print(Nombre);//Usa la variable --> Lectura
        
        
        
    }
    
}
