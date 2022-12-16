// Bush - "Eats" only light and needs only 50 calories a day
//(Yes, we know a bush is not actually an animal. Use your imagination. 😁)


public class Bush implements IAnimal {
	
	int consumedCalories = 0;
	
	@Override
	public void eat(FoodType itEats, int calories) {
		if (itEats == FoodType.LIGHT ) {
			consumedCalories += calories;
		}
		
	}

	@Override
	public int requiredCalories() {
		
		return 50;
	}

	@Override
	public boolean isSated() {
		if (consumedCalories >= requiredCalories()) {
			System.out.println(" Bush is sated ");
			return true;
		} else {
			return false;		
		}		
	}
}
