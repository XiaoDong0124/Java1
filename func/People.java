package func;

public class People {
	//靜態屬性or類別屬性,跟著設計圖跑,設計圖只有一份,產生物件不會額未產生
	static double overWeightBMI = 24;//系統常數，不會變換
	//BMI=weight_kg / height_m**2
	//類別方法or靜態方法,不需要物件,不能使用物件屬性,需要的資料(w,h)必須透過參數傳入
	public static double BMI(double w , double h) {
		return w/(h*h);
	}
	//上面都是靜態 不需要物件，只是設計圖
//--------------------------------------------	
	
	double height;
	double weight;
	//物件方法
	public double getBMI() {
		//this
		//double bmi = weight/(height*height);
		double bmi =People.BMI(weight , height);
		return bmi;
		
	}
}
