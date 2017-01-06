import java.awt.*;

import java.awt.event.*;
import java.applet.*;
import java.awt.color.*;
import javax.swing.*;
public class Dont extends JFrame {
	Button b1,b2;
	TextField t1,t2;
	JLabel l1,l2,l3,l4;
	{
	setVisible(true);
	setLayout(null);
	
	setSize(600,400);
	t1=new TextField();
	
	l4=new JLabel("RAS SUPERMARKET");
	l4.setBounds(200,80,100,20);
	add(l4);
	l1=new JLabel("Hello");
	l1.setFont(new Font("Garamond",Font.ITALIC,15));
	l1.setBounds(80,130,70,20);
	add(l1);
	t1.setBounds(190,130,100,20);
	add(t1);
	b1=new Button("save");
	b1.setBounds(200,130,100,20);
	add(b1);
	
	}
	public static void main(String args[]){
		Front ob=new Front();
	}
	
	
	
		
	

}
