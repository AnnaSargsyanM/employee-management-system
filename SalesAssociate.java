package webster.hr;

public class SalesAssociate extends Hourly
{
	private int salesMade;
    private String section;

    public SalesAssociate()
    {
        super();
        salesMade = 0;
        section = "General";
    }

    public SalesAssociate(String firstName, String lastName, int id,
                          double hourlyRate, String startTime, String endTime, String address,
                          int salesMade, String section)
    {
        super(firstName, lastName, id, hourlyRate, startTime, endTime, address);
        this.salesMade = salesMade;
        this.section = section;
    }

    public int getSalesMade()
    {
        return salesMade;
    }

    public void setSalesMade(int salesMade)
    {
        this.salesMade = salesMade;
    }

    public String getSection()
    {
        return section;
    }

    public void setSection(String section)
    {
        this.section = section;
    }

    public void assistCustomer()
    {
        System.out.println(getFirstName() + " is assisting customers in the " + section + " section.");
    }

    public void recordSales()
    {
        System.out.println(getFirstName() + " made " + salesMade + " sales today.");
    }

    @Override
    public String toString()
    {
        return super.toString() + " SalesAssociate [salesMade=" + salesMade +
               ", section=" + section + "]";
    }
}
