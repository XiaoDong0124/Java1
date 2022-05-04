package exam6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {

         People p1 = new People("001",21);
         People p2 = new People("002",33);
         People p3 = new People("003",41);
         //實作1:請實作一個「泛型」的Map中的key值為people的id，value為people物件，將上述三個people放入Map中

         Map<String, People> map = new HashMap<>();
         map.put("001", p1);
         map.put("002", p2);
         map.put("003", p3);
         
         //System.out.println("ID: "+map.get("001").getId()+" 年齡: "+map.get("001").getAge());
                  
         //實作2:請用for迴圈或者iterator，計算Map中三人的平均年齡，取到小數以下第一位

         Set key = map.keySet() ;
         float age = 0;
         for (Object id : key) {
        	 float ages = map.get(id).getAge();
        	 age = age + ages ;
			
		}
         System.out.printf("平均年齡: %.1f %n", age/map.size());
         
    }
}