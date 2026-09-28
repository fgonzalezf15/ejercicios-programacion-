/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int tiempo;
        int resto;
        int calculo1;
        int calculo2;
        int calculo3;
        int calculo4;
        
        System.out.println("Porfavor, introduzca un número de segundos");
        tiempo=entrada.nextInt();
        
        calculo1=tiempo/86400;
        resto=tiempo%86400;
        
        calculo2=resto/3600;
        resto=resto%3600;
        
        calculo3=resto/60;
        
        calculo4=resto%60;
        
        System.out.println(tiempo+" segundos hacen un total de: "
        +calculo1+ "días,"+calculo2+"horas,"+calculo3+"minuto y "+calculo4+
                "segundos");
        
        
        // TODO code application logic here
    }
    
}
