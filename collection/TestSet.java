package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set <String> set =new LinkedHashSet();
		set.add("Hello");
		boolean success = set.add("Hello");//加入,失敗的,重複惹
	
		//size
		System.out.println("size="+set.size());
		System.out.println("第二次的hello="+success);
		set.add("World");
		System.out.println("size="+set.size());
		
		//contains
		boolean helloExist = set.contains("Hello");
		System.out.println(helloExist);
		
		//set.add(3);//為甚麼3先印出來惹? set不管順序，我只管重複
		
		for( Object item : set) {
			System.out.println(item);
		}
		
	}

}
