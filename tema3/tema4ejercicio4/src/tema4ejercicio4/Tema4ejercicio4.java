/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema4ejercicio4 {
  /**
   * pedimos un numero
   * @return 
   */
    public static int pedirNumero() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
/**
 * comparamos los numeros para cual es menor
 * @param n1
 * @param n2
 * @param n3
 * @return 
 */
    public static int menor(int n1, int n2, int n3) {
        if (n1<=n2&&n1<=n3){
            return n1;
        } else if(n2<=n3&&n2<=n1){
            return n2;
        }else{
            return n3;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int num1;
         int num2;
         int num3;

        System.out.println("Por favor, introduzca su primer numero ");
        num1=pedirNumero();

        System.out.println("Por favor, introduzca un segundo numero ");
        num2=pedirNumero();

        System.out.println("Por ultimo, introduzca un tercer numero ");
        num3=pedirNumero();
        
        System.out.println("El numero mayor de los introducidos es el "+menor
        (num1, num2, num3));
    }
    
}
