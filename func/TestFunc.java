package func;

public class TestFunc {

	public static void main(String[] args) {
		
		//定義回傳，才可以把結果輸入變數
		//shift alt l 快速指定其變數
		int s = add(1,2);
		
		System.out.println("done"+s);
		}
	//public方法跟方法之間是平行的
	//方法定義
	//公開         回傳型態    方法名稱    參數(型態，變數名稱) 也是區域變數
	public static int    	add		(int a, int b) {
		int sum = a+b;
		System.out.println("Sum="+sum);
		return sum;
	}
	
}
