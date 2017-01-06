import javax.swing.*;
import java.awt.*;
public class Text extends JFrame{
	public Text(){
		super("testing");
		
		JTextField j1=new JTextField("1",1);
		
		add(j1);
		JTextField j2=new JTextField("24763324t34",20);
		
		add(j2);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String args[]){
	new Text();
		
		
	}

}
