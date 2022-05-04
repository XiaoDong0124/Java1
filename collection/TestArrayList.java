package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<String>();//後面<>括弧裡面的String可以拿掉
		//add(Obejet)
		list.add("Hello"); //index:0
		list.add("World"); //index:1
		//Integer a= new Integer(3);//Boxing
		///list.add(555); //////index:2,int 基本型態,class(x),物件(x)
		
		
		System.out.println("0="+list.get(0));//是python list[0]的意思
		System.out.println("1="+list.get(1));
		//size
		System.out.println("目前大小"+list.size());//python len(list)

		for(int i=0 ; i<list.size();i++) {
			System.out.printf("位置%d,value=%s%n",i,list.get(i));
						
		}
		//String s ="3";
		//System.out.println(s + 1);
		
		//int sint = Integer.parseInt(s);//文字轉數字
		//Double.parseDouble(s)
		//Float.parseFloat(s)
		
		Iterator <String> it = list.iterator();//shift+alt+1
		while(it.hasNext()) {
			Object item = it.next();//shift+alt+l
			System.out.println(item);
		}
		
		//for each loop
		for( Object item: list ) {
			System.out.println(item);
		}
	}

}
