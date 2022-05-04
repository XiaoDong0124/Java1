package array;

import java.util.Iterator;

public class Homework {

	public static void main(String[] args) {
		double [] x = {1.1,2.0,1.2,1.4,0.5,6.0};
		double y = 0;
		double max = x[0];
		double min = x[0];
		for (int i=0;i<x.length ; i++) {
			 y+= x[i];
			 if (x[i]>max) {max=x[i];}
			 if (x[i]<min) {min=x[i];}
			 
			}
		System.out.printf("平均數=%f%n",y/(x.length));
		System.out.printf("最大值=%f%n",max);
		System.out.printf("最小值=%f%n",min);
		System.out.println("_____________________________");
		for (int i=1;i<=4 ; i++) {
			System.out.println("*");
			
		}
	}

}
