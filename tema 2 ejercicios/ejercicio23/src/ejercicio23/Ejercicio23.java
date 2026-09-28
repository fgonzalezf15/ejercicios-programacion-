/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    System.out.println("Porfavor, introduzca el precio del modelo de ordenador "
            + "que desea comprar: ");
    
    float precio=entrada.nextFloat();
    System.out.println("¿Cuántas unidades quiere llevarse?");
    
    int unidades=entrada.nextInt();
    float total=precio*unidades;
    System.out.println("El precio total de su compra es de: "+total+ " Euros");
    
           

    
        
    }
    
}
