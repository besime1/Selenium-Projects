//public class proje5 {
    import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
    public class RedGreenBlue extends JFrame implements ActionListener {
        // declaring important UI components
        private JLabel label;
        private JButton red, green, blue;
        private static final int CIRCLE_RADIUS = 15;
        // constructor to initialize the GUI
        public RedGreenBlue() {
// creating a panel to hold red green blue buttons and the label
            JPanel panel = new JPanel();
// initializing label to display color
            label = new JLabel();
// using red color circular icon by default
            label.setIcon(new CircleIcon(CIRCLE_RADIUS, Color.RED));
// initializing buttons
            red = new JButton("red");
            green = new JButton("green");
            blue = new JButton("blue");
// adding to buttons panel
            panel.add(red);
            panel.add(green);
            panel.add(blue);
            panel.add(label);
// adding panel to the frame
            add(panel);
// adding action listeners to the buttons to call actionPerformed method
// defined below
            red.addActionListener(this);
            green.addActionListener(this);
            blue.addActionListener(this);
// setting up and displaying the window
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            pack();
            setVisible(true);
        }
        public static void main(String[] args) {
// initializing the GUI
            new RedGreenBlue();
        }
        @Override
        public void actionPerformed(ActionEvent e) {
// finding which button is clicked
            if (e.getSource().equals(red)) {
// changing label icon to red circular icon
                label.setIcon(new CircleIcon(CIRCLE_RADIUS, Color.RED));
            } else if (e.getSource().equals(green)) {
// changing label icon to green circular icon
                label.setIcon(new CircleIcon(CIRCLE_RADIUS, Color.GREEN));
            } else if (e.getSource().equals(blue)) {
// changing label icon to blue circular icon
                label.setIcon(new CircleIcon(CIRCLE_RADIUS, Color.BLUE));
            }
// repainting label
            label.repaint();
        }
    }
    // a simple class representing a circular icon with given radius and color
// this should be placed in the same file as RedGreenBlue.java
    class CircleIcon implements Icon {
        int radius;
        Color color;

        public CircleIcon(int radius, Color color) {
            this.radius = radius;
            this.color = color;
        }

        @Override
        public int getIconHeight() {
            return radius * 2;
        }

        @Override
        public int getIconWidth() {
            return radius * 2;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
// using the provided color, drawing a filled circle at x,y
            g.setColor(color);
            g.fillOval(x, y, getIconWidth(), getIconHeight());
        }

    }