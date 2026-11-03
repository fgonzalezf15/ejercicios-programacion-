/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4ejercicio25;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class tema4ejercicio25 {
    /**
     * 
     * @return 
     */
     public static int pedirNumero1() {
        System.out.println("Introduzca un numero");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        return num1;
    }
     /**
      * 
      * @return 
      */
      public static int pedirNumero2() {
        System.out.println("Introduzca un numero mayor que 0");
        Scanner entrada = new Scanner(System.in);
        int num2 = entrada.nextInt();
        return num2;
    }
      /**
       * 
       * @param num1
       * @param num2 
       */
      public static void potencia(int num1, int num2) {
        if (num1==0&&num2<0){
            System.out.println("El segundo número tiene que ser mayor que 0");
        }else{
            double resultado=Math.pow(num1, num2);
            System.out.println(resultado);
        }
        
    }
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=pedirNumero1();
        int num2=pedirNumero2();
        potencia(num1,num2);
        
        
        
        
    }
    
}
