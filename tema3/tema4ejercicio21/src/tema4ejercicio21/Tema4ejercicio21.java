/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio21;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema4ejercicio21 {

    /**
     * Pedimos un número
     *
     * @return
     */
    public static int pedirNumero1() {
        System.out.println("Introduzca un número");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        return num1;
    }

    /**
     * pedimos un numero
     *
     * @param num1
     * @return
     */
    public static int pedirNumero2(int num1) {
        Scanner entrada = new Scanner(System.in);
        int num2;
        do {
            System.out.println("Introduzca un número mayor que " + num1);
            num2 = entrada.nextInt();
            if (num2 <= num1) {
            }
        } while (num2 <= num1);
        return num2;
    }

    /**
     * sumamos el total de los nûmeros
     *
     * @param num1
     * @param num2
     */
    public static void resultado(int num1, int num2) {
        int suma = 0;
        for (int num3 = num1; num3 <= num2; num3++) {
            if (num3 % 2 == 0) {
                suma = suma + num3;
            }
        }
        System.out.println("La suma de los números pares es: " + suma);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = pedirNumero1();
        int num2 = pedirNumero2(num1);

        resultado(num1, num2);
    }

}
