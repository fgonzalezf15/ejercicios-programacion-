/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;

/**
 *
 * @author alumno
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // Generamos un número aleatorio entre 1 y 100
        double aleatorio = Math.floor(Math.random() * 100 + 1);

        // Comprobamos si el número es par o impar
        if(aleatorio%2==0){
        System.out.println("El numero es: "+aleatorio);
        System.out.println("Numero par");
        }else{
        System.out.println("El numero es: "+aleatorio);
        System.out.println("Numero impar");
        }
        
    }
    
}
