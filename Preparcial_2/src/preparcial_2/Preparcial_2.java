/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preparcial_2;

import java.util.Scanner;
/**
 *
 * @author Esteban Ricardo
 */
public class Preparcial_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Escaner para pedir los datos del usuario
        Scanner Teclado = new Scanner(System.in);
        Registro registro = new Registro();
        String tipo;
        
        //Si se obtiene false se sigue ejecutando hasta tener una respuesta valida del usuario
        while (true) {
            System.out.print("¿Eres docente o estudiante? ");
            tipo = Teclado.nextLine();

            if (registro.tipo_usuario(tipo)) {
                registro.Bienvenida(tipo);
                break;
            } else {
                System.out.println("Tipo no válido. Por favor ingresa 'docente' o 'estudiante'.");
            }
        } 
    } 
}