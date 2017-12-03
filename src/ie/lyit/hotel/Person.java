package ie.lyit.hotel;

public abstract class  Person implements java.io.Serializable{

	protected Name name;
	protected Adress adress;
	protected int phoneNr;
	
	public Person() {
		name = new Name();
		adress = new Adress();
		phoneNr = 0;
	}
	
	public Person(String t, String fn, String sn, String l, String tow, String street, int streetNr, int phoneNr) {
		name = new Name(t,fn, sn);
		adress = new Adress(street, tow, l, streetNr);
		this.phoneNr = phoneNr;
	}

	
	public String toString()
	{
		return name + "," + adress + "," + phoneNr;
	}
	
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Person)
		{
			Person checkedObj = (Person)obj;
			if(	this.name.equals(checkedObj.getName()) && 
				this.adress.equals(checkedObj.getAdress()) && 
				this.phoneNr == checkedObj.getPhoneNr())
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public int getPhoneNr() {
		return phoneNr;
	}

	public void setPhoneNr(int phoneNr) {
		this.phoneNr = phoneNr;
	}
	
	
	
	
}
