/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preparcial_2;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */

public class Registro {
    //se valida si la persona es cliente o trabajor, en caso de que coinidca el valor se retorna true
    public boolean tipo_usuario(String tipo){
        return tipo.equalsIgnoreCase("estudiante") || tipo.equalsIgnoreCase("docente");
    }
    
    //si el boolean es true, da un mensaje de bienvenida 
    public void Bienvenida(String tipo){
        if (tipo.equalsIgnoreCase("estudiante")){
            System.out.println("Bienvenido estudiante");
        } else if (tipo.equalsIgnoreCase("docente")){
            System.out.println("Bienvenido docente");
        }
    }
    
}
    
