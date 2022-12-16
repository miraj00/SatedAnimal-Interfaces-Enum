/*
 * Wolf - Will only eat meat, needs 800 calories, 
 * but needs to eat at least 4 times before being sated 
 */


public class Wolf implements IAnimal {

	int count = 0;
	int consumedCalories = 0;
	
	@Override
	public void eat(FoodType itEats, int calories) {
		if (itEats == FoodType.MEAT) {
			count++;
			consumedCalories += calories; 
		}
		
	}

	@Override
	public int requiredCalories() {
		
		return 800;
	}

	@Override
	public boolean isSated() {
		if (count >=4 && consumedCalories >= requiredCalories()) {
			System.out.println(" Wolf is sated ");
			return true;
		} else {
			System.out.println(" Wolf ate : " + count + " times only. " + "and consumed calories are : " + consumedCalories);
			return false;
		}
	}

}
