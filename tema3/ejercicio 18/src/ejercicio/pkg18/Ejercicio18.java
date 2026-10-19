/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg18;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int contraseña;
        int fallos=0;
        do{
            System.out.print("Introduce la contraseña: ");
            contraseña = entrada.nextInt();
            fallos++;
            if(contraseña==2011){
            System.out.println("Contraseña correcta.");
            }else{
            if(fallos==3){
            System.out.println("Error de acceso");
            }else{
            System.out.println("Contraseña incorrecta.");
            }
            }
        }while(contraseña!=2011&&fallos<3); 
    }
    
}
