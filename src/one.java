import java.awt.Panel;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.sql.*;


public class one {

    JFrame frame = new JFrame("ghar hisab");
    JButton b = new JButton("save");
    Panel p = new Panel();
    JTextField f = new JTextField(20);
    JTextField f1 = new JTextField(20);
    JLabel l = new JLabel("Enter the first name");
    JLabel l1 = new JLabel("Enter the first name");
    String s1,s2;
    String ppl;
    int people;

    void display() throws Exception{
        p.add(l);
        p.add(f);
        p.add(l1);
        p.add(f1);
        p.add(b);

        frame.setSize(400,400);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(p);
        s1=f.getText();
        s2=f1.getText();


        Class.forName("com.mysql.jdbc.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/people","root","9159809358");

        Statement stat = con.createStatement();
        //  String s3= "insert into name values s1 + s2";
        //  stat.executeUpdate(s3);

        stat.executeQuery("insert into name (first,last) values('"+s1+"','"+s2+"')");


        //  ResultSet rs= stat.executeQuery("insert into name (first,last) values("arun","yadav"));


        //while(rs.next()){
        //      System.out.println(rs.getString(1)+" "+rs.getString(2));
        //  }
    }
}