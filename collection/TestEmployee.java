package collection;

import java.util.HashSet;
import java.util.Set;
import equals.Employee;
public class TestEmployee {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		Employee e1 = new Employee("001");
		Employee e2 = new Employee("002");//記憶體位置的話就進，equal的一個字一個字 就會擋
		
		set.add(e1);
		set.add(e2);

		System.out.println("size="+set.size());
	}

}
