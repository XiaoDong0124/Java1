package testinterface;

import java.util.Date;
import java.util.GregorianCalendar;

public class TestProduct {

	public static void main(String[] args) {
		Notebook nb =new Notebook("Asus",20000,365);

		Product item=nb;//item=0800
		
		Notebook item3 = (Notebook)item;//父轉子會有疑問，畢竟可能是另一個子 maybe food 
		
		//日曆->日期
		GregorianCalendar calendar = new GregorianCalendar(2022,04,18);
		//我要的是Date
		Date expireDate = calendar.getTime();
		Food food =new Food("肉鬆",100,expireDate);
		SimCard sim = new SimCard("日本漫遊", 700, 7, expireDate);
		
		Product[] ps = {nb,food,sim};
		buy(ps);
		calendar = new GregorianCalendar(2022,04,18);
		expireDate = calendar.getTime();
	}
	
	public static void buy(Product[] p) {
		//product[0]
		int sum =0;
		for(Product item : p) {
			if(item instanceof Expirable) {
				//如果這個product具備有Expirable型態，表示有可能會過期
				//取得最後期限()
				Expirable exp = (Expirable) item;//強制轉成Expirable 呼叫最後期限()來取得最後期限
				Date lastDate =exp.最後期限();
				Date now = new Date();//產生目前電腦時間的物件
				if(lastDate.before(now));
				System.out.println(item.desc()+"過期惹!!!");
				continue;//跳過此商品執行下一個
			}
		System.out.println("買入"+item.desc());
		sum+=item.getPrice();
		}
		System.out.println("總額"+sum);
	}
	//public static void buy(Food food) {
		//System.out.println("買入"+food.desc());
	//}

}
