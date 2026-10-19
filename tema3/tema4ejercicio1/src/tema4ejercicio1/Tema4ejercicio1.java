/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema4ejercicio1 {
public static int pedirNumero(){
    Scanner entrada =new Scanner(System.in);
    System.out.println("Por favor, introduzca un numero");
    int num=entrada.nextInt();
        if(num<=0){
        System.out.println("El número introducido es negativo");
        }else if(num>0){
        System.out.println("El número introducido es positivo");
        }
    return num;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num=pedirNumero();

        }
    }

    

