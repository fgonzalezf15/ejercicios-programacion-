/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg24;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        int num;
        int contador=0;
        do{
        System.out.print("Introduce un numero mayor que 0 ");
        num=entrada.nextInt();
        if(num <= 0){
        System.out.println("Error, introduce un numero mayor que 0");
        }
        }while(num<=0);
        for(int num1=1;num1<=num;num1++){
        if(num1%3==0){
        System.out.println(num1);
        contador++;
        }
        }
    System.out.println("Total de numeros mostrados: "+contador);
    }
    
}
