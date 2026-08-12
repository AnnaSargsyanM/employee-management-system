package webster.hr;

public class Consultant extends Staff
{
	private String specialty;
    private int projects;
    
    public Consultant()
    {
        super();
        specialty = "General";
        projects = 0;
    }

    public Consultant(String firstName, String lastName, int id,
                      double salary, double bonus, String address,
                      String specialty, int projects)
    {
        super(firstName, lastName, id, salary, bonus, address);
        this.specialty = specialty;
        this.projects = projects;
    }

	public String getSpecialty()
	{
		return specialty;
	}

	public void setSpecialty(String specialty)
	{
		this.specialty = specialty;
	}

	public int getProjects()
	{
		return projects;
	}

	public void setProjects(int projects)
	{
		this.projects = projects;
	}

	public void adviseClient()
	{
	    System.out.println(getFirstName() + " is advising clients in " + specialty);
	}

	public void reportProgress()
	{
	    System.out.println(getFirstName() + " is working on " + projects + " projects.");
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "Consultant [specialty=" + specialty + ", projects=" + projects + "]";
	}
	
	
}
