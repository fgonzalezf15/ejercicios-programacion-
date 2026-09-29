/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        int num1;
        int num2;
        int suma;
        int multiplicacion;
        System.out.println("Porfavor, introduzca un numero");
        num1=entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero");
        num2=entrada.nextInt();
        if(num1<10){
        suma=num1+num2;
        System.out.println("La operación que se realizó es suma y el resultado es "+suma);
        } else if (num1>10){
        multiplicacion=num1*num2;
        System.out.println("La operación que se ralizó es la multiplicación y el resultado es "+multiplicacion);}
        
        
        
    }
    
}
