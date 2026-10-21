/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio2;

import java.util.Scanner;
import static tema4ejercicio2.Tema4ejercicio2.pedirNumero;
import static tema4ejercicio2.Tema4ejercicio2.sumar;

/**
 *
 * @author alumno
 */
public class Tema4ejercicio2 {
    
    /**
     * pedimos un número
     * @return 
     */
public static int pedirNumero(){
    Scanner entrada =new Scanner(System.in);
    System.out.println("Por favor, introduzca un numero");
    int num=entrada.nextInt();
    return num;
}
/**
 * suma los números dados
 * @param num1
 * @param num2
 * @return resultado
 */
public static int sumar(int num1, int num2){
        int resultado=num1+num2;
        return resultado;

}
/**
 * multiplica los números dados
 * @param num1
 * @param num2
 * @return resultado
 */
public static int multiplicar(int num1, int num2){
    int resultado=num1*num2;
    return resultado;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1=pedirNumero();
        int num2=pedirNumero();
        
        if(num1<=10){
            int resultado=sumar(num1,num2);
            System.out.println("La operación que se realizó es sumar y el resultado es "+resultado);
        }else if(num1>10){
            int resultado=multiplicar(num1,num2);
            System.out.println("La operación que se realizó es producto y el resultado es "+resultado);
        
        }
    }

}
