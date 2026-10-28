/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio16;

/**
 *
 * @author alumno
 */
public class Tema4ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double raiz=Math.sqrt(64);
        System.out.println("Raíz cuadrada de 64 es "+raiz);
        
        double elevado=Math.pow(8, 2);
        System.out.println("8 elevado al cubo es "+elevado);
        
        double exponencial=Math.exp(2);
        System.out.println("Exponencial de 2 es "+exponencial);
        
        double logaritmo= Math.log(2.71828);
        System.out.println("Logaritmo de 2,71828 es "+logaritmo);
        
        int num1=2;
        int num2=3;
        int mayor=Math.max(num1, num2);
        System.out.println("Menor valor entre 2 y 3 es "+mayor);
        
        double absoluto=Math.abs(-4.5);
        System.out.println("Valor absoluto de -4,5 es "+absoluto);
        
        double redondeando=Math.round(-4.5);
        System.out.println("Redondeando -4,5 con ROUND es "+redondeando);
        
        double seno=Math.sin(45);
        System.out.println("Seno de 45 grados es "+seno);
        
    }
    
}
