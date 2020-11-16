
import javax.swing.*;
import java.awt.*;
import javafx.scene.*;
import javafx.scene.layout.*;


public class Calculater {
    
    private JFrame frame;
    
    public Calculater(String title){
        frame=new JFrame(title);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel1=new JPanel(new BorderLayout(5,5));
        
        JPanel panel2 =new JPanel(new GridLayout(4,4,5,5));
        
        JButton b1=new JButton("7");
        b1.setBackground(Color.lightGray);
        JButton b2=new JButton("8");
        b2.setBackground(Color.lightGray);
        JButton b3=new JButton("9");
        b3.setBackground(Color.lightGray);
        JButton b4=new JButton("/");
        b4.setBackground(Color.lightGray);
        
        JButton b5=new JButton("4");
        b5.setBackground(Color.lightGray);
        JButton b6=new JButton("5");
        b6.setBackground(Color.lightGray);
        JButton b7=new JButton("6");
        b7.setBackground(Color.lightGray);
        JButton b8=new JButton("*");
        b8.setBackground(Color.lightGray);
        
        JButton b9 =new JButton("1");
        b9.setBackground(Color.lightGray);
        JButton b10=new JButton("2");
        b10.setBackground(Color.lightGray);
        JButton b11=new JButton("3");
        b11.setBackground(Color.lightGray);
        JButton b12=new JButton("-");
        b12.setBackground(Color.lightGray);
        
        JButton b13=new JButton("0");
        b13.setBackground(Color.lightGray);
        JButton b14=new JButton(".");
        b14.setBackground(Color.lightGray);
        JButton b15=new JButton("=");
        b15.setBackground(Color.lightGray);
        JButton b16=new JButton("+");
        b16.setBackground(Color.lightGray);
        
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        
        panel2.add(b5);
        panel2.add(b6);
        panel2.add(b7);
        panel2.add(b8);
        
        panel2.add(b9);
        panel2.add(b10);
        panel2.add(b11);
        panel2.add(b12);
        
        panel2.add(b13);
        panel2.add(b14);
        panel2.add(b15);
        panel2.add(b16);
        
        
        JPanel panel3=new JPanel(new BorderLayout(5,5));
        
        JTextField text=new JTextField("Enter...");
        
        javax.swing.border.Border border=BorderFactory.createLineBorder(Color.BLUE,2);
        
        text.setBorder(border);
        
        /*int Ytext=text.getPreferredSize().height;
        int Xtext=text.getPreferredSize().width;
        text.setPreferredSize(new Dimension(Ytext,Xtext));*/
        
        JButton b17=new JButton("AC");
        b17.setBackground(Color.lightGray);
        int Yb17=b17.getPreferredSize().height+42;
        int Xb17=b17.getPreferredSize().width;
        b17.setPreferredSize(new Dimension(Yb17,Xb17));
        
        panel3.add(text,BorderLayout.CENTER);
        panel3.add(b17,BorderLayout.EAST);
        
        panel1.add(panel2,BorderLayout.CENTER);
        panel1.add(panel3,BorderLayout.NORTH);
        
        frame.add(panel1);
        
    }
    
    public void showGUI(){
        frame.setVisible(true);
    }
    
}
