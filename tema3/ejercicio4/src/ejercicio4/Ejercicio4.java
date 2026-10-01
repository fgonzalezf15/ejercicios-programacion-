/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
        int num1;
        int num2;
        int num3;
        int menor;
        System.out.println("Porfavor, introduzca el primer numero");
        num1=entrada.nextInt();
        System.out.println("Ahora, introduzca el segundo numero");
        num2=entrada.nextInt();
        System.out.println("Por último, introduzca un tercer numero");
        num3=entrada.nextInt();
        if(num1<=num2&&num1<=num3){
        menor=num1;
        }else if(num2<=num1&&num2<=num3){
        menor=num2;
        }else{
        menor=num3;
        }
        System.out.println("El número mayor de los introducidos es el "+ menor);
    }
    
}
