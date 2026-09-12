/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_vehiculo;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_6_Vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String marca;
        String modelo;
        int año;
        String color;
        int km;
        double precio;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Bienvenido, Por favor introduzca los datos que te pidan");
        System.out.println("Que marca de carro busca: ");
        marca = captu.nextLine();
        System.out.println("Que modelo: ");
        modelo = captu.nextLine();
        System.out.println("De que año: ");
        año = captu.nextInt();
        System.out.println("De que color desea el carro: ");
        color = captu.nextLine();
        System.out.println("La cantidad de kilometros recorridos");
        km = captu.nextInt();
        System.out.println("Cuanto es el precio");
        precio = captu.nextDouble();
        System.out.print("La marca es: ");
        System.out.println(marca);
        System.out.print("El modelo es: ");
        System.out.println(modelo);
        System.out.print("Del año: ");
        System.out.println(año);
        System.out.print("De color: ");
        System.out.println(color);
        System.out.print("Kilometros recorridos: ");
        System.out.println(km);
        System.out.print("Con el precio de: ");
        System.out.println(precio);
        
        // TODO code application logic here
    }
    
}
