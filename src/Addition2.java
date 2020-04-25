import javax.swing.*;
import javax.swing.ImageIcon;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Addition2
{
    
   JPanel p1;
   JLabel l;
   JButton A,B,C,E;
   JTextField t,t1,t2;
   JFrame f;
  
 
public Addition2(){

 JMenuBar JMenu=new JMenuBar (); 
 JMenu m= new JMenu ("Option");
 JMenu.add(m);
 JMenuItem AC= new JMenuItem ("AC");
 m.add(AC);

 p1=new JPanel();

 p1.setLayout(new GridLayout(5,1,10,10 ));


 l=new JLabel("Entrez le 1er nombre");
 p1.add(l);  
 t=new JTextField(20);
 p1.add(t); 
 

 l=new JLabel("Entrez la 2eme nombre");
 p1.add(l);
 t1=new JTextField(20);
 p1.add(t1);

 l=new JLabel("Resultat: ");
 p1.add(l);
 t2=new JTextField(20);
 //t2.setBackground (Color.BLACK);
 t2.setForeground (Color.red); 
 t2.setEnabled(false);
 p1.add(t2);

 A=new JButton("Additon");
 p1.add(A); 
 B=new JButton("Multiplication");
 p1.add(B);
 C=new JButton("Division");
 p1.add(C);
 E=new JButton("Puissance");
 p1.add(E);

// Addition
 A.addActionListener(new ActionListener(){

 public void actionPerformed(ActionEvent e){
 try{
 String ad= t.getText();
 String ad2= t1.getText();
 double t=Double.parseDouble(ad);
 double b=Double.parseDouble(ad2);
 String w=" "+(t+b);
 t2.setText(w);

 }
 catch(NumberFormatException er){}

 }
 });
// Multiplication
 B.addActionListener(new ActionListener(){

 public void actionPerformed(ActionEvent e){
 try{
 String ad= t.getText();
 String ad2= t1.getText();
 double t=Double.parseDouble(ad);
 double b=Double.parseDouble(ad2);
 String w=" "+(t*b);
 t2.setText(w);

 }
 catch(NumberFormatException er){}

 }
 }); 
// Division
 C.addActionListener(new ActionListener(){

 public void actionPerformed(ActionEvent e){
 try{
 String ad= t.getText();
 String ad2= t1.getText();
 double t=Double.parseDouble(ad);
 double b=Double.parseDouble(ad2);
 String w=" "+(t/b);
 t2.setText(w);

 }
 catch(NumberFormatException er){}

 }
 });

 E.addActionListener(new ActionListener(){

 public void actionPerformed(ActionEvent e){
  try{
  String ad= t.getText();
  String ad2= t1.getText();
  double t=Double.parseDouble(ad);
  double b=Double.parseDouble(ad2);
  String w=" "+Math.pow(t,b);
  t2.setText(w);

 }
 catch(NumberFormatException er){}

 }
 }); 
 AC.addActionListener(new ActionListener(){

 public void actionPerformed(ActionEvent e){
  try{
   t.setText("");
   t1.setText("");
   t2.setText("");

  }
  catch(NumberFormatException er){}

 }
 });
  f=new JFrame("Calculatrice");
  f.setVisible(true);
  f.getContentPane().add("Center",p1);
  f.setResizable(false); 
  f.setJMenuBar(JMenu);
  p1.setBorder(BorderFactory.createLineBorder(Color.CYAN ,3));

  l.setForeground(Color.red);
  f.setSize(500,400);
  f.setLocationRelativeTo(null);
  ImageIcon icon = new ImageIcon("C:/Users/saif/Desktop/1.png") ;
  f.setIconImage(icon.getImage());
  int w = icon.getIconWidth();
  int h = icon.getIconHeight();
  f.setPreferredSize(new Dimension(w, h));
 }
  
public static void main(String [] args){
       new Addition2 ();
       } 
     }

