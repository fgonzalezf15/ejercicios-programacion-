/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author alumno
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int num;
       int total=0;

        for(num=17;num<139;num++){
            if(num%2==0){
                total=total+num;
                System.out.println(num);
        
            }
        }
        System.out.println("Total de nÚmeros pares: "+total);
        
        
    }
    
}
