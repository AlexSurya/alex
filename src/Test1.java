import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test1 {
	public static void main(String args[]) {
		JFrame f = new JFrame();
		JLabel l1 = new JLabel("name");
		JLabel l2 = new JLabel("Address");
		final JTextField j1 = new JTextField(20);
		final JTextField j2 = new JTextField(20);
		JButton b = new JButton("Submit");

		JPanel p = new JPanel(new GridLayout(3, 0));
		p.add(l1);
		p.add(j1);
		p.add(l2);
		p.add(j2);
		p.add(b);
		f.add(p);
		f.setResizable(false);
		f.setVisible(true);
		f.pack();
	}

}
