package exam5;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {

        //實作1.加入二台Notebook("Asus",30000),Notebook("Acer",20000),Food("Cookie",200)到shoppingList中
        List<Product> shoppingList = new ArrayList<Product>();
        Product nb1 = new Notebook("Asus", 30000);
		Product nb2 = new Notebook("Acer", 20000);
		Product fd1 = new Food("Cookie", 200) ;

		shoppingList.add(nb1);
		shoppingList.add(nb2);
		shoppingList.add(fd1);
        
        //實作2.利用for迴圈，計算shoppingList中的總金額,並印在Console中
		int sum = 0;
		for (Product product : shoppingList) {
			//System.out.println(product.desc());
			sum = sum + product.getPrice();

		}
		System.out.println("總金額: " + sum);

        //實作3.利用for迴圈，計算shoppingList中是Notebook型態的總金額,並印在Console中
        Integer sumNo = 0;
        for (Product product : shoppingList) {
        	if (product instanceof Notebook) {
        		sumNo += product.getPrice();
			}
        }
        System.out.println("Notebook總金額="+sumNo );
        



    }



    }

