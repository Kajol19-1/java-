import java.lang.*;

public class Room
{
    protected double decorationcost;
    protected double paintcost;
    protected double flooringcost;
 
public Room()
{
	
}
public Room(double decorationcost,double paintcost,double flooringcost)
{
	this.decorationcost = decorationcost;
	this.paintcost = paintcost;
	this.flooringcost = flooringcost;
}
public void showDetails()
	{
		System.out.println("Decoration Cost:" +decorationcost);
		System.out.println("Paint Cost:" +paintcost);
		System.out.println("Flooring Cost:" +flooringcost);
	}
public void setDecorationcost(double decorationcost)
{
	this.decorationcost = decorationcost;
}
public double getDecorationcost()
{
	return decorationcost;
}
public void setPaintcost(double paintcost)
{
	this.paintcost = paintcost;
}
public double getPaintcost()
{
	return paintcost;
}
public void setFlooringcost(double flooringcost)
{
	this.flooringcost = flooringcost;
}
public double getFlooringcost()
{
	return flooringcost;
}
public double Totalcost()
{
	return decorationcost+paintcost+flooringcost;
}
public void print_showCost()
{
	double Totalcost = Totalcost();
	System.out.println("Total cost:" +Totalcost);
}
	
}
	
