/**
 * The class Villager describes one Villager - 
 * It must have a name
 * @author Paul Jureschek, Michael Kinzkhofer
 *
 */

public class Villager {
	private String name;
	
	/**
	 * 
	 * @param name name of village
	 */
	public Villager(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return name of village
	 */
	public String getName() {
		return name;
	}
}
