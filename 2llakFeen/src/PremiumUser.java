
public class PremiumUser extends UserController {

	public PremiumUser() {
		// TODO Auto-generated constructor stub
	}
	public boolean verifycreditcard(String CreditCard)
	{
		return true;
		
		
	}
	public void signup( String uname,String password,int type,String email,String CreditCard)
	{
if(verifycreditcard(CreditCard)==true){
		UserModel user=new UserModel();
		user.addNewUser(  uname,password,type,email,CreditCard);
}

		
	}
}
