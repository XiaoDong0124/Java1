package interFace;

import java.util.Date;
import java.util.GregorianCalendar;


public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Notebook也是Product
		Notebook nb =new Notebook("Asus",20000,365);//0800
		System.out.printf("名稱:%s,價格%d%n",nb.getName(),nb.getPrice());
		System.out.println(nb.name);
		System.out.println(nb.desc());
		System.out.println(Product.TAX);
		nb.getWarranty();
		//抽象方法沒辦法用new來產生物件
		//Product p = new Product("XXX",100)
		
		Product item =nb;//item=0800
		System.out.println(item.desc());//父類別型態,父類別方法,操作子類別物件(Notebook)
		System.out.println(item==nb);
		Notebook item3=(Notebook)item;//Product 是不是一個Notebook?(有可能是food)父類別轉為子類別可能會有問題(前面+(類別)直接強勢轉型)
		if(item instanceof Food) {//false其實item是Notebook
			//如果item指向物件是Food的一種，或是說具備Food的型態，才作強制轉型(Food),才不會發生錯誤
			Food item5=(Food)item; //Product(item)是不是一個food?(有可能是Notebook)
		}
		
		//日曆 -> 日期
		GregorianCalendar calendar =new GregorianCalendar(2022,03,17);//西元曆2022.06.18，月份是跟著偏位值得，或是你打英文
		//日曆轉日期 java.util.date
		Date expirDate = calendar.getTime();//alt+shift+l
		Food food = new Food("肉鬆",100,expirDate) ;//
		System.out.println(food.desc());
		calendar =new GregorianCalendar(2022,05,30);
		expirDate =calendar.getTime();
		SimCard sim = new SimCard("日本漫遊卡",700,7,expirDate);
		System.out.println(sim.desc());
		Product[] ps = {nb,food,sim};
		buy(ps);
		
		
	}
	public static void buy(Product[] products) {
		//products[0]
		int sum = 0;
		for(Product item :products) {
			if(item instanceof Expirable) {
				//如果這個product有具備Expirable型態,表示會有過期的特性
				//Food,Simcard符合條件,都有impliements Expirable
				//取得最後期限()
				Expirable exp=(Expirable)item;//強制轉成Expirable,呼叫最後期限()來取得最後期限
				exp.最後期限();
				Date lastDate = exp.最後期限();
				Date now =new Date();//產生目前的電腦時間的Date物件
				if (lastDate.before(now)) {//最後期限在現在以前,表示過期
					System.out.println(item.desc()+",過期了!!!!!");
					continue;//跳過商品不結帳
				}
			}
			
		sum += item.getPrice();
		System.out.println("買入"+item.desc());
		
		}
		System.out.println("總金額"+sum);
		}
	}


