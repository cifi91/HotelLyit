package ie.lyit.hotel;

public class Date implements java.io.Serializable{
	
	private int day;
	private int month;
	private int year;
	
	public Date()
	{
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}
	
	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setDay(int day)
	{
		this.day = day;
	}
	
	public int getDay()
	{
		return this.day;
	}
	
	public void setMonth(int month)
	{
		this.month = month;
	}
	
	public int getMonth()
	{
		return this.month;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public String toString()
	{
		return day + "." + month + "." + year;
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Date)
		{
			Date date = (Date) obj;
			if(date.getDay() == this.day &&
			   date.getMonth() == this.month &&
			   date.getYear() == this.year)
				return true;
		}
		return false;
	}
}
