package webster.hr;

public class Employee 
{
	private String firstName;
	private String lastName;
	private int idNumber;
	
	public Employee()
    {
        firstName = "N/A";
        lastName = "N/A";
        idNumber = 0;
    }

    public Employee(String firstName, String lastName, int idNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public int getIdNumber() 
	{
		return idNumber;
	}

	public void setIdNumber(int idNumber) 
	{
		this.idNumber = idNumber;
	}

	@Override
	public String toString() 
	{
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", idNumber=" + idNumber + "]";
	}
}
