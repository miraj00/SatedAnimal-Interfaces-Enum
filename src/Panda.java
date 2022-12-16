/*
 * Panda - Eats only plants, 
 * their bodies are very inefficient so 
 * they only take in 50% of the calories they eat, 
 * they need 3000 calories per day
 */

public class Panda implements IAnimal{

	int consumedCalories = 0;
	int plantCalories = 0;
	int intakeCalories = 0;
	@Override
	public void eat(FoodType itEats, int calories) {

		if ( itEats == FoodType.PLANTS) {	
			intakeCalories += calories; 
			plantCalories += (calories/2 );
			consumedCalories += plantCalories; 
		}		
	}

	@Override
	public int requiredCalories() {
		// TODO Auto-generated method stub
		return 3000;
	}

	@Override
	public boolean isSated() {
		if (consumedCalories >= requiredCalories()) {
			System.out.println(" Panda is sated ");
			return true;
		} else {
			System.out.println("Panda's ConsumedCalories :" + consumedCalories + " Plant Calories : " + plantCalories +  " Plant Intake calories : " + intakeCalories);
			return false;
			
		}
	}

}
