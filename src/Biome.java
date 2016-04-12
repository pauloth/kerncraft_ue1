/**
 * 
 * This class provides a "Biome", which can store one Village - 
 * It has to have a name and a kind (e.g. "desert", "gras"...)
 *
 * 
 * @author Paul Jureschek, Michael Kinzkhofer
 * 
 */


public class Biome {
	private String name;
	private String kind;
	private Village village;

	/**
	 * Generates new Biome object
	 * 
	 * @param name name of biome
	 * @param kind kind of biome (e.g. "desert", "gras"...)
	 */
	public Biome(String name, String kind) {
		this.name = name;
		this.kind = kind;
	}

	/**
	 * 
	 * @return name of Biome
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return kind of Biome (e.g. "desert", "gras"...)
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * 
	 * @return Village saved in Biom (built on Biome)
	 */
	public Village getVillage() {
		return village;
	}
	
	/**
	 * Adds existing village to Biom
	 * @param village Element of type Village that should be added to this Biom
	 */
	
	public void addVillage(Village village) {
		this.village = village;	
	}


}


