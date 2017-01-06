import javax.swing.*;
import java.awt.event.*;

public class Front implements ActionListener {
	JTextField j1, j2, j3;
	JButton b1, b2;

	JLabel headerLabel,productName,price;
	
	int labelStartingPosition = 20;
	int inputStartingPosition = 120;
	int rowDistance = 20;
	int textFieldWidth = 130;
	int labelFieldWidth = 130;
	
	Front() {
		JFrame frame = new JFrame("cal");
		
		headerLabel = new JLabel("Product Add");
		headerLabel.setBounds(10, 20, 100, 20);
		frame.add(headerLabel);
		
		productName = new JLabel("Name");
		productName.setBounds(labelStartingPosition, 50, 100, 20);
		frame.add(productName); 
		
		j1 = new JTextField();
		j1.setBounds(inputStartingPosition, 50, 100, 20);
		//j2 = new JTextField();
		//j2.setBounds(50, 100, 100, 20);
		j3 = new JTextField();
		j3.setBounds(50, 150, 100, 20);
		j3.setEditable(false);
		b1 = new JButton("add");
		b1.setBounds(50, 200, 100, 20);
		b2 = new JButton("sub");
		b2.setBounds(120, 200, 100, 20);
		b1.addActionListener(this);
		b2.addActionListener(this);
		frame.add(j1);
		//frame.add(j2);
		frame.add(j3);
		frame.add(b1);
		frame.add(b2);
		frame.setSize(800, 600);
		frame.setLayout(null);
		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		String s1 = j1.getText();
		String s2 = j2.getText();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		int c = 0;
		if (e.getSource() == b1) {
			c = a + b;
		} else if (e.getSource() == b2) {
			c = a - b;
		}
		String result = String.valueOf(c);
		j3.setText(result);
	}

	public static void main(String args[]) {
		new Front();
	}
}