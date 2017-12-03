package ie.lyit.hotel;

public class Employee extends Person implements Payable {
	
	private Date dateOfBirth;
	private Date startDate;
	private double salary;
	private int number;
	private static int nextNumber = 1;
	
	public Employee() {
		super();
		dateOfBirth = new Date();
		startDate = new Date();
		salary = 0;
		number = nextNumber++;
	}
	
	public Employee(String t, String fn, String sn, String l, String tow, String street, int streetNr, int phoneNr,
			int dayBirth, int monthBirth, int yearBirth, int dayStart, int monthStart, int yearStart, double sal) {
		super(t, fn, sn, l, tow, street, streetNr, phoneNr);
		dateOfBirth = new Date(dayBirth, monthBirth, yearBirth);
		startDate = new Date(dayStart, monthStart, yearStart);
		salary = sal;
		number = nextNumber++;
		
	}

	
	public String toString()
	{
		
		return super.toString() + " , " + dateOfBirth + " , " + startDate + " , " + salary + " , " + number;
	}
	
	
	public boolean equals(Object obj)
	{
		super.equals(obj);
		
		if(obj instanceof Employee)
		{
			Employee checkedObj = (Employee)obj;
			if(	this.dateOfBirth.equals(checkedObj.getDateOfBirth()) && 
					this.startDate.equals(checkedObj.getStartDate()) &&
					this.salary == (checkedObj.getSalary())	&&
					this.number == (checkedObj.getNumber()))
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public double calculateWage(double taxPercentage) {
		
		return salary/12 * taxPercentage/100;
	}

	@Override
	public double incrementSalary(double incrementAmount) {
	
		if(salary < 1500000) {
			
			salary = salary + incrementAmount;
			
		}
		return salary;
	}


	
	
	
	
	
}
