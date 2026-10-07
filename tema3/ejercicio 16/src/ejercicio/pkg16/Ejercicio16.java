/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int num;
       int total=0;

        for(num=20;num<160;num++){
            if(num%2!=0){
                total++;
                System.out.println(num);
        
            }
        }
        System.out.println("Total de numeros impares: "+total);
        

    
}
}
