package func;

public class TestPeople {

	public static void main(String[] args) {
		//global variable
		People p = new People();
		p.height = 1.75;
		p.weight = 65;
		//會進入封包去看程式
		double bmi = p.getBMI();//
		System.out.printf("BMI=%.1f,%s%n",bmi,bmi>People.overWeightBMI?"過重":"正常");
		
		double bmi2 = People.BMI(80,1.7);
		System.out.println("static BMI="+bmi2);
		//靜態方法在eclipse會用斜體表示，物件是用正體顯示
		System.out.println(String.join("#","AA","BB","CC"));
		//AA#BB#CC
	}

}
