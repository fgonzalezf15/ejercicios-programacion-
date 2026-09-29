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
        int dias;
        int horas;
        int minutos;
        int segundos;
        
        System.out.println("Porfavor, introduzca un número de segundos");//pedimos que ponga un numero de segundos
        tiempo=entrada.nextInt();
        
        dias=tiempo/86400;
        resto=tiempo%86400;// con esto calculamos los dias y con el resto lo usamos para calcular las horas
        
        horas=resto/3600;// con esto calculamos las horas y con el resto de esta lo usamos para calcular los minutos y las horas
        resto=resto%3600;
        
        minutos=resto/60;
        
        segundos=resto%60;
        
        System.out.println(tiempo+" segundos hacen un total de: "
        +dias+ "días,"+horas+"horas,"+minutos+"minuto y "+segundos+
                " segundos");// dependiendo del numero de segundos tendremos la respuesta despues de hacer los calculos e indicamos en que apartado va cada uno de los resultados
        
        
        // TODO code application logic here
    }
    
}
