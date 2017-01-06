import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Test2 {
	public static void main(String args[]){
		JFrame p=new JFrame("alex");
		JLabel q=new JLabel("side");
		q.setHorizontalAlignment(JLabel.LEFT);
		JTextField hi=new JTextField("insert");
		hi.setHorizontalAlignment(JTextField.LEFT);
		p.setVisible(true);
		p.add(q);
		p.add(hi);
		p.setSize(300,300);
	}

}
