package main.java.com.si3ri;

import main.java.com.si3ri.botones.BotonFlatLaf;
import main.java.com.si3ri.botones.BotonSubstance;
import main.java.com.si3ri.botones.BotonJTattoo;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.*;
import java.awt.*;

public class BotonesPrincipales extends JFrame {

    public BotonesPrincipales() {
        setTitle("Librerías");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Crear el estilo de los botones.
        JButton btnJTattoo = new JButton("JTattoo");
        btnJTattoo.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton btnFlatLaf = new JButton("FlatLaf");
        btnFlatLaf.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton btnSubstance = new JButton("Substance");
        btnSubstance.setFont(new Font("Arial", Font.PLAIN, 18));

        // Agregan evento al presionar los botones.
        btnJTattoo.addActionListener(e -> {
            System.out.println("Se presionó el botón JTattoo");
            BotonJTattoo ventanaJTattoo = new BotonJTattoo();
            ventanaJTattoo.setVisible(true);
        });

        btnFlatLaf.addActionListener(e -> {
            System.out.println("Se presionó el botón FlatLaf");
            BotonFlatLaf ventanaFlatLaf = new BotonFlatLaf();
            ventanaFlatLaf.setVisible(true);
        });

        btnSubstance.addActionListener(e -> {
            System.out.println("Se presionó el botón Substance");
            BotonSubstance ventanaSubstance = new BotonSubstance();
            ventanaSubstance.setVisible(true);
        });

        // 'GridLayout' para la distribución organizada en la ventana principal.
        JPanel panelBotones = new JPanel(new GridLayout(1, 3));
        panelBotones.add(btnJTattoo);
        panelBotones.add(btnFlatLaf);
        panelBotones.add(btnSubstance);

        // Agrega bordes a la ventana principal.
        panelBotones.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));

        // Agrega panel para la posición de los botones dentro del contenedor.
        add(panelBotones, BorderLayout.CENTER);
    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        SwingUtilities.invokeLater(() -> {
            BotonesPrincipales ventanasPrincipales = new BotonesPrincipales();
            ventanasPrincipales.setVisible(true);
        });
    }
}
