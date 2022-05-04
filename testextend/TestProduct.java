package testextend;

import java.util.Date;
import java.util.GregorianCalendar;

public class TestProduct {

	public static void main(String[] args) {
		Notebook nb =new Notebook("Asus",20000,365);
		
		System.out.printf("電腦型號為:%s,價格為%d,保固天數為:%d%n",nb.getName(),nb.getPrice(),nb.getWarranty());
		System.out.println(nb.desc());
		System.out.println(Product.TAX);
		
		Product item=nb;//item=0800
		System.out.println(item.desc());//父類別的型態,父類別的方，操作子類別的物件()
		Notebook item3 = (Notebook)item;//父轉子會有疑問，畢竟可能是另一個子 maybe food 
		
		//日曆->日期
		GregorianCalendar calendar = new GregorianCalendar(2022,04,18);
		//我要的是Date
		Date expireDate = calendar.getTime();
		Food food =new Food("肉鬆",100,expireDate);
		System.out.println(food.desc());
		Product[] ps = {nb,food};
		buy(ps);
		
		
	}
	
	public static void buy(Product[] p) {
		//product[0]
		int sum =0;
		for(Product item : p) {
		System.out.println("買入"+item.desc());
		sum+=item.getPrice();
		}
		System.out.println("總額"+sum);
	}
	//public static void buy(Food food) {
		//System.out.println("買入"+food.desc());
	//}

}
