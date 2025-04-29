/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encuesta_clase;
import java.util.Scanner;   //Se importa el Scanner para usarlo
/**
 *
 * @author Esteban Ricardo y Juan Osorio
 */
public class Encuesta_Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Datos = new Scanner(System.in);    //Se inicia el Scanner con el nombre Datos
        
        System.out.println("-Ingrese su nombre");    //Se piden y guardan los diferentes tipos de datos
        String nombre = Datos.nextLine();
        
        System.out.println("-Ingrese su carrera");
        String carrera = Datos.nextLine();
        
        System.out.println("-Ingrese su edad");
        Integer edad = Integer.valueOf(Datos.nextLine());    
        
        System.out.println("-Ingrese su numero");
        Long numero = Long.valueOf(Datos.nextLine());    //Se coloca long puesto que el telefono supera buffer del int 

        System.out.println("--------------------------------------------------");
        System.out.println("|             Datos antes del cambio             |"); 
        System.out.println("|------------------------------------------------|");
        System.out.println("|     Su nombre es: "+ nombre );           //Se muestran los resultados obtenidos
        System.out.println("|     Su carrera es: "+ carrera );
        System.out.println("|     Su edad es: "+ edad );
        System.out.println("|     Su telefono es: "+ numero );
        System.out.println("--------------------------------------------------");

                            //Se realizan los cambios deseados: 
        double edaddouble = edad.doubleValue();    //Se convierte edad de integer a double

        String numeroStr = String.valueOf(numero);    //Se convierte el numero de long a string 

        System.out.println("--------------------------------------------------");
        System.out.println("|            Datos despues del cambio            |"); 
        System.out.println("|------------------------------------------------|");
        System.out.println("|             Su nombre en Ascii es:             |");
        for(int i = 0; i < nombre.length(); i++){      //Se inicia en 0 para que empieze de la ubicacion 0 del nombre
            char letra = nombre.charAt(i);      //Para acceder a cada letra desde la ubicacion 0 hasta la ultima
            int ascii = (int) letra;      // Se convierten los char del nombre a int con "cast"((int) -> letra) y se guardan en la variable ascii 
        System.out.println("|     Letra: " + letra + "  Valor Ascii --> " + ascii);    //Se muestra caracter por caracter
        }
        System.out.println("|     Su carrera en : " + carrera);    //Se muestran todos los cambios
        System.out.println("|     Su edad en double: " + edaddouble);
        System.out.println("|     Su numero en string: " + numeroStr);
        System.out.println("--------------------------------------------------");
    }
}