package main.java.com.si3ri.botones;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.*;
import java.awt.*;

public class BotonFlatLaf extends JFrame {

    public BotonFlatLaf() {
        setTitle("Ventana FlatLaf");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        // Crean los botones dentro del contenedor de la ventana FlatLaf.
        JButton btn1 = new JButton("Botón 1");
        btn1.setFont(new Font("Arial", Font.PLAIN, 15));
        JButton btn2 = new JButton("Botón 2");
        btn2.setFont(new Font("Arial", Font.PLAIN, 15));
        JButton btn3 = new JButton("Botón 3");
        btn3.setFont(new Font("Arial", Font.PLAIN, 15));
        JButton btn4 = new JButton("Botón 4");
        btn4.setFont(new Font("Arial", Font.PLAIN, 15));
        JButton btn5 = new JButton("Botón 5");
        btn5.setFont(new Font("Arial", Font.PLAIN, 15));

        // Agrega el evento al presionar los botones.
        btn1.addActionListener(e -> {
            System.out.println("Se presionó el Botón 1");
            try {
                // Establece el tema utilizando FlatLaf.
                UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatDarkLaf());
                SwingUtilities.updateComponentTreeUI(BotonFlatLaf.this);
            } catch (Exception ex) {
                System.err.println( "Failed to initialize LaF" );
            }
            // Ejecución de la ventana de diálogo al presionar alguno de los botones.
            JOptionPane.showConfirmDialog(BotonFlatLaf.this, "¿Le agrada el tema FlatLaf Dark para el botón 1?", "Confirmar", JOptionPane.YES_NO_OPTION);
            System.out.println("Presionó para salir de la ventana de confirmación");
        });

        btn2.addActionListener(e -> {
            System.out.println("Se presionó el Botón 2");
            try {
                UIManager.setLookAndFeel(new com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme());
                SwingUtilities.updateComponentTreeUI(BotonFlatLaf.this);
            } catch (Exception ex) {
                System.err.println( "Failed to initialize LaF" );
            }
            JOptionPane.showConfirmDialog(BotonFlatLaf.this, "¿Le agrada el tema FlatLaf Arc-Orange para el botón 2?", "Confirmar", JOptionPane.YES_NO_OPTION);
            System.out.println("Presionó para salir de la ventana de confirmación");
        });

        btn3.addActionListener(e -> {
            System.out.println("Se presionó el Botón 3");
            try {
                UIManager.setLookAndFeel(new com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme());
                SwingUtilities.updateComponentTreeUI(BotonFlatLaf.this);
            } catch (Exception ex) {
                System.err.println( "Failed to initialize LaF" );
            }
            JOptionPane.showConfirmDialog(BotonFlatLaf.this, "¿Le agrada el tema FlatLaf Carbon para el botón 3?", "Confirmar", JOptionPane.YES_NO_OPTION);
            System.out.println("Presionó para salir de la ventana de confirmación");
        });

        btn4.addActionListener(e -> {
            System.out.println("Se presionó el Botón 4");
            try {
                // Establece el tema utilizando FlatLaf.
                UIManager.setLookAndFeel(new com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme());
                SwingUtilities.updateComponentTreeUI(BotonFlatLaf.this);
            } catch (Exception ex) {
                System.err.println( "Failed to initialize LaF" );
            }
            JOptionPane.showConfirmDialog(BotonFlatLaf.this, "¿Le agrada el tema FlatLaf Dark Purple para el botón 4?", "Confirmar", JOptionPane.YES_NO_OPTION);
            System.out.println("Presionó para salir de la ventana de confirmación");
        });

        btn5.addActionListener(e -> {
            System.out.println("Se presionó el Botón 5");
            try {
                // Establece el tema utilizando FlatLaf.
                UIManager.setLookAndFeel(new com.formdev.flatlaf.themes.FlatMacDarkLaf());
                SwingUtilities.updateComponentTreeUI(BotonFlatLaf.this);
            } catch (Exception ex) {
                System.err.println( "Failed to initialize LaF" );
            }
            JOptionPane.showConfirmDialog(BotonFlatLaf.this, "¿Le agrada el tema FlatLaf macOS Dark para el botón 5?", "Confirmar", JOptionPane.YES_NO_OPTION);
            System.out.println("Presionó para salir de la ventana de confirmación");
        });

        // 'GridLayout' para la distribución organizada dentro del contenedor de la ventana FlatLaf.
        JPanel panelBotones = new JPanel(new GridLayout(1, 5));
        panelBotones.add(btn1);
        panelBotones.add(btn2);
        panelBotones.add(btn3);
        panelBotones.add(btn4);
        panelBotones.add(btn5);

        // Agrega bordes al contenedor de JTattoo.
        panelBotones.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));

        // Agrega el panel para la posición de los botones dentro del contenedor.
        add(panelBotones, BorderLayout.CENTER);
    }
}
