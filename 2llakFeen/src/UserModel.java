
public class UserModel {
private int ID;
private String uname;
private String password;
private int type;
private String email;

	public UserModel( String uname, String password, int type, String email) {
	
	this.uname = uname;
	this.password = password;
	this.type = type;
	this.email = email;
}
	public UserModel() {
		
		uname="";
		password="";
		type=0;
		email="";
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

public void addNewUser( String uname,String password,int type,String email,String CreditCared)
{
	
	// add fe el database
}
public int getUser(String email)
{  boolean found=false;
	// search fe el database b el email w 3'yar found 5leha true lw l2ah 
	if(found){
		return 1;
	}
	else{
		return -1;
	}
}
public int getUser(String email,String Password)
{  boolean found=false;
	// search fe el database b el email w 3'yar found 5leha true lw l2ah 
	if(found){
		return 1;
	}
	else{
		return -1;
	}
}
public void deleteUser(String email)
{
	// search fe el database b el email w shelo
	
}
public void updateUser(String email)
{
	// search fe el database b el email w 3'yar el eli enta 3yzo
	
	
}


}
