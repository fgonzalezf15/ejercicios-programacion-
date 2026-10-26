/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio12;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema4ejercicio12 {

    /**
     * Pedimos la contraseña al usuario
     *
     * @param contraseña
     */
    public static void pedirContraseña(int contraseña) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la contraseña: ");
        contraseña = entrada.nextInt();
    }
// Método para comprobar si la contraseña introducida es correcta

    public static boolean validarContraseña(String contraseña) {
        return contraseña.equals("DAW123");
    }

    /**
     * validamos la contraseña dada
     *
     * @param contraseña
     * @param fallos
     * @return
     */
    public static int resultado(int contraseña, int fallos) {
        do {
            if (contraseña == 2011) {
                System.out.println("Contraseña correcta.");
            } else {
                if (fallos == 3) {
                    System.out.println("Error de acceso");
                } else {
                    System.out.println("Contraseña incorrecta.");
                }
            }
        } while (contraseña != 2011 && fallos < 3);
        return contraseña;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=pedirContraseña();
        
    }
}
