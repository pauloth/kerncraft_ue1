/**
 * 
 * The class Village describes a Village with name, population, amount of houses and a mayor
 * - It has to have a name
 * 
 * @author Paul Jureschek, Michael Kinzkhofer
 * 
 * 
 *
 */


public class Village {
	private String name;
	private int amountHouses;
	private int population;
	private Villager mayor;
	
	public Village(String name) {
		amountHouses = 1;
		population = 2;
		this.name = name;
	}
	
	/**
	 * 
	 * @return name of Village
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @return amountHouses in Village
	 */
	public int getAmountHouses() {
		return amountHouses;
	}
	
	/**
	 * 
	 * @return population in Village
	 */
	public int getPopulation() {
		return population;
	}
	
	/**
	 * 
	 * @return mayor of Village
	 */
	public Villager getMayor() {
		return mayor;
	}
	
	/**
	 * 
	 * @param amountHouses Houses that will be added
	 * @param amountInhabitants Inhabitants that will be added
	 * 
	 * Won't change variables and quit printing errors if houses will be more than 30, less than 2 inhabitants are added for each house or population will be more than 100 or than 0
	 */
	
	public void buildHouse(int amountHouses, int amountInhabitants) {
		if (amountHouses + amountHouses > 30) {
			System.out.println("This Village would have more than 30 inhabitants by adding " + amountHouses + " Houses. That is too much!");
			return;
		}
		
		if (amountInhabitants < (amountHouses * 2)) {
			System.out.println("Too less Inhabitants added. Need to add at least 2 per house");
			return;
		}
		
		if (isNewPopulationOK(amountInhabitants)) {
			population += amountInhabitants;
		} else {
			return;
		}
		
		this.amountHouses += amountHouses;
	}
	
	/**
	 * adds exactly one inhabitant to population when called
	 * Only increased if population stays less or equal 100 and not less than 0
	 */
	
	public void addInhabitant() {
		if (isNewPopulationOK(1)) {
			population++;
		}
	}
	
/**
 * 
 * @param amount amount that will be added to village's population
 * Only increased if population stays less or equal 100 and not less than 0
 */
	public void addInhabitant(int amount) {
		if (isNewPopulationOK(amount)) {
			population += amount;
		}
	}
	
	
	/**
	 * 
	 * @return Villager Object of new mayor
	 * 
	 * elects new mayor of Village, a default name is used for him/her
	 */
	public Villager electMayor() {
		final String name = "Mayor Bob";
		
		mayor = new Villager(name);
		return mayor;
		
	}
	
	/**
	 * Only used in this class to prevent code duplication
	 * 
	 * @param amount that is added to population and checked if it's less than 0 or more than 100
	 *
	 * @return
	 */
	private boolean isNewPopulationOK(int amount) {
		if (population + amount > 100) {
			System.out.println("This Village would have more than 100 inhabitants by adding " + amount + " inhabitants. That is too much!");
			return false;
		} else if (population + amount < 0) {
			System.out.println("This Village would have less than 0 inhabitants by adding " + amount + " inhabitants. That is not possible!");
			return false;
		}
		return true;
	}
	
	
}
