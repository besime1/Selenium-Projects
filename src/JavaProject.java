//public class proje4 {
    import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.util.*;



    public class JavaProject extends JFrame {

        private JLabel titleLabel;

        private JButton addButton;

        private JButton subtractButton;

        private JButton multiplyButton;

        private JButton divideButton;

        private JTextField num1Field;

        private JTextField num2Field;

        private JLabel resultLabel;



        public JavaProject() {

            setLayout(new FlowLayout());



            titleLabel = new JLabel("Java Project");

            add(titleLabel);



            num1Field = new JTextField(5);

            add(num1Field);



            num2Field = new JTextField(5);

            add(num2Field);



            addButton = new JButton("+");

            add(addButton);



            subtractButton = new JButton("-");

            add(subtractButton);



            multiplyButton = new JButton("*");

            add(multiplyButton);



            divideButton = new JButton("/");

            add(divideButton);



            resultLabel = new JLabel("");

            add(resultLabel);



            event e = new event();

            addButton.addActionListener(e);

            subtractButton.addActionListener(e);

            multiplyButton.addActionListener(e);

            divideButton.addActionListener(e);

        }



        public class event implements ActionListener {

            public void actionPerformed(ActionEvent e) {

                int num1, num2, result;

                num1 = Integer.parseInt(num1Field.getText());

                num2 = Integer.parseInt(num2Field.getText());



                if (e.getSource() == addButton) {

                    result = num1 + num2;

                    resultLabel.setText(num1 + " + " + num2 + " = " + result);

                }

                if (e.getSource() == subtractButton) {

                    result = num1 - num2;

                    resultLabel.setText(num1 + " - " + num2 + " = " + result);

                }

                if (e.getSource() == multiplyButton) {

                    result = num1 * num2;

                    resultLabel.setText(num1 + " * " + num2 + " = " + result);

                }

                if (e.getSource() == divideButton) {

                    result = num1 / num2;

                    resultLabel.setText(num1 + " / " + num2 + " = " + result);

                }

            }

        }



        public static void main(String args[]) {

            JavaProject jproject = new JavaProject();

            jproject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            jproject.setSize(300, 200);

            jproject.setVisible(true);

            jproject.setTitle("Java Project");

        }

    }
