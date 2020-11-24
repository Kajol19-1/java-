import java.lang.*;

public class Flat extends Room
{
	public double kitchencost;
	public double terracecost;
	
	public  Flat()
	{
		
	}
	public Flat(int decorationcost,double paintcost,double flooringcost,double kitchencost,double terracecost)
	{
		super(decorationcost,paintcost,flooringcost);
		this.kitchencost = kitchencost;
		this.terracecost = terracecost;
	}
	public void setKitchencost(double kitchencost)
	{
		this.kitchencost = kitchencost;
	}
	public double getKitchencost()
	{
		return kitchencost;
	}
	public void setTerracecost(double terracecost)
	{
		this.terracecost = terracecost;
	}
	public double getTerracecost()
	{
		return terracecost;
	}
	
	public double FlatTotalcost()
	{
	return flooringcost+(kitchencost+terracecost);
    }
    public void print_showFlatCost()
   {
	double FlatTotalcost = FlatTotalcost();
	System.out.println("Flat Total cost:" +FlatTotalcost);
   }

	
	
}