package webster.hr;

public class Staff extends Employee
{
	private double salary;
	private double bonus;
	private String address;

	public Staff()
	{
		super();
		salary = 0.00;
		bonus = 0.00;
		address = "N/A";
	}

	public Staff(String firstName, String lastName, int idNumber, double salary, double bonus, String address)
	{
		super(firstName, lastName, idNumber);
		this.salary = salary;
		this.bonus = bonus;
		this.address = address;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public double getBonus()
	{
		return bonus;
	}

	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	@Override
	public String toString()
	{
		return super.toString() + " Staff [salary=" + salary + ", bonus=" + bonus + ", address=" + address + "]";
	}
}
