package others;

import java.sql.SQLException;

import Controller.UserController;
import Model.UserModel;

public class PremiumUser extends UserController {

	public PremiumUser() {
		// TODO Auto-generated constructor stub
	}
	public boolean verifycreditcard(String CreditCard)
	{
		return true;
		
		
	}
	public void signup( String uname,String password,String email,String type,String CreditCard) throws Exception
	{
		//System.out.println(email);
if(verifycreditcard(CreditCard)==true){
		UserModel user=new UserModel();
		user.addNewUser(  uname,password,email,type,CreditCard);
}

		
	}
}
