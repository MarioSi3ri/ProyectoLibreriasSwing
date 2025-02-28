package main.java.com.si3ri.botones;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.components.JLocaleChooser;
import org.jvnet.substance.skin.*;

import javax.swing.*;
import java.awt.*;

public class BotonSubstance extends JFrame {

    public BotonSubstance() {
        setTitle("Ventana Substance");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        try {
            UIManager.setLookAndFeel( new SubstanceBusinessBlueSteelLookAndFeel());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        // Crean los botones dentro del contenedor de la ventana JCalendar.
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

        // Agrega el evento al presionar los botones con el método 'Lambda'.
        btn1.addActionListener(e -> agregarJCalendar());

        btn2.addActionListener(e -> agregarJLocaleChooser());

        btn3.addActionListener(e -> agregarJMonthChooser());

        btn4.addActionListener(e -> agregarJDateChooser());

        btn5.addActionListener(e -> agregarJDayChooser());

        // 'GridLayout' para la distribución organizada dentro del contenedor de la ventana JCalendar.
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

    // Métodos para poder ejecutar algún calendario en forma de diálogo al presionar un botón.
    private void agregarJCalendar() {
        // Crea un nuevo JCalendar y se muestra en un cuadro de diálogo.
        System.out.println("Se presionó el Botón 1");
        try {
            UIManager.setLookAndFeel( new SubstanceAutumnLookAndFeel());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        JCalendar calendario = new JCalendar();
        JOptionPane.showMessageDialog(BotonSubstance.this, calendario, "Seleccionar fecha:", JOptionPane.PLAIN_MESSAGE);
        System.out.println("Presionó para salir de la ventana de selección de fecha");
    }
    private void agregarJLocaleChooser() {
        System.out.println("Se presionó el Botón 2");
        try {
            UIManager.setLookAndFeel( new SubstanceFieldOfWheatLookAndFeel());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        JLocaleChooser region = new JLocaleChooser();
        JOptionPane.showMessageDialog(BotonSubstance.this, region, "Seleccionar región:", JOptionPane.PLAIN_MESSAGE);
        System.out.println("Presionó para salir de la ventana de selección de región");
    }
    private void agregarJMonthChooser() {
        System.out.println("Se presionó el Botón 3");
        try {
            UIManager.setLookAndFeel( new SubstanceCremeCoffeeLookAndFeel());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        JMonthChooser calendarioMes = new JMonthChooser ();
        JOptionPane.showMessageDialog(BotonSubstance.this, calendarioMes, "Seleccionar mes:", JOptionPane.PLAIN_MESSAGE);
        System.out.println("Presionó para salir de la ventana de selección de mes");
    }
    private void agregarJDateChooser() {
        System.out.println("Se presionó el Botón 4");
        try {
            UIManager.setLookAndFeel( new SubstanceEmeraldDuskLookAndFeel());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        JDateChooser calendarioAgenda = new JDateChooser();
        JOptionPane.showMessageDialog(BotonSubstance.this, calendarioAgenda, "Seleccionar fecha en el recuadro:", JOptionPane.PLAIN_MESSAGE);
        System.out.println("Presionó para salir de la ventana para ingresó de fecha");
    }
    private void agregarJDayChooser() {
        System.out.println("Se presionó el Botón 5");
        try {
            UIManager.setLookAndFeel( new SubstanceOfficeBlue2007LookAndFeel());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        JDayChooser calendarioDos = new JDayChooser();
        JOptionPane.showMessageDialog(BotonSubstance.this, calendarioDos, "Seleccionar fecha:", JOptionPane.PLAIN_MESSAGE);
        System.out.println("Presionó para salir de la ventana de selección de fecha");
    }
}
