package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		//link有需要才用
		Map <String,Integer> map =new HashMap<>();
		map.put("John", 2000);
		map.put("David", 1000);
		map.put("Beck", 5000);
		
		
		System.out.println("Beck's salary="+map.get("Beck"));
		map.put("Beck", 2500);// key值是會被後面蓋掉的
		System.out.println("Beck's salary="+map.get("Beck"));
		
		Set <String> keySet=map.keySet();
		int sum=0;
		for (Object key : keySet) {
			System.out.println("name="+key+",薪水="+map.get(key));
			//Object value = map.get(key);
			//Integer salary = (Integer)value;
			//sum+=salary;
			sum+=(int)map.get(key);
		}
		System.out.println("總和為"+sum);
	}

}
