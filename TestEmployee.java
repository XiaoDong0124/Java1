
public class TestEmployee {
		
	public static void main(String[]args) {
		//宣告: 型態 變數名稱
		Employee emp = new Employee();//產生物件,有new就會在記憶體中產生Employee,有兩格可以放資料
		emp.empno = 1;
		emp.name = "Vincent";
		System.out.println("員工編號"+emp.empno+",名字:"+emp.name);//取值
		
		Employee emp2 = new Employee();
		emp2.empno=2;
		emp2.name = "David";
		System.out.println("員工編號:"+emp2.empno+",名字:"+emp2.name);//取值
		System.out.println(emp == emp2);// 像是在問 記憶體位子 就算賦予值一樣也是 False0800==0900
		emp2 = emp;//emp2=emp1 位子相同
		System.out.println("員工編號:"+emp2.empno+",名字:"+emp2.name);//取值
		System.out.println(emp == emp2);// 兩者位子相同 故答案為Ture
		
		//null
		emp2=null;//清空存放的記憶體位址,heap區的物件如果沒有被指向到,就會被GC
		emp=null;//只有物件形式變數可以使用null
		// a = null;//不行!
		//如果該變數為null則不能再使用,否則會有錯誤發生,錯誤叫NullPointerException
		// System.out.println(emp2.name); 輸出我會得到錯誤
		
	}
	

}
