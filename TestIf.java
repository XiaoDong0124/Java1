
public class TestIf {

	public static void main(String[] args) {
		
		int age =35;
		if(age>=18) {
				
				if(age>30) {
					//條件成立才執行block
					System.out.println("壯年");
				}
				else {
					System.out.println("成年");
				}
		
		}
			
		else {System.out.println("未成年");}
		int classroom =201;
		//tab:往下一個框,shift+tab往上一個
		switch (classroom) {
			case 204:
				System.out.println("人數>=30人");
				break;// 每一個case都要有break結尾
			case 305:
				System.out.println("人數<=30人,>=20");
				break;
			case 201:
				System.out.println("我是幼幼班");
				break;
	
			default:
				System.out.println("我什麼也不是");
				break;
			}

	}

}

