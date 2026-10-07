/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg15;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
        int num1;
        System.out.println("Introduzca un numero para calcular su tabla "
                + "de multiplicar: ");
        num1=entrada.nextInt();
        
            for(int num2=0;num2<=10;num2++){
            System.out.println(num1+"x"+num2+"="+(num1*num2));
        }
        
    }
}
