package ie.lyit.hotel;



public class Adress implements java.io.Serializable{
	private String street;
	private String town;
	private String land;
	private int streetNr;
	
	public Adress() {
		street = "";
		town = "";
		land = "";
		streetNr = 0;
	}
	public Adress(String street, String town, String land, int streetNr) {
		this.street = street;
		this.town = town;
		this.land = land;
		this.streetNr= streetNr;
	}
	
	public String toString()
	{
		return street + " , " + streetNr + " , " + town + " , " + land;
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Adress)
		{
			Adress adress = (Adress) obj;
			if(adress.getStreet() == this.street &&
			   adress.getTown() == this.town &&
			   adress.getLand() == this.land &&
			   adress.getStreetNr() == this.streetNr)
				return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	public int getStreetNr() {
		return streetNr;
	}
	public void setStreetNr(int streetNr) {
		this.streetNr = streetNr;
	}
	
	
	
	
}
