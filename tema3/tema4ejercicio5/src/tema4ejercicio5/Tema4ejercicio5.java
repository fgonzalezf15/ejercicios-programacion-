/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio5;

import java.util.Scanner;
import static tema4ejercicio5.Tema4ejercicio5.pedirNumero;

/**
 *
 * @author alumno
 */
public class Tema4ejercicio5 {
    
/**
 * Pedimos un número
 * @return 
 */
public static int pedirNumero(){
    Scanner entrada =new Scanner(System.in);
    System.out.println("Por favor, introduzca un numero");
    int num=entrada.nextInt();
    return num;
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int num=pedirNumero();
    
    if(num%2!=0){
    System.out.println("Es impar");
    } else if(num%2==0){
    System.out.println("Es par");
    }
    System.out.println("");
    }
}

