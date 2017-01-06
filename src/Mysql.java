    import java.sql.*;  
    
    class Mysql{  
    public static void main(String args[]){  
    try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/alex","root","9159809358");  
    //here sonoo is database name, root is username and password  
    Statement stmt=con.createStatement();
    
    PreparedStatement  q=con.prepareStatement("insert into emp values(?,?)");
    q.setString(1,"raj");
    
    ResultSet rs=stmt.executeQuery("select * from emp");  
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
    con.close();  
    }catch(Exception e){ System.out.println(e);}  
    }  
    }  