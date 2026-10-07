/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int num1;
    int num2;
    int resultado;
    try{
        Scanner entrada=new Scanner (System.in);
        
        System.out.print("Introduce un numero: ");
        num1=entrada.nextInt();
        
        System.out.print("Introduce otro numero: ");
        num2=entrada.nextInt();
        
        resultado=num1/num2;
                
        System.out.print("El resultado seria: "+resultado);
        
    } catch(ArithmeticException e){
        System.out.println("Dato no valido");
    
    } finally{
        System.out.println("Bloque final"); 
        
    }
    }
    
}
