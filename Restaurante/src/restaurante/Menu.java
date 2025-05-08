/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author Esteban Ricardo
 */
public class Menu {
    
    public boolean Tipo_menu(String seleccion){
        return seleccion.equalsIgnoreCase("desayuno") || seleccion.equalsIgnoreCase("almuerzo")|| seleccion.equalsIgnoreCase("cena");
    }    
    
    public void menus(String seleccion){
        if (seleccion.equalsIgnoreCase("desayuno")){
            System.out.println("Menu desayuno");
        } else if (seleccion.equalsIgnoreCase("almuerzo")){
            System.out.println("Menu almuerzo");
        } else if (seleccion.equalsIgnoreCase("cena")){
            System.out.println("Menu cena");
        }
    }
}


