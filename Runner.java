package webster.hr;

public class Runner
{
	public static void main(String[] args)
    {
        Consultant consultant1 = new Consultant("Jasmine", "Bale", 111,
                75000.00, 6500.00, "123 Edgar Rd",
                "Technology", 3);

        MarketingSpecialist marketing1 = new MarketingSpecialist("Emily", "Blake", 122,
                78000.00, 7000.0, "456 Park Ave",
                "Social Media", 5);

        Clerk clerk1 = new Clerk("James", "Wood", 222,
                18.50, "8:00 AM", "4:00 PM", "789 W Pine Blvd",
                "Electronics", 120);

        SalesAssociate sales1 = new SalesAssociate("Eliza", "Lee", 233,
                19.75, "10:00 AM", "6:00 PM", "999 Glen Park St",
                8, "Clothing");

        System.out.println(consultant1.toString());
        consultant1.adviseClient();
        consultant1.reportProgress();

        System.out.println(marketing1.toString());
        marketing1.launchCampaign();
        marketing1.analyzePerformance();

        System.out.println(clerk1.toString());
        clerk1.organizeShelves();
        clerk1.stockItems();

        System.out.println(sales1.toString());
        sales1.assistCustomer();
        sales1.recordSales();

        System.out.println("The above program was written by: Anna Sargsyan");
    }
}
