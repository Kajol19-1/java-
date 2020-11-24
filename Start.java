import java.lang.*;

public class Start
{
	public static void main(String arg[])
	{
		Room r1=new Room();
		r1.setDecorationcost(120.3);
		r1.setPaintcost(204.85);
		r1.setFlooringcost(150.00);
		System.out.println("Decoration Cost:" +r1.getDecorationcost());
		System.out.println("Paint Cost:" +r1.getPaintcost());
		System.out.println("Flooring Cost:" +r1.getFlooringcost());
		Room r2=new Room(23.4,56.4,35.5);
		r2.print_showCost();
		
		Flat f1=new Flat();
		f1.setKitchencost(342.4);
		f1.setTerracecost(234.5);
		System.out.println("Kitchen cost:" +f1.getKitchencost());
		System.out.println("Terrace cost:" +f1.getTerracecost());
		
		f1.print_showFlatCost();
	}
	
}