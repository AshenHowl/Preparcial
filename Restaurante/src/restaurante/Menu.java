/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;
import java.util.ArrayList; //Se importa ArrayList para tener las listas de la comida
import java.util.Scanner; //Se importa Scanner para que se pueda elegir las opciones de listas de comida
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
        
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        
        if (seleccion.equalsIgnoreCase("desayuno")){
            System.out.println("Menu de desayuno;");
            mostrarComidas(Desayuno);
            
            System.out.println("Seleccione una comida (1-3): ");
            int opcion = scanner.nextInt();
            total += Desayuno.get(opcion - 1).getprecio();
            
        } else if (seleccion.equalsIgnoreCase("almuerzo")){
            System.out.println("Menu almuerzo");
            mostrarComidas(Almuerzo);
            
            System.out.println("Seleccione una comida (1-3): ");
            int opcion = scanner.nextInt();
            total += Almuerzo.get(opcion - 1).getprecio();
            
        } else if (seleccion.equalsIgnoreCase("cena")){
            System.out.println("Menu cena");
            mostrarComidas(Cena);
            
            System.out.println("Seleccione una comida (1-3): ");
            int opcion = scanner.nextInt();
            total += Cena.get(opcion - 1).getprecio();
                    
        }
        
        System.out.println("Total a pagar: $ " + total);
    }
    
    private void mostrarComidas(ArrayList<Comida> menu){
        for (int i = 0;i< menu.size();i++){
                Comida comida = menu.get(i);
                System.out.println((i+1)+ comida.getnombre() + " - $" + comida.getprecio());
        }
    }
}


