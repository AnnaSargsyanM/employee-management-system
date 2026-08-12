package webster.hr;

public class Clerk extends Hourly
{

	private String department;
    private int itemsStocked;

    public Clerk()
    {
        super();
        department = "General";
        itemsStocked = 0;
    }

    public Clerk(String firstName, String lastName, int id,
                 double hourlyRate, String startTime, String endTime, String address,
                 String department, int itemsStocked)
    {
        super(firstName, lastName, id, hourlyRate, startTime, endTime, address);
        this.department = department;
        this.itemsStocked = itemsStocked;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public int getItemsStocked()
    {
        return itemsStocked;
    }

    public void setItemsStocked(int itemsStocked)
    {
        this.itemsStocked = itemsStocked;
    }

    public void organizeShelves()
    {
        System.out.println(getFirstName() + " is organizing shelves in the " + department + " department.");
    }

    public void stockItems()
    {
        System.out.println(getFirstName() + " stocked " + itemsStocked + " items today.");
    }

    @Override
    public String toString()
    {
        return super.toString() +
               " Clerk [department=" + department +
               ", itemsStocked=" + itemsStocked + "]";
    }

}
