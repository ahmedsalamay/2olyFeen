import javax.swing.JOptionPane;

public class CheckInController {
	private CheckInModel checkk=new CheckInModel();
	
	public CheckInController() {
		// TODO Auto-generated constructor stub
	}
	public void SaveCheckin(String Text,PlaceModel place,UserModel user)
	{
		
		checkk.SaveCheckin(Text, place, user);
		
	}
	public void GetCheckin(String name)
	{
		checkk.GetCheckin(name);
	}
	public void UpdateCheckin(String name,String Text)
	{
		checkk.UpdateCheckin(name, Text);
	}
}
