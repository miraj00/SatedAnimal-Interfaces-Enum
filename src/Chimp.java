/*
 * Chimp - Will eat anything, but in order to be sated,
 * they need at least 1000 calories and at least 200 calories of meat
 */

public class Chimp implements IAnimal {

	
	int plantCalories = 0;
	int meatCalories = 0; 
	
	
	@Override
	public void eat(FoodType itEats, int calories) {
		
		if(itEats == FoodType.PLANTS) {
			plantCalories += calories;
		
		} else if (itEats == FoodType.MEAT) {
			meatCalories += calories;
		} 
		
	}

	@Override
	public int requiredCalories() {
		
		return (1000);
	}

	@Override
	public boolean isSated() {
		
		int consumedCalories = plantCalories + meatCalories;
		if (consumedCalories >= requiredCalories() && meatCalories >= 200) {
			System.out.println(" Chimp is sated ");
			return true;
		} else {
			System.out.println("Chimp's ConsumedCalories :" + consumedCalories + " & meat caloried : " + meatCalories);
			return false;	
		}
		
	}

}
