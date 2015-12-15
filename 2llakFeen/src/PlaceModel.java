import javax.swing.JOptionPane;

public class PlaceModel {
private int ID;
private String name;
private Double rate;
private int numberofcheckins;
private String description;
	public PlaceModel() {
		// TODO Auto-generated constructor stub
		ID=0;
		name="";
		rate=0.0;
		numberofcheckins=0;
		description="";
	}
	public PlaceModel(int iD, String name, Double rate, int numberofcheckins,
			String description) {
	
		this.ID = iD;
		this.name = name;
		this.rate = rate;
		this.numberofcheckins = numberofcheckins;
		this.description = description;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public int getNumberofcheckins() {
		return numberofcheckins;
	}
	public void setNumberofcheckins(int numberofcheckins) {
		this.numberofcheckins = numberofcheckins;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void addNewPlace(String name,String description) {
		//add fe el data base w zeros lil ba2i
	}
	public void 	rateAPlace (String name,Double rate ) {
		if(found(name)==1){
			//update  with this rate
		}
		else{
			JOptionPane.showMessageDialog(null, " No Place with this name");
		}
	}
	public int found(String name)
	{  boolean found=false;
		// search fe el database b el name w 3'yar found 5leha true lw l2ah 
		if(found){
			return 1;
		}
		else{
			return -1;
		}
	}
	public void	SearchModel (String name ) {
		PlaceModel p=new PlaceModel();
		
		boolean found=false;
		//search data base bl name 3'yar found 5leha true lw l2ah 
		//3aby el 7agat eli fe el data base eli l2eto fe el object
		if(found){
			JOptionPane.showMessageDialog(null,p.toString());

			
		}
		else{
			JOptionPane.showMessageDialog(null, " No Place with this name");
		}
	}
	public void 	checkInAtAPlace (String name ) {
		if(found(name)==1){
			//update  database zwed el nomber of checkin b 1
		}
		else{
			JOptionPane.showMessageDialog(null, " No Place with this name");
		}
	}
	@Override
	public String toString() {
		return "PlaceModel [ID=" + ID + ", name=" + name + ", rate=" + rate + ", numberofcheckins=" + numberofcheckins
				+ ", description=" + description + "]";
	}
	
}
