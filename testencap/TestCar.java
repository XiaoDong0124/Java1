package testencap;

public class TestCar {
    public static void main(String[] args) {
        // default constructor
    	Car c =new Car("w");
    	//Car c = new Car("Benz","red");
    	//c.setModel("Yaris");
    	System.out.printf("車子型號:%s,價錢:%d元,顏色:%s%n",c.getModel(),c.getPrice(),c.getColor());
    	
    }
}
