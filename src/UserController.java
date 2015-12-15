
public class UserController {

	public UserController() {
		// TODO Auto-generated constructor stub
	}
	

	public void Logoin(String email,String password)
	{
		
		
		UserModel user=new UserModel();
		if(user.getUser(email,password)==1){
		 
			
			// enter home page
		}
		else {
			//error
		}
	}
	public void ForgetPassword(String email)
	{
		
		UserModel user=new UserModel();
		if(user.getUser(email)==1){
			user.updateUser(email);
		}
		
	}
	public void SendFriendRequest()
	{
		/* lama el user y3ml add li 7ad hyta5d el ID bta3 eli et3mlo add yt7t 
		3and el user eli 3ml add fe table w yt7t gambo bool false w yta5d el 
		ID bta3 el user eli 3ml add yta7t 3and el user eli m3mlo add w yt7at 
		gambo bool false */
		
	}
	public void AcceptFriendRequest()
	{
		// lw el user 3aml accept li request galo yt3ml el booleaneen el etneen b true
		
		
	}
	/*public void GetCurrentActiveUser()
	{
		
		
	}*/
}
