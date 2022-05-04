package exception;

import java.util.regex.PatternSyntaxException;

public class TestException {
	public static void main(String[] args ) {
		try{
			int a =1;
			int c =1;
			System.out.println("c="+c--);//c=0
			int b = a/c;//1/0->無限大,電腦無法處理.
			System.out.println("b="+b);
			int[] ages= {};//空陣列
			System.out.println(ages[0]);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException x) {
			//處理exception
			System.out.println("除到0了");
			x.printStackTrace();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println("finally,我是一定會被執行的區域");
		}
		//有正確處理exception(有攔到exception,程式就會繼續執行)
		System.out.println("done");
	}

}
