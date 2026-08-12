package webster.hr;

public class MarketingSpecialist extends Staff
{

	private String campaignType;
    private int campaigns;

    public MarketingSpecialist()
    {
        super();
        campaignType = "Online";
        campaigns = 0;
    }

    public MarketingSpecialist(String firstName, String lastName, int id,
                               double salary, double bonus, String address,
                               String campaignType, int campaigns)
    {
        super(firstName, lastName, id, salary, bonus, address);
        this.campaignType = campaignType;
        this.campaigns = campaigns;
    }

    public String getCampaignType()
    {
        return campaignType;
    }

    public void setCampaignType(String campaignType)
    {
        this.campaignType = campaignType;
    }

    public int getCampaigns()
    {
        return campaigns;
    }

    public void setCampaigns(int campaigns)
    {
        this.campaigns = campaigns;
    }

    public void launchCampaign()
    {
        System.out.println(getFirstName() + " is launching a " + campaignType + " campaign.");
    }

    public void analyzePerformance()
    {
        System.out.println(getFirstName() + " analyzed " + campaigns + " campaigns.");
    }

    @Override
    public String toString()
    {
        return super.toString() + " MarketingSpecialist [campaignType=" + campaignType +
               ", campaigns=" + campaigns + "]";
    }

}
