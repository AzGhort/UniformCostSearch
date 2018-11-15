
public class City 
{
	public String name;
	public City[] neighbourCities ;
	public int[] pathCosts;
	
	public City()
	{
		
	}
	
	public City(String nam, City[] neighbs, int[] pathCosts)
	{
		name = nam;
		neighbourCities = neighbs;
		this.pathCosts = pathCosts;
	}
}
