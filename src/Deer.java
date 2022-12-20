
public class Deer implements IAnimal {
	
int consumedCalories = 0;

@Override
public void eat(FoodType itEats, int calories) {
	
	// Deer - Will only eat Plants, needs 1200 calories
	if(itEats == FoodType.PLANTS  ) {
		consumedCalories += calories;
	}	
}

@Override
public int requiredCalories() {
	return 1200;
}

@Override
public boolean isSated() {
	if (consumedCalories >= requiredCalories()) {
		System.out.println(" Deer is sated ");
		return true;
	} else {
		
		return false;		
	}
}	

}
