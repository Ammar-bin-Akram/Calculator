import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    double num1 = 0, result = 0;
    int calculation;
    private final JButton b0;
    private final JButton b1;
    private final JButton b2;
    private final JButton b3;
    private final JButton b4;
    private final JButton b5;
    private final JButton b6;
    private final JButton b7;
    private final JButton b8;
    private final JButton b9;
    private final JButton bAC;
    private final JButton bp;
    private final JButton bs;
    private final JButton bm;
    private final JButton bd;
    private final JButton bpoint;
    private final JButton be;
    private final JButton bcut;
    private final JTextField tf;
    private final JTextField t;
    private final JFrame f;

    public Calculator() {
        Border border = BorderFactory.createLineBorder(Color.CYAN, 2);
        Font font = new Font("Helvetica", Font.BOLD, 20);
        f = new JFrame();
        //two of the text fields are made t->1,tf->2
        t = new JTextField();
        t.setBounds(10, 70, 80, 25);
        t.setBackground(Color.WHITE);
        t.setForeground(Color.RED);
        t.setEditable(false);

        tf = new JTextField(10);
        tf.setFont(font);
        tf.setEditable(false);
        tf.setBounds(10, 10, 230, 40);
        f.add(tf);

        //buttons are made
        b1 = new JButton("1");
        b1.setBounds(10, 100, 50, 50);
        b1.setBackground(Color.CYAN);
        b1.setBorder(border);
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font("1", Font.ITALIC, 20));
        b1.addActionListener(this);

        b2 = new JButton("2");
        b2.setBounds(70, 100, 50, 50);
        b2.setBackground(Color.CYAN);
        b2.setBorder(border);
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font("2", Font.ITALIC, 20));
        b2.addActionListener(this);

        b3 = new JButton("3");
        b3.setBounds(130, 100, 50, 50);
        b3.setBackground(Color.CYAN);
        b3.setBorder(border);
        b3.setForeground(Color.BLACK);
        b3.setFont(new Font("3", Font.ITALIC, 20));
        b3.addActionListener(this);

        b4 = new JButton("4");
        b4.setBounds(10, 170, 50, 50);
        b4.setBackground(Color.CYAN);
        b4.setBorder(border);
        b4.setForeground(Color.BLACK);
        b4.setFont(new Font("4", Font.ITALIC, 20));
        b4.addActionListener(this);

        b5 = new JButton("5");
        b5.setBounds(70, 170, 50, 50);
        b5.setBackground(Color.CYAN);
        b5.setBorder(border);
        b5.setForeground(Color.BLACK);
        b5.setFont(new Font("5", Font.ITALIC, 20));
        b5.addActionListener(this);

        b6 = new JButton("6");
        b6.setBounds(130, 170, 50, 50);
        b6.setBackground(Color.CYAN);
        b6.setBorder(border);
        b6.setForeground(Color.BLACK);
        b6.setFont(new Font("6", Font.ITALIC, 20));
        b6.addActionListener(this);

        b7 = new JButton("7");
        b7.setBounds(10, 240, 50, 50);
        b7.setBackground(Color.CYAN);
        b7.setBorder(border);
        b7.setForeground(Color.BLACK);
        b7.setFont(new Font("7", Font.ITALIC, 20));
        b7.addActionListener(this);

        b8 = new JButton("8");
        b8.setBounds(70, 240, 50, 50);
        b8.setBackground(Color.CYAN);
        b8.setBorder(border);
        b8.setForeground(Color.BLACK);
        b8.setFont(new Font("8", Font.ITALIC, 20));
        b8.addActionListener(this);

        b9 = new JButton("9");
        b9.setBounds(130, 240, 50, 50);
        b9.setBackground(Color.CYAN);
        b9.setBorder(border);
        b9.setForeground(Color.BLACK);
        b9.setFont(new Font("9", Font.ITALIC, 20));
        b9.addActionListener(this);

        b0 = new JButton("0");
        b0.setBounds(70, 310, 50, 50);
        b0.setBackground(Color.CYAN);
        b0.setBorder(border);
        b0.setForeground(Color.BLACK);
        b0.setFont(new Font("0", Font.ITALIC, 20));
        b0.addActionListener(this);

        bp = new JButton("+");
        bp.setBounds(190, 100, 50, 50);
        bp.setBackground(Color.CYAN);
        bp.setBorder(border);
        bp.setForeground(Color.BLACK);
        bp.setFont(new Font("+", Font.ITALIC, 20));
        bp.addActionListener(this);

        bm = new JButton("*");
        bm.setBounds(190, 170, 50, 50);
        bm.setBackground(Color.CYAN);
        bm.setBorder(border);
        bm.setForeground(Color.BLACK);
        bm.setFont(new Font("*", Font.ITALIC, 20));
        bm.addActionListener(this);

        bs = new JButton("-");
        bs.setBounds(190, 240, 50, 50);
        bs.setBackground(Color.CYAN);
        bs.setBorder(border);
        bs.setForeground(Color.BLACK);
        bs.setFont(new Font("-", Font.ITALIC, 20));
        bs.addActionListener(this);

        bd = new JButton("/");
        bd.setBounds(190, 310, 50, 50);
        bd.setBackground(Color.CYAN);
        bd.setBorder(border);
        bd.setForeground(Color.BLACK);
        bd.setFont(new Font("/", Font.ITALIC, 20));
        bd.addActionListener(this);

        bpoint = new JButton(".");
        bpoint.setBounds(130, 310, 50, 50);
        bpoint.setBackground(Color.CYAN);
        bpoint.setBorder(border);
        bpoint.setForeground(Color.BLACK);
        bpoint.setFont(new Font(".", Font.ITALIC, 20));
        bpoint.addActionListener(this);

        be = new JButton("=");
        be.setBounds(10, 310, 50, 50);
        be.setBackground(Color.CYAN);
        be.setBorder(border);
        be.setForeground(Color.BLACK);
        be.setFont(new Font("=", Font.ITALIC, 20));
        be.addActionListener(this);

        bAC = new JButton("AC");
        bAC.setBounds(10, 380, 110, 50);
        bAC.setBackground(Color.CYAN);
        bAC.setBorder(border);
        bAC.setForeground(Color.BLACK);
        bAC.setFont(new Font("AC", Font.ITALIC, 20));
        bAC.addActionListener(this);

        bcut = new JButton("del");
        bcut.setBounds(130, 380, 110, 50);
        bcut.setBackground(Color.CYAN);
        bcut.setBorder(border);
        bcut.setForeground(Color.BLACK);
        bcut.setFont(new Font("del", Font.ITALIC, 20));
        bcut.addActionListener(this);

        //everything added to our frame
        f.setLayout(null);
        f.add(t);
        f.add(bcut);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);
        f.add(bp);
        f.add(bm);
        f.add(bs);
        f.add(bd);
        f.add(bpoint);
        f.add(bAC);
        f.add(be);
        f.setSize(270, 490);
        f.getContentPane().setBackground(Color.BLACK);
        f.setTitle("Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    //main method to make an object of calculator
    public static void main(String[] args) {
        new Calculator();
    }

    //method that performs the arithmetic operations
    public void arithmetic_operation() {
        switch (calculation) {
            case 1 -> {//Addition
                result = num1 + Double.parseDouble(tf.getText());
                tf.setText(Double.toString(result));
            }
            case 2 -> {//Subtraction
                result = num1 - Double.parseDouble(tf.getText());
                tf.setText(Double.toString(result));
            }
            case 3 -> {//Multiplication
                result = num1 * Double.parseDouble(tf.getText());
                tf.setText(Double.toString(result));
            }
            case 4 -> {//Division
                result = num1 / Double.parseDouble(tf.getText());
                tf.setText(Double.toString(result));
            }
        }
    }

    //action listener added with each button
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            tf.setText(tf.getText().concat(String.valueOf(1)));
        }
        if (e.getSource() == b2) {
            tf.setText(tf.getText().concat(String.valueOf(2)));
        } else if (e.getSource() == b3) {
            tf.setText(tf.getText().concat(String.valueOf(3)));
        } else if (e.getSource() == b4) {
            tf.setText(tf.getText().concat(String.valueOf(4)));
        } else if (e.getSource() == b5) {
            tf.setText(tf.getText().concat(String.valueOf(5)));
        } else if (e.getSource() == b6) {
            tf.setText(tf.getText().concat(String.valueOf(6)));
        } else if (e.getSource() == b7) {
            tf.setText(tf.getText().concat(String.valueOf(7)));
        } else if (e.getSource() == b8) {
            tf.setText(tf.getText().concat(String.valueOf(8)));
        } else if (e.getSource() == b9) {
            tf.setText(tf.getText().concat(String.valueOf(9)));
        } else if (e.getSource() == b0) {
            tf.setText(tf.getText().concat(String.valueOf(0)));
        } else if (e.getSource() == bp) {
            num1 = Double.parseDouble(tf.getText());
            calculation = 1;
            tf.setText("");
            t.setText(num1 + " +");
        } else if (e.getSource() == bs) {
            num1 = Double.parseDouble(tf.getText());
            calculation = 2;
            tf.setText("");
            t.setText(num1 + " -");
        } else if (e.getSource() == bm) {
            num1 = Double.parseDouble(tf.getText());
            calculation = 3;
            tf.setText("");
            t.setText(num1 + " *");
        } else if (e.getSource() == bd) {
            num1 = Double.parseDouble(tf.getText());
            calculation = 4;
            tf.setText("");
            t.setText(num1 + " /");
        } else if (e.getSource() == bpoint) {
            tf.setText(tf.getText().concat("."));
        } else if (e.getSource() == bcut) {
            String string = tf.getText();
            tf.setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                tf.setText(tf.getText() + string.charAt(i));
            }
        } else if (e.getSource() == be) {
            arithmetic_operation();
            t.setText("");
        } else if (e.getSource() == bAC) {
            tf.setText("");
            t.setText("");
        }
    }
}

