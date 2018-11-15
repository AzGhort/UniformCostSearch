import java.util.List;
import java.util.Vector;

public class RomaniaMapGraph implements Problem<City>
{
	public Vector<City> cities = new Vector<City>();
	private City initialCity;
	
	@Override
	public City initialState() 
	{
		return initialCity;
	}

	@Override
	public List<Integer> actions(City city) 
	{
		List<Integer> acts = new Vector<Integer>();
		for (int i = 0; i < city.neighbourCities.length; i++)
		{
			acts.add(i);
		}
		return acts;
	}

	@Override
	public City result(City city, int action) 
	{
		return city.neighbourCities[action];
	}

	@Override
	public boolean isGoal(City state) 
	{
		return (state.name == "Bucharest");
	}

	@Override
	public int cost(City state, int action) 
	{
		return state.pathCosts[action];
	}

}
