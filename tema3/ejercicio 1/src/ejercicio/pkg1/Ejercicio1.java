/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner entrada=new Scanner(System.in);
        int num1;
        System.out.println("Porfavor, introduzca un numero:");
        num1=entrada.nextInt();
        if(num1<=0){
         System.out.println("El numero introducido es negativo");
        }else if(num1>0){
         System.out.println(num1+"El numero introducido es positivo");
        }
        
    }
    
}
