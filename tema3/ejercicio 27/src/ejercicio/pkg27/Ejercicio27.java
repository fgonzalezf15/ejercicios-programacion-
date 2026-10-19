/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg27;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;       
        System.out.print("Introduzca el primer numero: ");
        num1=entrada.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        num2=entrada.nextInt();
        int opcion;
        do{
            System.out.println("MENU DE OPERACIONES");
            System.out.println("1.Sumar los numeros");
            System.out.println("2.Restar los numeros");
            System.out.println("3.Multiplicar los numeros");
            System.out.println("4.Dividir los numeros");
            System.out.println("5.Salir del programa");
            System.out.print("Seleccione una opcion ");

            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                System.out.println("La suma es "+(num1+num2));
                case 2:
                System.out.println("La resta es "+(num1-num2));
                case 3:
                System.out.println("La multiplicacion es:"+(num1*num2));
                case 4:
                try{
                int resultado=num1/num2;
                System.out.println("La division es "+resultado);
                }catch(ArithmeticException e){
                System.out.println("Error: no se puede dividir entre cero.");
                }
                case 5:
                System.out.println("Saliendo del programa...");
                default:
                System.out.println("Opcion incorrecta. Introduzca un numero del 1 al 5.");
            }
        }while(opcion!=5);
        
    }
    
}
