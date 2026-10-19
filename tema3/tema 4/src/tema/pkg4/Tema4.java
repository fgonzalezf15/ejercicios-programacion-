/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg4;

import Operaciones.Operaciones;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema4 {
    /**
     * metodo que escribe por pantalla "hola, mundo"
     */
public static void saludar(){
    System.out.println("Hola, mundo");
}
/**
 * metodo que pide un núnero al usuario
 * @return número que escribe el usuario
 */
public static int pedirNumero(){
    Scanner entrada =new Scanner(System.in);
    System.out.println("numero ");
    int num=entrada.nextInt();
    return num;
}

/**
 * multiplica los dos números dados por el usuario
 * @param num1
 * @param num2
 * @return el resultado
 */
public static int multiplicar(int num1,int num2){
    return num1*num2;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        saludar();
        
        
        int num1=pedirNumero();
        int num2=pedirNumero();
        
       int resultado=multiplicar(num1,num2);
            System.out.println("El resultado es "+resultado);
            System.out.println(multiplicar(num1,num2));
            
            System.out.println("Multiplicar pasando método por el parámetro");
            System.out.println(multiplicar(pedirNumero(),pedirNumero()));
            
            resultado=Operaciones.sumar(num1,num2);
            
            System.out.println(resultado);
            
    }
    
}
