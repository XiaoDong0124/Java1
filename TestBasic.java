
public class TestBasic {

	public static void main(String[] args) {
		
		long salary = 10000;// 劃8bytes的區塊，名字叫做salary

		System.out.println("薪水=" + salary);

		int i = 0, j = 10, k = 2;
		System.out.println(j);
		long a = 2000000000;// 超過21一(int的範圍之後)必須要加L表示為Long型態
		long b = 2100000000L + 2100000000; // 42e,overflow
		System.out.println(b);
		char c = 'a';// 只能單一一個字，稱為字元，單引號
		System.out.println(c);
		boolean paid = true; // true or false
		System.out.println(paid);
		// 8種基本資料型態,4 integer, 2 float*(有精度誤差),char,boolean
		System.out.println("\"");// 印出單、雙引號等等
		System.out.println("Hello \nWorld");// \n換行符號
		System.out.println("c:\\\\java");

		
		double x = 10;
		int y = 3;
		double z = x+y;//1. 除 / 2. 餘數 %
		double m = x/y%z;
		System.out.println("z="+z);
		System.out.println("z="+x+","+m);
		int age = 18;
		boolean isAdult = (age>=18 && age <30); // == , !=, || or , && and , & and兩邊都運算.| or 兩邊都運算 , !相反的布林值 , ^一邊是true 一邊是false回傳true
		System.out.println(isAdult);
		//------------------------------------------------------------
		System.out.println(12 & 6); // bitwise operators 位元運算，把數字變2進制去比較
		System.out.println(9 | 8);
		System.out.println(~25);
		int idendity = 9;
		if ((idendity &8)>0) {
			System.out.println("是老師");
			//-----------------------------------------------------
			
		}
		System.out.println(12<<2); //shift operators 位元位移運算 相當於12*2的2次方=48
		System.out.println(12>>2);//shift operators 相當於12/2的2次方 = 3
		age++;// age= age+1; age+=1; age--,age-=1
		System.out.println("age="+age++);// ++放後面是print之後才加一
		System.out.println("age="+ age);// 上一行幫你+1了 所以印出來是19+1
		
		int d = 3;
		age =age + d;
		age += x;//age(int) = age(int) + x(double) = (int)double 強制轉型至左邊的型態
		System.out.println(age);		
		System.out.println(age>=18?"成年":"未成年");//if else
		System.out.println(age>=18?(age>30?"壯年":"成年"):"未成年");//if else
		//>=18成年 , 30壯年,未成年
	}

}
