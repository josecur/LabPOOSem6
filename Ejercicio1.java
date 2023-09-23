/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication27;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
        
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random valorRandom = new Random();
        Scanner in = new Scanner(System.in);
        
        int valor1 = valorRandom.nextInt(100)+1;
        int valor2 = valorRandom.nextInt(100)+1;
        int valorSuma = valor1 + valor2;
        int valorIngresado;
        
        try{
        System.out.println("¿Cual es la respuesta a siguiente problema?");
        System.out.println(valor1 + " + " + valor2 + " = " + "¿?");
        valorIngresado = in.nextInt();
        
        if (valorSuma == valorIngresado){
            System.out.println("!Correcto¡");
        }else{
            System.out.println("Disculpa respuesta equivocada. La respuesta correcta es " + valorSuma);
        }
        }catch(InputMismatchException e){
            System.out.println("No ha ingresado un numero");
        }
        
    }
    
}
