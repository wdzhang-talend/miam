package my.food;

import java.util.ArrayList;
import java.util.List;


public class ChaShaoBao implements Food {
	
	public ChaShaoBao(){
		ingredients.add("pork");
		ingredients.add("oyster sauce");
		ingredients.add("bread");
	}

	List<String> ingredients = new ArrayList<String>();
	
	/* Exercise 1: implement Constructor */
	
	@Override
	public List<String> getIngredients() {
		return ingredients;
	}

	@Override
	public String getCountryOrigin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCalory() {
		// TODO Auto-generated method stub
		return null;
	}

}
