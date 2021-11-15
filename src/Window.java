import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Window extends JFrame implements WindowListener, ActionListener{
    private TextField tf = new TextField();
    private JButton b1 = new JButton("1");
    private JButton b2 = new JButton("2");
    private JButton b3 = new JButton("3");
    private JButton b4 = new JButton("4");
    private JButton b5 = new JButton("5");
    private JButton b6 = new JButton("6");
    private JButton b7 = new JButton("7");
    private JButton b8 = new JButton("8");
    private JButton b9 = new JButton("9");
    private JButton b0 = new JButton("0");
    private JButton bplus = new JButton("+");
    private JButton bminus = new JButton("-");
    private JButton bmult = new JButton("*");
    private JButton bdiv = new JButton("/");
    private JButton bost = new JButton("%");
    private JButton bresult = new JButton("=");
    private JButton bpower = new JButton("^");
    private JButton bpm = new JButton("+/-");

    private JButton del = new JButton("C");
    private String text = "";
    private int a = 0;
    private int b = 0;
    private char z;


    public Window(){

        super("CalculaTHOR");
        Font font = new Font("Impact", Font.BOLD, 35);
        Font bfont = new Font("Sans", Font.BOLD, 35);
        Font nfont = new Font("Sans", Font.BOLD, 15);

        setSize(395, 600);
        setLayout(null);
        setVisible(true);
        setLocation(250, 100);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        tf.setLocation(25,25);
        tf.setSize(330, 60);
        tf.setVisible(true);
        tf.setFont(font);
       // tf.setBackground(Color.gray);
        add(tf);

        b1.setSize(60,60);
        b1.setLocation(25, 225);
        b1.setVisible(true);
        b1.setFont(bfont);
        add(b1);
        b1.addActionListener(this);

        b2.setSize(60,60);
        b2.setLocation(105, 225);
        b2.setVisible(true);
        b2.setFont(bfont);
        add(b2);
        b2.addActionListener(this);

        b3.setSize(60,60);
        b3.setLocation(185, 225);
        b3.setVisible(true);
        b3.setFont(bfont);
        add(b3);
        b3.addActionListener(this);

        b4.setSize(60,60);
        b4.setLocation(25, 305);
        b4.setVisible(true);
        b4.setFont(bfont);
        add(b4);
        b4.addActionListener(this);

        b5.setSize(60,60);
        b5.setLocation(105, 305);
        b5.setVisible(true);
        b5.setFont(bfont);
        add(b5);
        b5.addActionListener(this);

        b6.setSize(60,60);
        b6.setLocation(185, 305);
        b6.setVisible(true);
        b6.setFont(bfont);
        add(b6);
        b6.addActionListener(this);

        b7.setSize(60,60);
        b7.setLocation(25, 385);
        b7.setVisible(true);
        b7.setFont(bfont);
        add(b7);
        b7.addActionListener(this);

        b8.setSize(60,60);
        b8.setLocation(105, 385);
        b8.setVisible(true);
        b8.setFont(bfont);
        add(b8);
        b8.addActionListener(this);

        b9.setSize(60,60);
        b9.setLocation(185, 385);
        b9.setVisible(true);
        b9.setFont(bfont);
        add(b9);
        b9.addActionListener(this);

        b0.setSize(60,60);
        b0.setLocation(105, 465);
        b0.setVisible(true);
        b0.setFont(bfont);
        add(b0);
        b0.addActionListener(this);

        bpm.setSize(60,60);
        bpm.setLocation(25, 465);
        bpm.setVisible(true);
        bpm.setFont(nfont);
        add(bpm);
        bpm.addActionListener(this);

        del.setSize(60,60);
        del.setLocation(25, 145);
        del.setVisible(true);
        del.setFont(bfont);
        add(del);
        del.addActionListener(this);

        bplus.setSize(60,60);
        bplus.setLocation(285, 225);
        bplus.setVisible(true);
        bplus.setFont(bfont);
        add(bplus);
        bplus.addActionListener(this);

        bminus.setSize(60,60);
        bminus.setLocation(285, 305);
        bminus.setVisible(true);
        bminus.setFont(bfont);
        add(bminus);
        bminus.addActionListener(this);

        bmult.setSize(60,60);
        bmult.setLocation(285, 385);
        bmult.setVisible(true);
        bmult.setFont(bfont);
        add(bmult);
        bmult.addActionListener(this);

        bdiv.setSize(60,60);
        bdiv.setLocation(285, 465);
        bdiv.setVisible(true);
        bdiv.setFont(bfont);
        add(bdiv);
        bdiv.addActionListener(this);

        bpower.setSize(60,60);
        bpower.setLocation(285, 145);
        bpower.setVisible(true);
        bpower.setFont(bfont);
        add(bpower);
        bpower.addActionListener(this);

        bost.setSize(65,60);
        bost.setLocation(215, 465);
        bost.setVisible(true);
        bost.setFont(bfont);
        add(bost);
        bost.addActionListener(this);

        bresult.setSize(160,60);
        bresult.setLocation(105, 145);
        bresult.setVisible(true);
        bresult.setFont(bfont);
        add(bresult);
        bresult.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            text+= b1.getText();
            tf.setText(text);
        }
        if(e.getSource()==b2){
            text+= b2.getText();
            tf.setText(text);
        }
        if(e.getSource()==b3){
            text+= b3.getText();
            tf.setText(text);
        }
        if(e.getSource()==b4){
            text+= b4.getText();
            tf.setText(text);
        }
        if(e.getSource()==b5){
            text+= b5.getText();
            tf.setText(text);
        }
        if(e.getSource()==b6){
            text+= b6.getText();
            tf.setText(text);
        }
        if(e.getSource()==b7){
            text+= b7.getText();
            tf.setText(text);
        }
        if(e.getSource()==b8){
            text+= b8.getText();
            tf.setText(text);
        }
        if(e.getSource()==b9){
            text+= b9.getText();
            tf.setText(text);
        }
        if(e.getSource()==b0){
            text+= b0.getText();
            tf.setText(text);
        }
        if(e.getSource()==bplus){
            a = Integer.parseInt(text);
            text+= bplus.getText();
            tf.setText(text);
            text = "";
            z = '+';
        }
        if(e.getSource()==bpm){
            a = Integer.parseInt(text);
            a = a*-1;
            text = "";
            text+= a;
            tf.setText(text);

        }
        if(e.getSource()==bminus){
            a = Integer.parseInt(text);
            text+= bminus.getText();
            tf.setText(text);
            text = "";
            z = '-';
        }
        if(e.getSource()==bmult){
            a = Integer.parseInt(text);
            text+= bmult.getText();
            tf.setText(text);
            text = "";
            z = '*';
        }
        if(e.getSource()==bdiv){
            a = Integer.parseInt(text);
            text+= bdiv.getText();
            tf.setText(text);
            text = "";
            z = '/';
        }
        if(e.getSource()==bost){
            a = Integer.parseInt(text);
            text+= bost.getText();
            tf.setText(text);
            text = "";
            z = '%';
        }
        if(e.getSource()==bpower){
            a = Integer.parseInt(text);
            text+= bpower.getText();
            tf.setText(text);
            text = "";
            z = '^';
        }
        if(e.getSource()==del){
            text = "";
            tf.setText(text);
        }
        if(e.getSource()==bresult){
            if(z == '+'){
                b = Integer.parseInt(text);
                text = "= ";
                tf.setText(text+String.valueOf(a+b));
            }
            if(z == '-'){
                b = Integer.parseInt(text);
                text = "= ";
                tf.setText(text+String.valueOf(a-b));
            }
            if(z == '*'){
                b = Integer.parseInt(text);
                text = "= ";
                tf.setText(text+String.valueOf(a*b));
            }
            if(z == '/'){
                b = Integer.parseInt(text);
                text = "= ";
                tf.setText(text+String.valueOf(a/b));
            }
            if(z == '%'){
                b = Integer.parseInt(text);
                text = "= ";
                tf.setText(text+String.valueOf(a%b));
            }
            if(z == '^'){
                b = Integer.parseInt(text);
                double x = Math.pow(a,b);
                int y = (int)x;
                text = "= ";
                tf.setText(text+String.valueOf(y));
            }
        }

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

}


