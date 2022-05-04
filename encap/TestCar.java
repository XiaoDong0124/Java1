package encap;


public class TestCar {

	public static void main(String[] args) {
		
//		Car c=new Car();
		Car c =new Car("Prius","紅色");
		//c.model = "Prius";
//		c.setModel("Prius");
		//c.price = 100000;
		System.out.printf("車子型號:%s,價錢:%d,顏色:%s%n",c.getModel(),c.getPrice(),c.getColor());
	

	}

}
