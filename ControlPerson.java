package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControlPerson {

    ConnectDb connect = new ConnectDb();

    public String validateUsers(User user) throws SQLException// as it returns the user name to display
    {
       
        String username=null;
        connect.connects();
        String str="select username FROM mainuser where ID=? and PASSWORD=? and USERTYPE=?";
        PreparedStatement ps=connect.conn.prepareStatement(str);
        ps.setString(1,user.getUserId());
        ps.setString(2,user.getPassword());
        ps.setString(3,user.getUserType());
        
        ResultSet rs=ps.executeQuery();
       if(rs.next())
       {
           System.out.println("hello");
            username=rs.getString(1); // 1 because there is only 1 thing in resultset that is username which iscome from query
           
       }
      return username;
    
      
    }
    
    public void insert(ModelPerson mod) {
        try {
            connect.connects();
            PreparedStatement pst = connect.conn.prepareStatement("INSERT INTO person (first_name, last_name, office ,dob,id,password) VALUES (?, ?, ?,?,?,?)");
            
            pst.setString(1, mod.getFirst_name());
            pst.setString(2, mod.getLast_name());
            pst.setString(4, mod.getDob());
            pst.setString(3, mod.getOffice());
            pst.setInt(5,mod.getId());
            pst.setString(6, mod.getPass());
            pst.executeUpdate();
           
            connect.disconnect();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
    }
    
    public boolean attendence(ModelAttendence mod) throws SQLException
    {
       
            
        connect.connects();
            PreparedStatement pst2 = connect.conn.prepareStatement("INSERT INTO present (date ,name,roll) VALUES (?,?,?)");
            pst2.setString(1, mod.getDate());
            pst2.setString(2,mod.getName());
            pst2.setString(3,mod.getRoll());
             
              int x=pst2.executeUpdate();
              connect.disconnect();
        if(x==0)
        {
            return false;
        }
        else
        {
            return true;
        }
        
            
            
    }
        
    
    public StudentPojo validateStudents(StudentPojo student) throws SQLException// as it returns the user name to display
    {
       
        String username=null;
        connect.connects();
        StudentPojo stu= new StudentPojo();
        String str="select first_name FROM person where office=? and PASSWORD=?";
        PreparedStatement ps=connect.conn.prepareStatement(str);
        ps.setString(1,student.getId());
        ps.setString(2,student.getPassword());
        
        ResultSet rs=ps.executeQuery();
        if(rs.next())
       {
           
            username=rs.getString(1); // 1 because there is only 1 thing in resultset that is username which iscome from query
           stu.setId(student.getId());
           stu.setUsername(username);
       }
      return stu;
    
      
    }

}
