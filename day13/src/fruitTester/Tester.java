package fruitTester;


import java.util.Arrays;
import java.util.List;

import fruit.Apple;
import fruit.Banana;
import fruit.Cherry;
import fruit.Fruit;
import fruit.Mango;

public class Tester {
	public static void main(String[] args) {

		try {
			List<Fruit> fruit = Arrays.asList(new Apple("Apple"), new Banana("Banana"), new Cherry("Cherry"), new Mango("Mango"));
			fruit.stream().filter(s->s.taste().contains("sweet")).forEach(s->System.out.println(s.getName()+" is a sweet fruit"));;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

