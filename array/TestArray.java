package array;



public class TestArray {

	public static void main(String[] args) {
		
		int[] ages =new int[10];//產生10格，每一小格4個bit [0]....[9]
		int[] weight = {198,165,147,125};
		ages[0]=1;
		ages[1]=2;
		ages[2]=3;
		
		System.out.printf("ages[0]=%d%n",ages[0]);//利用位置取值
		System.out.printf("長度:%d%n",ages.length);
		
		System.out.printf("ages[3]=%d%n",ages[3]);//利用位置取值
		System.out.println(weight[2]+"我是"+weight.length);
		//若無賦值會有預設值0
		
		int[][] x = new int[5][4];
		int[][] y = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		x[0][0] = 1;
		x[1][1] = 2;
		x[2][2] = 3;
		System.out.println("x[2][2]="+x[2][2]);
		System.out.printf("陣列有幾排:x.length=%d%n",x.length);//5
		System.out.printf("第二排有%d幾個%n",x[1].length);//第x[i]排有幾個
		for (int i = 0; i<y.length;i++) {
			for ( int j = 0;j<y[i].length;j++) {
				System.out.printf("y[%d][%d]=%d%n",i,j,y[i][j]);
				
			}
			
		}
		//ages[0]是個什麼型態,int
		for( int value :ages) {
			//1.int value = age[0]
			//2.int value = age[1]
			//3.int value = age[2]
			System.out.println(value);
		}
		System.out.println("------------------------------");
		// x[0](第一排)是甚麼型態? int[]
		for( int[] row : x ) {
			//row[0]是什麼型態
			for(int value : row) {
				System.out.println(value);
			}
		}
	}

}
