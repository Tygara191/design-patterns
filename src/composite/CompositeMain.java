package composite;

public class CompositeMain {

	public static void main(String[] args) {

		Manager manager1 = new Manager("Stamat", 5000);
		Developer dev1 = new Developer("Georgi", 4000);
		Developer dev2 = new Developer("Peter", 3000);
		
		manager1.add(dev1);
		manager1.add(dev2);
		
		Manager manager2 = new Manager("Stoyan", 7000);
		Developer dev3 = new Developer("Stavri", 6000);
		
		manager2.add(manager1);
		manager2.add(dev3);
		
		manager2.printData();
		
	}

}
