package testFunc;

public class people {
	static double overWeightBMI=24;
	double weight;
	double height;
	//BMI=體重/身高平方
	public double getBMI() {
		
		return weight/(height*height);
	}
	public static double BMI(double h, double w) {
		
		return w/(h*h);
	}
	

}
