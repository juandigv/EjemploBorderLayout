package jd.code;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JButton Bot1 = new JButton("Arriba");
    private JButton Bot2 = new JButton("Abajo");
    private JButton Bot3 = new JButton("Izquierda");
    private JButton Bot4 = new JButton("Derecha");
    private JButton Bot5 = new JButton("Medio");

    public Ventana() {
        super("Ejemplo de BorderLayout");
        setLayout(new BorderLayout());
        add(Bot1, BorderLayout.NORTH);
        add(Bot2, BorderLayout.SOUTH);
        add(Bot3, BorderLayout.WEST);
        add(Bot4, BorderLayout.EAST);
        add(Bot5, BorderLayout.CENTER);

    }
}

