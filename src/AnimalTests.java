import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AnimalTests {
	
	@Test
	void DeerTest1(){
			
	Deer deer = new Deer();
	deer.eat(FoodType.PLANTS, 1199);
	deer.eat(FoodType.MEAT, 1199);
	deer.eat(FoodType.LIGHT, 300);
	boolean expected = false;
	boolean actual = deer.isSated();
	assertEquals(expected, actual);
	}
	
	
	@Test
	void DeerTest2(){
			
	Deer deer = new Deer();
	deer.eat(FoodType.PLANTS, 1100);
	deer.eat(FoodType.MEAT, 1199);
	deer.eat(FoodType.PLANTS, 500);
	boolean expected = true;
	boolean actual = deer.isSated();
	assertEquals(expected, actual);
	}
	
	
	@Test
	void BushTest1(){
			
	Bush bush = new Bush();
	bush.eat(FoodType.PLANTS, 100);
	bush.eat(FoodType.MEAT, 200);
	bush.eat(FoodType.LIGHT, 40);
	boolean expected = false;
	boolean actual = bush.isSated();
	assertEquals(expected, actual);
	}
	
	@Test
	void BushTest2(){
			
	Bush bush = new Bush();

	bush.eat(FoodType.LIGHT, 200);
	boolean expected = true;
	boolean actual = bush.isSated();
	assertEquals(expected, actual);
	}
	
	@Test
	void PigTest1(){
			
	Pig pig = new Pig();
	pig.eat(FoodType.PLANTS, 2000);
	pig.eat(FoodType.MEAT, 900);
	boolean expected = false;
	boolean actual = pig.isSated();
	assertEquals(expected, actual);
	}
	
	@Test
	void PigTest2(){
			
	Pig pig = new Pig();
	pig.eat(FoodType.PLANTS, 2000);
	pig.eat(FoodType.MEAT, 1500);
	boolean expected = true;
	boolean actual = pig.isSated();
	assertEquals(expected, actual);
	}
	
	
	
	
	
	
}
