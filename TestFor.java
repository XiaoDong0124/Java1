
public class TestFor {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1	; i<=100;i++) {
			//i是計數器的宣告 ; 判斷的條件
			System.out.println(i);//放continue前面跟後面差很多
			
			if (i%2==0) {
				continue;
			}
			System.out.println(i);
			
			sum+=i;
			
			//計數器+1
			// for迴圈地宣告只能在for迴圈使用
			//sum=sum+(i%2==0?0:i);
		}
		System.out.println(sum);
		
		
		int counter = 0;
		int sumOfWhile = 0;
		while (counter<=100) {
			sumOfWhile +=counter;
			counter++;//計數器自己+
		}
		System.out.println("While總和="+sumOfWhile);
		
		int i =101;//無論如何都會先做一次 ， 所以sum會是101, i最後的值是102
		sum = 0;//重複利用相同變數，值先設回0
		do {
			sum += i;
			i++;
		}while(i<=100);
		System.out.println("DoWhile總和="+sum);
	}

}
