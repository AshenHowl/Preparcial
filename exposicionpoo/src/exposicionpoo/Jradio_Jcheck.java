/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exposicionpoo;

import javax.swing.*;  // Importa las clases de la interfaz gráfica Swing
import java.awt.event.*; // Importa las clases para manejar eventos (como clics)

/**
 *
 * @author Esteban Ricardo
 */
public class Jradio_Jcheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea la ventana principal
        JFrame ventana = new JFrame("Ejemplo JCheckBox y JRadioButton");
        ventana.setSize(400, 200); // Tamaño de la ventana (ancho x alto)
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra el programa al cerrar la ventana
        ventana.setLayout(null); // Desactiva el layout automático (posición manual)

        // ----- JCheckBox -----
        JCheckBox checkBox = new JCheckBox("¿Recibir notificaciones?");
        checkBox.setBounds(20, 20, 200, 30); // Posición y tamaño del checkbox
        ventana.add(checkBox); // Agrega el checkbox a la ventana

        // ----- JRadioButtons -----
        JRadioButton radioHombre = new JRadioButton("Hombre");
        JRadioButton radioMujer = new JRadioButton("Mujer");

        radioHombre.setBounds(20, 60, 100, 30); // Posición del radio "Hombre"
        radioMujer.setBounds(20, 90, 100, 30); // Posición del radio "Mujer"

        // Agrupamos los radio buttons para que solo uno se pueda seleccionar a la vez
        ButtonGroup grupoGenero = new ButtonGroup();
        grupoGenero.add(radioHombre);
        grupoGenero.add(radioMujer);

        // Agregamos los radio buttons a la ventana
        ventana.add(radioHombre);
        ventana.add(radioMujer);

        // ----- Botón para mostrar el estado -----
        JButton boton = new JButton("Mostrar selección");
        boton.setBounds(20, 130, 200, 30); // Posición del botón
        ventana.add(boton);

        // Acción al presionar el botón
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String mensaje = "";

                // Verifica si el checkbox está seleccionado
                if (checkBox.isSelected()) {
                    mensaje += "✔ Notificaciones activadas\n";
                } else {
                    mensaje += "✖ Notificaciones desactivadas\n";
                }

                // Verifica cuál radio está seleccionado
                if (radioHombre.isSelected()) {
                    mensaje += "Género seleccionado: Hombre";
                } else if (radioMujer.isSelected()) {
                    mensaje += "Género seleccionado: Mujer";
                } else {
                    mensaje += "No se seleccionó género";
                }

                // Muestra un cuadro de diálogo con la información
                JOptionPane.showMessageDialog(ventana, mensaje);
            }
        });

        // Muestra la ventana
        ventana.setVisible(true);
    }
}
    
    

