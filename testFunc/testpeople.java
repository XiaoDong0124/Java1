package testFunc;

import func.People;

public class testpeople {

	public static void main(String[] args) {	
		people p = new people();
		p.height=1.9;
		p.weight=80;
		double bmi0=p.getBMI();
		System.out.printf("BMI=%.1f,%s%n",bmi0,bmi0>p.overWeightBMI?"過重":"正常");
		
		double bmi1=people.BMI(1.9,80);
		System.out.println(bmi1);
	}

}
