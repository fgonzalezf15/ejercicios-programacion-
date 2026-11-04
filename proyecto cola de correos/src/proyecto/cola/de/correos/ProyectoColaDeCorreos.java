/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.cola.de.correos;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class ProyectoColaDeCorreos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int opcion;
     
     do{
         Scanner entrada = new Scanner(System.in);
            System.out.println("MENU");
            System.out.println("1.enviar");
            System.out.println("2.recoger");
            System.out.println("3.generar lote de tickets");
            System.out.println("4.salir");

            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                int envio =(int) (Math.random() * 100 +1) ;
                System.out.println(envio);
                case 2:
                int recoger =(int) (Math.random() * 100 +1) ;
                System.out.println(recoger);
                case 3:
               
                case 4:
                System.out.println("Saliendo del programa");
                default:
                System.out.println();
            }
        }while(opcion!=4);
            
    }

}
    
    

