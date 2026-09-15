/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7operacónes;

/**
 *
 * @author bisonte
 */
public class EVA1_7OPERACÓNES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EL TIPO DE DATO DETEMINA LAS OPERACIÓNES
        //ENTEROS, REALES, CADENAS, LOGICOS
        //EXPRECIÓN:
        //VALORES 
        //OPERADORES
        //FUNCIONALES
        //QUE SE EVALUA PARA OBTENER UN RESULTADO
        //OPERACÓN CON NUMEROS 
        //ARITMETICO
        int suma, valor1, valor2; //declara 3 variables con un solo tipo
        //OPERDADOR --> SIMBOLO QUE TRABAJA SOBRE IDENTIFICADORES
        //  = --> ASIGNACION --> PONE UN VALOR
        // == --> comparacion 
        valor1 = 100; //asignamos el valorde 100 a la variable valor1
        valor2 = 50;
        suma = valor1 + valor2; // Exprecion, asignar a la variable suma la operacion de valor1 y valor2
        // + --> esta entre enteros, se identifica como que los debe sumar
        System.out.print("Valor 1: ");
        System.out.println(valor1);
        System.out.print("Valor 2 : ");
        System.out.println(valor2);
        System.out.print("Suma : ");
        System.out.println(suma);
        //
        //
        //
        int mult; 
        mult = valor1 * valor2;
        System.out.print("Multiplicacion : ");
        System.out.println(mult);
        //
        //
        int div;
        div = valor1 / valor2;
        System.out.print("Dividimos : ");
        System.out.println(div);
        valor1 = 10;
        valor2 = 3;
        
        System.out.print("Valor 1 = ");
        System.out.println(valor1);
        System.out.print("Valor 2 = ");
        System.out.println(valor2);
        
        div = valor1 / valor2;
        System.out.print("Dividimos = ");
        System.out.println(div);
        double resu;
        resu = valor1 / valor2;
        System.out.print("Resultado = ");
        System.out.println(resu);
        double valor2copia;
        valor2copia = 3;
        resu = valor1 / valor2copia;
        System.out.print("Resultado = ");
        System.out.println(resu);
        
    }
    
}
