import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		printSizeElement("Ferrari", "Audi", "Panda");
	}

	public static void printSizeElement(String element1, String element2, String element3){
		Set<String> cars = new HashSet<String>();

		cars.add(element1);
		cars.add(element2);
		cars.add(element3);

		for (String car : cars) {
			System.out.println(car);
		}
		System.out.println(cars.size());
	}
}