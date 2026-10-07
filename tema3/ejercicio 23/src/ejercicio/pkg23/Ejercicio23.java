/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg23;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        Scanner entrada= new Scanner (System.in);
            System.out.println("Introduce un numero");
            num1=entrada.nextInt();
        do{
           if (num1<= 1) {
                System.out.println("El numero que tiene que ser mayor a 1");
        
        }while(num1<=1);
        
        for(int num2=1;num2>=num1;num2++){
            System.out.println(num2);
            
        }
    
       
    
    
