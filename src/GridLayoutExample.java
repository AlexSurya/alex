import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class GridLayoutExample extends JFrame{

	static final String gap[] = {"0","10","15","20"};
	static final int maxGap = 20;
	
	JComboBox horComboBox;
	JComboBox verComboBox;
	JButton jButton = new JButton("Gaps");
	
	
	
	public void addComponents(final Container panel){
		final JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new GridLayout(5, 2));
		
		final JPanel inputLabel = new JPanel();
		inputLabel.setLayout(new GridLayout(5, 2));
		
		// Add Labels
		labelPanel.add(new JLabel("Name"));
		labelPanel.add(new JLabel("Price"));
		labelPanel.add(new JLabel("Price 1"));
		labelPanel.add(new JLabel("Price 1"));
		labelPanel.add(new JLabel("Price 1"));
		
		
		// Add Input
		inputLabel.add(new JTextField());
		inputLabel.add(new JTextField());
		
		inputLabel.add(jButton);
		
		panel.add(labelPanel,BorderLayout.WEST);
		panel.add(new JSeparator(),BorderLayout.CENTER);
		panel.add(inputLabel,BorderLayout.EAST);
		
	}

	
	public static void main (String[] args){
		GridLayoutExample gridLayoutExample = new GridLayoutExample();
		gridLayoutExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gridLayoutExample.addComponents(gridLayoutExample.getContentPane());
		
		gridLayoutExample.pack();
		gridLayoutExample.setVisible(true);
	}
}
