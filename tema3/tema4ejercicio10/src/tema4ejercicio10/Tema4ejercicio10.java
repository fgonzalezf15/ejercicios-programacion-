/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio10;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema4ejercicio10 {

    /**
    * Pedimos un número
    * @return 
    */
    public static int pedirNumero(){
    Scanner entrada =new Scanner(System.in);
    int num=entrada.nextInt();
    return num;
}
/**
 * Calculamos la tabla de multiplicar
 * @param num1
 * @param num2
 * @return 
 */
    public static String tablaMultiplicar(int num1, int num2){
        for(num2=0;num2<10;num2++){
            System.out.println(num1+"x"+num2+"="+(num1*num2));
        }
        return num1+"x"+num2+"="+(num1*num2);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca un numero para calcular su tabla de "
                + "multiplicar ");
        int num1=pedirNumero();
        int num2=0;
        
        System.out.println(tablaMultiplicar(num1,num2));
    }
    
}
