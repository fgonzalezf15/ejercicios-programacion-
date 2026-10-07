/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control.de.excwpciones;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ControlDeExcwpciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        try{
        Scanner entrada=new Scanner (System.in);
        System.out.print("introduce tu edad");
        edad=entrada.nextInt();
        System.out.println("Tu edad es: "+edad);
        
        } catch (InputMismatchException e){
            System.out.println("Dato no valido, tienes que introducir un numero "
                    + "entero");
          
        }
        finally{
             System.out.println("bloque final");
        }
        
        
        
    }
    
}
