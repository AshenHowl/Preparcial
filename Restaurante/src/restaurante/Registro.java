/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;
/**
 *
 * @author Esteban Ricardo
 */
public class Registro {
    
    //se valida si la persona es cliente o trabajor, en caso de que coinidca el valor se retorna true
    public boolean Tipo_usuario(String tipo){
        return tipo.equalsIgnoreCase("cliente") || tipo.equalsIgnoreCase("colaborador");
    }
    
    //si el boolean es true, da un mensaje de bienvenida 
    public void Bienvenida(String tipo){
        if (tipo.equalsIgnoreCase("cliente")){
            System.out.println("Bienvenido, tenemos todo para su antojo!");
        } else if (tipo.equalsIgnoreCase("colaborador")){
            System.out.println("Bienvenido colaborador");
        }
    }
}
    
    
