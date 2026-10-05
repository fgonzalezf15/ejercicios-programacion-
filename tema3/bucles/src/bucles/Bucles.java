/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int indice=0;
        while(indice<10){
            System.out.println(indice);
            indice++;
        }
        do{
        System.out.println(indice);
        indice++;
        }while(indice<10);
        
        for(indice=0;indice<10;indice++)
        System.out.println(indice);
        
        
        //menus
        int opc=0;
        Scanner entrada=new Scanner (System.in);
        do{
            System.out.println("MENU");
        System.out.println("1. Ver catalogo");
        System.out.println("2. Solicitar libro");
        System.out.println("3. Devolver libro");
        System.out.println("4. Salir");
        System.out.println("Elije una opción");
       
        //pedir dato
        opc=entrada.nextInt();
        
        //switch
        switch(opc){
            case 1 ->System.out.println("Has elegido ver el catalogo");
            case 2 ->System.out.println("");
        }
        
        }while(opc!=4);
    }
}
