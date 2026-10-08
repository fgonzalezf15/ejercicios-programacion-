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
    int total = 0;
        for(int num=17;num<139;num+=2){
            if(num%2==0){
                total++;
                System.out.println(num);
        
            }
        }
        
        System.out.println("Total de numeros pares: "+total);
    }
    
}
