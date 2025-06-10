/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicionpoo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Juan Osorio
 */
public class MenuColores extends JFrame{
    JPanel panel;

    public MenuColores() {
        setTitle("Menú de Colores");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar ventana

        // Panel de fondo
        panel = new JPanel();
        add(panel);

        // Crear barra de menú
        JMenuBar barra = new JMenuBar();

        // Crear menú
        JMenu menuColores = new JMenu("Colores");

        // Crear ítems de menú
        JMenuItem itemRojo = new JMenuItem("Rojo");
        JMenuItem itemVerde = new JMenuItem("Verde");
        JMenuItem itemAzul = new JMenuItem("Azul");

        // Agregar ítems al menú
        menuColores.add(itemRojo);
        menuColores.add(itemVerde);
        menuColores.add(itemAzul);

        // Agregar menú a la barra
        barra.add(menuColores);

        // Establecer la barra de menú en el JFrame
        setJMenuBar(barra);

        // Eventos
        itemRojo.addActionListener(e -> panel.setBackground(Color.RED));
        itemVerde.addActionListener(e -> panel.setBackground(Color.GREEN));
        itemAzul.addActionListener(e -> panel.setBackground(Color.BLUE));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MenuColores().setVisible(true);
        });
    }
}

