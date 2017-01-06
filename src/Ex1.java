import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Ex1 implements ActionListener
{
  JFrame fr;JPanel po;
  JLabel l1,l2,main;
  JTextField tf1,tf2;
  GridBagConstraints gbc;
  GridBagLayout go;
  JButton ok,exit;

public Ex1(){
fr=new JFrame("New User Data ");
Font f=new Font("Verdana",Font.BOLD,24);
po=new JPanel();
fr.getContentPane().add(po);
fr.setVisible(true);
fr.setSize(1024,768);
fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
po.setBackground(Color.WHITE);
go=new GridBagLayout();
gbc=new GridBagConstraints();
po.setLayout(go);
main=new JLabel("Enter User Details ");
main.setFont(f);
l1=new JLabel("Name  :");tf1=new JTextField(20);
l2=new JLabel("User Name  :");tf2=new JTextField(20);
ok=new JButton("Accept");
exit=new JButton("Exit");

gbc.anchor=GridBagConstraints.NORTH;gbc.gridx=5;gbc.gridy=0;
go.setConstraints(l1,gbc);po.add(main);

gbc.anchor=GridBagConstraints.WEST;gbc.gridx=5;
gbc.gridy=5;go.setConstraints(l1,gbc);po.add(l1);


gbc.anchor=GridBagConstraints.WEST;gbc.gridx=10;gbc.gridy=5;
go.setConstraints(tf1,gbc);po.add(tf1);

gbc.anchor=GridBagConstraints.WEST;gbc.gridx=5;gbc.gridy=10;
go.setConstraints(l2,gbc);po.add(l2);

gbc.anchor=GridBagConstraints.WEST;gbc.gridx=10;
gbc.gridy=10;go.setConstraints(tf2,gbc);po.add(tf2);

gbc.anchor=GridBagConstraints.WEST;gbc.gridx=10;gbc.gridy=90;
go.setConstraints(ok,gbc);po.add(ok);ok.addActionListener(this);

gbc.anchor=GridBagConstraints.WEST;gbc.gridx=11;gbc.gridy=90;
go.setConstraints(exit,gbc);po.add(exit);
exit.addActionListener(this);

}

@Override
public void actionPerformed(ActionEvent ev)
{
    if(ev.getSource()==ok)

    {
        try{
Connection con;JLabel last =new JLabel("Data inserted successfully");
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection
("jdbc:mysql://localhost/userDb","root","9159809358");
 PreparedStatement ps=con.prepareStatement
("Insert into usertbl values(default,?,?)");
String id=tf1.getText();String sname=tf2.getText();
ps.setString(1,id);ps.setString(2,sname);
ps.executeUpdate();con.close();
tf1.setText("");tf2.setText("");
    JOptionPane.showMessageDialog(fr, "Data inserted successfully.");
        }
catch(Exception e){
    System.out.println("ERROR  "+e);
}
    }
if(ev.getSource() == exit){fr.dispose();

}
}


    public static void main(String a[]){
    new Ex1();
    }

}