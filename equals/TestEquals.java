package equals;

public class TestEquals {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("001");
		Employee e2 = new Employee("001");
		
		System.out.println(e1==e2);//0800==0900
		System.out.println(e1.equals(e2));//false.F3
		
		System.out.println(e2);
		System.out.println(e2.toString());
		e1=null;
		
	}

}
