/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicionpoo;

import javax.swing.JOptionPane;
/**
 *
 * @author Juan Osorio
 */
public class Joption {
      public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");
        JOptionPane.showMessageDialog(null, "Hola " + nombre + "!");
        
        int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas salir?");
        
        if (opcion == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Adiós 👋");
            System.exit(0);
        }
      }
}
