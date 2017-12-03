package ie.lyit.hotel;

public class Name implements java.io.Serializable
{
	private String title;
	private String firstName;
	private String surname;
	
	public Name()
	{		
		title = null;
		firstName = null;
		surname = null;
		
		return;
	}
	
	public Name(String title, String firstName, String surname)
	{
		this.title = title;
		this.firstName = firstName;
		this.surname = surname;
		
		return;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getSurname()
	{
		return this.surname;
	}
	
	public String toString()
	{
		return title + " " + firstName + " " + surname;
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Name)
		{
			Name checkedObj = (Name)obj;
			if(	this.title.equals(checkedObj.getTitle()) && 
				this.firstName.equals(checkedObj.getFirstName()) && 
				this.surname.equals(checkedObj.getSurname()))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public boolean isFemale()
	{
		if( this.title.equals("Miss") ||
			this.title.equals("Ms") ||
			this.title.equals("Mrs"))
			return true;
			
		return false;
	}
	
}
