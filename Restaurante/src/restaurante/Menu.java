/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;
import java.util.ArrayList;
/**
 *
 * @author Esteban Ricardo
 */
public class Menu {
    
    private final ArrayList<Comida> Desayuno;
    private final ArrayList<Comida> Almuerzo;
    private final ArrayList<Comida> Cena;
    
    public Menu(){
        Desayuno = new ArrayList<>();
        Almuerzo = new ArrayList<>();
        Cena = new ArrayList<>();
        
        Desayuno.add(new Comida("Café con pan", 3.50));
        Desayuno.add(new Comida("Huevos revueltos", 5.00));
        Desayuno.add(new Comida("Arepa con queso", 4.00));

        Almuerzo.add(new Comida("Arroz con pollo", 7.50));
        Almuerzo.add(new Comida("Pasta boloñesa", 8.00));
        Almuerzo.add(new Comida("Bandeja paisa", 9.00));

        Cena.add(new Comida("Hamburguesa", 6.50));
        Cena.add(new Comida("Pizza personal", 7.00));
        Cena.add(new Comida("Ensalada César", 5.50));
    }
   
    public boolean Tipo_menu(String seleccion){
        return seleccion.equalsIgnoreCase("desayuno") || seleccion.equalsIgnoreCase("almuerzo")|| seleccion.equalsIgnoreCase("cena");
    }    
    
    public void menus(String seleccion){
        if (seleccion.equalsIgnoreCase("desayuno")){
            System.out.println("Menu de desayuno;");
            mostrarComidas(Desayuno);
        } else if (seleccion.equalsIgnoreCase("almuerzo")){
            System.out.println("Menu almuerzo");
            mostrarComidas(Almuerzo);
        } else if (seleccion.equalsIgnoreCase("cena")){
            System.out.println("Menu cena");
            mostrarComidas(Cena);
                    
        }
    }
    
    private void mostrarComidas(ArrayList<Comida> menu){
        for (Comida comida : menu){
            comida.mostrar();
        }
    }
}


