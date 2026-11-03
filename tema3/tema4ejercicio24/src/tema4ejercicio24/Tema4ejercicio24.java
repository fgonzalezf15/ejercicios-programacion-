/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio24;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema4ejercicio24 {

    static Scanner entrada = new Scanner(System.in);

    /**
     *
     * @return
     */
    public static int pedirNombre() {
        System.out.println("Introduzca su nombre");
        Scanner entrada = new Scanner(System.in);
        int nombre = entrada.nextInt();
        return nombre;
    }

    /**
     *
     * @return
     */
    public static int pedirEdad() {
        System.out.print("Introduce tu edad ");
        int edad = entrada.nextInt();
        return edad;
    }

    /**
     *
     * @param nombre
     * @param edad
     */
    public static void mayorDeEdad(int nombre, int edad) {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " no es mayor de edad.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nombre = pedirNombre();
        int edad = pedirEdad();
        mayorDeEdad(nombre, edad);
    }

}
