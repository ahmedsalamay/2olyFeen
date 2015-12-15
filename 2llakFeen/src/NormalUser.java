
public class NormalUser extends UserController {

	public NormalUser() {
		// TODO Auto-generated constructor stub
	}
	public void upgrade(String email,String CreditCard)
	{UserModel user=new UserModel();
		user.updateUser(email);
		
		
	}
	
	public void signup( String uname,String password,int type,String email,String CreditCard)
	{

		UserModel user=new UserModel();
		user.addNewUser(  uname,password,type,email,null);
		
	}
	
	

}
