package supermarket.products;

public class BeverageProduct extends GroceryProduct implements Drinkable {
	
	private SugarLevel SugarLevel;
	
	public BeverageProduct(String name, double price, double discount, SugarLevel SugarLevel) {
		super(name, price, discount);
		
		this.SugarLevel = SugarLevel;
		// TODO Auto-generated constructor stub
	}

	public SugarLevel getSugarLevel() {
		return SugarLevel;
	}

	public void setSugarLevel(SugarLevel sugarLevel) {
		SugarLevel = sugarLevel;
	}
	
	public String toString() {
		return super.toString() + "Sugar level: " + SugarLevel;
	}

	@Override
	public boolean isHealthy() {
		// TODO Auto-generated method stub
		return SugarLevel != SugarLevel.ADDED_SUGAR;
	}
	
}
