package array;

public class TestEployeeArry {
	
	public static void main(String[] args ) {
		
		Employee[] emps = new Employee[2];//0800
		
		Employee emp1 = new Employee();//0900
		emp1.empno=1;
		emp1.name="Vincent";
		emps[0]=emp1;//放置陣列
		System.out.println(emps[0].name);//0800[0].name=>0900.name
		//System.out.println(emps[0]==emp1);//同一個位址
		emps[1]=new Employee();
		emps[1].empno=2;
		emps[1].name="Joe";
		System.out.printf("我是%s我%d號%n",emps[1].name,emps[1].empno);
		
		//i=0,i<2 =>0,1
		for(int i=0 ; i < emps.length ; i++) {
			System.out.printf("編號:%d,名字:%s%n",emps[i].empno,emps[i].name);
		}
		
		
	}

}
