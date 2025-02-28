package main.java.com.si3ri.botones;

import javax.swing.*;
import java.awt.*;

public class BotonJTattoo extends JFrame {

    public BotonJTattoo() {
        setTitle("Ventana JTattoo");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        try {
            // Establece el tema utilizando JTattoo.
            UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception ex) {
            System.err.println( "Failed to initialize theme for JTattoo" );
        }

        // Crean los botones dentro del contenedor de la ventana JTattoo.
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

        // Agregan el evento al presionar los botones.
        btn1.addActionListener(e -> {
            System.out.println("Se presionó el Botón 1");
            try {
                // Establece el tema utilizando JTattoo.
                UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
                SwingUtilities.updateComponentTreeUI(BotonJTattoo.this);
            } catch (Exception ex) {
                System.err.println( "Failed to initialize theme for JTattoo" );
            }
            // Ejecución de la ventana de diálogo al presionar alguno de los botones.
            JOptionPane.showConfirmDialog(BotonJTattoo.this, "¿Le agrada el tema JTattoo SmartLookAndFeel para el botón 1?", "Confirmar", JOptionPane.YES_NO_OPTION);
            System.out.println("Presionó para salir de la ventana de confirmación");
        });
        btn2.addActionListener(e -> {
            System.out.println("Se presionó el Botón 2");
            try {
                // Establece el tema utilizando JTattoo.
                UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
                SwingUtilities.updateComponentTreeUI(BotonJTattoo.this);
            } catch (Exception ex) {
                System.err.println( "Failed to initialize theme for JTattoo" );
            }
            JOptionPane.showConfirmDialog(BotonJTattoo.this, "¿Le agrada el tema JTattoo NoireLookAndFeel para el botón 2?", "Confirmar", JOptionPane.YES_NO_OPTION);
            System.out.println("Presionó para salir de la ventana de confirmación");
        });
        btn3.addActionListener(e -> {
            System.out.println("Se presionó el Botón 3");
            try {
                // Establece el tema utilizando JTattoo.
                UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                SwingUtilities.updateComponentTreeUI(BotonJTattoo.this);
            } catch (Exception ex) {
                System.err.println( "Failed to initialize theme for JTattoo" );
            }
            JOptionPane.showConfirmDialog(BotonJTattoo.this, "¿Le agrada el tema JTattoo AcrylLookAndFeel para el botón 3?", "Confirmar", JOptionPane.YES_NO_OPTION);
            System.out.println("Presionó para salir de la ventana de confirmación");
        });
        btn4.addActionListener(e -> {
            System.out.println("Se presionó el Botón 4");
            try {
                // Establece el tema utilizando JTattoo.
                UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
                SwingUtilities.updateComponentTreeUI(BotonJTattoo.this);
            } catch (Exception ex) {
                System.err.println( "Failed to initialize theme for JTattoo" );
            }
            JOptionPane.showConfirmDialog(BotonJTattoo.this, "¿Le agrada el tema JTattoo BernsteinLookAndFeel para el botón 4?", "Confirmar", JOptionPane.YES_NO_OPTION);
            System.out.println("Presionó para salir de la ventana de confirmación");
        });
        btn5.addActionListener(e -> {
            System.out.println("Se presionó el Botón 5");
            try {
                // Establece el tema utilizando JTattoo.
                UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
                SwingUtilities.updateComponentTreeUI(BotonJTattoo.this);
            } catch (Exception ex) {
                System.err.println( "Failed to initialize theme for JTattoo" );
            }
            JOptionPane.showConfirmDialog(BotonJTattoo.this, "¿Le agrada el tema JTattoo McWinLookAndFeel para el botón 5?", "Confirmar", JOptionPane.YES_NO_OPTION);
            System.out.println("Presionó para salir de la ventana de confirmación");
        });

        // 'GridLayout' para la distribución organizada dentro del contenedor de la ventana JTattoo.
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
