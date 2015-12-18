package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Model.PlaceModel;
import Model.UserModel;

public class Database {
	 public Connection connect = null;
	 public Statement statement = null;
	 public PreparedStatement preparedStatement = null;
	 public ResultSet resultSet = null;
	 
//**********************connect database**********************************************************	 
	 public void readDataBase() throws Exception 
	 {
		 Class.forName("com.mysql.jdbc.Driver");
		 connect = DriverManager
		          .getConnection("jdbc:mysql://localhost:3306/2alakfeen", "root","");
		 statement = connect.createStatement();
	 }

	 
//**********************user model functions*******************************************************	 
     public void addUser( String uname,String password,String email,String type,String CreditCard) throws SQLException
		 {
    	 
    	 preparedStatement = connect.prepareStatement("insert into user values ( default, ?, ?, ?, ?, ?)");
    	 preparedStatement.setString(1, uname);
    	 preparedStatement.setString(2, password);
    	 preparedStatement.setString(3, type);
		 preparedStatement.setString(4, email);
		 
		 preparedStatement.setString(5, CreditCard);
	     preparedStatement.executeUpdate();
		 }
	 public int searchUser(String mail, String passWord) throws Exception
	 { 
		 
		 resultSet = statement.executeQuery("select ID  from user where email= '"+mail+"' AND password = '"+passWord+"'");
		 int userNum = -1;
		 while (resultSet.next()) {
			
			  userNum=resultSet.getInt("ID");
		 }
		
		 return userNum;
	 }
	 public UserModel searchuserobj(String email) throws SQLException
     { UserModel u= new UserModel();
    	 resultSet = statement.executeQuery("select ID,uname,email,type from user where email= '"+email+"'");
		 int placeNum = -1;
		 while (resultSet.next()) {
			  
			
			u.setUname(resultSet.getString("uname"));
			 u.setType(resultSet.getString("type"));
			 
		 
		 }
		 return u;
     }
	 public int searchUserin(String mail) throws SQLException
	 { 
		 
		 resultSet = statement.executeQuery("select ID  from user where email= '"+mail+"'");
		 int userNum = -1;
		 while (resultSet.next()) {
			  userNum=resultSet.getInt("ID");
		 }
		 return userNum;
	 }
	 
	 
//*********************place model functions*******************************************************
     public void addPlace(String name,String desc) throws SQLException
	 {
		    preparedStatement = connect.prepareStatement("insert into places values ( default,?,default,?,default)");
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, desc);
	        preparedStatement.executeUpdate();
	 }
     public PlaceModel searchplace(String name) throws SQLException
     { PlaceModel p= new PlaceModel();
    	 resultSet = statement.executeQuery("select ID ,name,checkInNO,description ,rate from places where name= '"+name+"'");
		// int placeNum = -1;
		 while (resultSet.next()) {
			  p.setID(resultSet.getInt("ID"));
			 p.setName(resultSet.getString("name"));
		  p.setNumberofcheckins(resultSet.getInt("checkInNO"));
			 p.setRate(resultSet.getDouble("rate"));
			 p.setDescription(resultSet.getString("description"));
		 }
		 return p;
     }
     
     
     public int searchplaceIN(String name) throws SQLException
     { 
    	 resultSet = statement.executeQuery("select ID  from places where name= '"+name+"'");
		int placeNum = -1;
		 while (resultSet.next()) {
			 placeNum =resultSet.getInt("ID");
			 
		 }
		 return  placeNum;
     }
     public void 	rateAPlaceDB (String name,Double rate ) throws SQLException {
    	 
    	 preparedStatement = connect.prepareStatement("update places set rate='"+rate+"' where name = '"+name+"'");
    	
    	 
    	 preparedStatement.executeUpdate();
         
       
    
 	}
 public void 	AddFriendDB (int ID_sender,String emailReciever) throws SQLException {
	 int ID_reciever=searchUserin(emailReciever);
    	
	  preparedStatement = connect.prepareStatement("insert into friends values ( default,?,?,default)");
		preparedStatement.setInt(1, ID_sender);
		preparedStatement.setInt(2, ID_reciever);
      preparedStatement.executeUpdate();
         
       
    
 	}
 public void 	UpdateUserDB (String name,String password ,int ID ) throws SQLException {
	 
	 preparedStatement = connect.prepareStatement("update user set uname ='"+name+"' where ID = '"+ID+"'");
	
	 
	 preparedStatement.executeUpdate();
     
 preparedStatement = connect.prepareStatement("update user set password ='"+password+"' where ID = '"+ID+"'");
	
	 
	 preparedStatement.executeUpdate();

	}
public void 	UpgradeUserDB (String creditcard ,int ID ) throws SQLException {
	 
	 preparedStatement = connect.prepareStatement("update user set creditcard ='"+creditcard+"' where ID = '"+ID+"'");
	
	 
	 preparedStatement.executeUpdate();
     
 

	}
public void CheckInDB(String name,String text,int user_id) throws SQLException{
	
	
	int place_id=searchplaceIN(name);
	
	
	
	  preparedStatement = connect.prepareStatement("insert into checkins_posts values ( default,?,?,?)");
			preparedStatement.setInt(1, place_id);
			preparedStatement.setInt(2, user_id);
			preparedStatement.setString(3, text);
	      preparedStatement.executeUpdate();
	      
	      
	      
	      resultSet = statement.executeQuery("select checkInNO  from places where ID= '"+place_id+"'");
			int checkNO = -1;
			 while (resultSet.next()) {
				 checkNO =resultSet.getInt("checkInNO");
				 
			 }
			 checkNO++;
			 preparedStatement = connect.prepareStatement("update places set checkInNO ='"+checkNO+"' where ID = '"+place_id+"'");
				
			 
			 preparedStatement.executeUpdate();
}

}
