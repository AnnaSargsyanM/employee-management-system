package webster.hr;

public class Hourly extends Employee
{
	private double hourlyRate;
    private String startTime;
    private String endTime;
    private String address;

    public Hourly()
    {
        super();
        hourlyRate = 0.00;
        startTime = "00:00";
        endTime = "00:00";
        address = "N/A";
    }

    public Hourly(String firstName, String lastName, int idNumber,
                  double hourlyRate, String startTime, String endTime, String address)
    {
        super(firstName, lastName, idNumber);
        this.hourlyRate = hourlyRate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.address = address;
    }

	public double getHourlyRate()
	{
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}

	public String getStartTime()
	{
		return startTime;
	}

	public void setStartTime(String startTime)
	{
		this.startTime = startTime;
	}

	public String getEndTime()
	{
		return endTime;
	}

	public void setEndTime(String endTime)
	{
		this.endTime = endTime;
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
		return super.toString() + " Hourly [hourlyRate=" + hourlyRate + ", startTime=" + startTime + ", "
				+ "endTime=" + endTime + ", "+ "address=" + address + "]";
	}
}
