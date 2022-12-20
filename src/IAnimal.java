
/*
 * Next create an Animal interface with the following: 
	A public void eat() method that takes in FoodType and calories as parameters
	Each animal will have a required amount of calories needed per day. How do you represent that using an interface?
	Create an isSated() method. This should return a boolean and when called should check the conditions for the animal to be sated. 
 */


public interface IAnimal {

	void eat(FoodType itEats, int calories);
	
	int requiredCalories();
	
	boolean isSated();
}
