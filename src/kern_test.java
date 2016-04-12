
public class kern_test {

	public static void main(String[] args) {
		Biome land = new Biome("mine", "desert");
		Village vill = new Village("first");
		
		land.addVillage(vill);
		
		vill.addInhabitant(0);
		vill.buildHouse(10, 20);
		
		
		System.out.println(vill.electMayor().getName());
		System.out.println("houses: " + vill.getAmountHouses() + " inhabitants: " + vill.getPopulation());

	}

}
