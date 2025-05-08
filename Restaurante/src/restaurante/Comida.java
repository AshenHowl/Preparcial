/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author juanr
 */
public class Comida {
    
    protected String nombre; //se usa protected para que los datos solo puedan ser usados por la clase y sus subclases
    protected double precio;
    
    public Comida(String nombre, double precio){
        this.nombre = nombre; //se usa this para asignar el valor del parametro al atributo del objeto
        this.precio = precio;
    }
    
    public String getnombre(){
        return nombre;
    
    }
    
    public double getprecio(){
        return precio;
    }
    
    public void mostrar(){
        System.out.println(nombre + " - $" + precio);
    }
}


       