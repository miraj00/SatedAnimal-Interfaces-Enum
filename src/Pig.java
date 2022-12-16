/*
 * Pig - Will eat anything and needs 3000 calories, 
 * it needs 1000 meat calories and 1000 plant calories to be sated
 */

public class Pig implements IAnimal {

	
	int consumedCalories = 0;
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
		
		return 3000;
	}

	@Override
	public boolean isSated() {
		int consumedCalories = plantCalories + meatCalories;
		
		if (consumedCalories >= requiredCalories() && plantCalories >= 1000 && meatCalories >= 1000) {
			System.out.println(" Pig is sated ");
			return true;
		} else {
			System.out.println("Pig's ConsumedCalories :" + consumedCalories + " & meat caloried : " + meatCalories
					+ " Plant calories : " + plantCalories);
			return false;	
		}
		
	}

}
