
public class TestString {

	public static void main(String[] args) {
		
		String name = "Vincent";
		String name1 = "Vincent";// from pool 0800 , String pool 也是在heap區
		System.out.println(name==name1);//ture , 0800==0800 
		
		String name2 = new String("Vincent");//heap,自己new String物件,不會再.pool內
		System.out.println(name2 == name);//false
		
		String name3 = new String("Vincent");// heap,自己new String物件,不會在pool內
		System.out.println(name2 == name3);
		
		//equals,文字的逐字比較必須使用equals方法 不能使用==
		System.out.println(name.equals(name3));
		
		System.out.println("length="+"Vincent是我".length());//有幾個字，中文也只算一個字，length後面的括號是不能加任何東西的
		
		System.out.println("資策會305".indexOf("305"));//3(偏位值是多少，在哪裡開始找到的意思，找不到的話會印出-1)
		
		System.out.println("字母遊戲="+"abcdefghijklmnopqrstuvwxyz".substring(4,18));
		
		double price = 123.456;
		System.out.println(price);
		System.out.println(String.format("水果%10.1f元,賣給%s,總共%d元",price,name,100));
		System.out.printf("水果%10.1f元,賣給%s,總共%010d元\n",price,name,100);//少了println所以要自己換行用\n或是%n
			
		
	}

}
