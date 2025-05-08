/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante;
import java.util.Scanner;
/**
 *
 * @author Esteban Ricardo
 */
public class Restaurante {
    
    public static void main(String[] args) {
        
        //Escaner para pedir los datos del usuario
        Scanner Teclado = new Scanner(System.in);
        Registro registro = new Registro();
        String tipo;
        
        //Si se obtiene false se sigue ejecutando hasta tener una respuesta valida del usuario
        while (true) {
            System.out.print("¿Eres cliente o colaborador? ");
            tipo = Teclado.nextLine();

            if (registro.Tipo_usuario(tipo)) {
                registro.Bienvenida(tipo);
                break;
            } else {
                System.out.println("Tipo no válido. Por favor ingresa 'cliente' o 'colaborador'.");
            }
        }
        
        if (tipo.equalsIgnoreCase("cliente")){
            String seleccion;
            Menu menu = new Menu();
           
            while (true){
                System.out.println("¿Desea desayuno, almuerzo o cena?");
                seleccion = Teclado.nextLine();
                
                if (menu.Tipo_menu(seleccion)){
                    menu.menus(seleccion);
                    break;
                } else {
                    System.out.println("Menu no valido, intente de nuevo porfavor");
                }
            } 
            
        } else if ((tipo.equalsIgnoreCase("colaborador"))){
            Inventario inventario = new Inventario();
        }
        
    }
        
        
}

