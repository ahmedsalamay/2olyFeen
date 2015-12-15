import javax.swing.JOptionPane;

public class PlaceController {

	public PlaceController() {
		// TODO Auto-generated constructor stub
	}
	public void	SearchController (String name ) {
	PlaceModel p=new PlaceModel();
		p.SearchModel ( name );
		
	}
	public void addNewPlaceControler(String name,String description) {
		PlaceModel p=new PlaceModel();
		p.addNewPlace(name,description);
	}
	public void 	rateAPlaceControler (String Name,Double rate ) {
		PlaceModel p=new PlaceModel();
		p.rateAPlace ( Name, rate );
	}
	public void 	checkInAtAPlaceController (String name ) {
		PlaceModel p=new PlaceModel();
		p.checkInAtAPlace (name );
	}
}
