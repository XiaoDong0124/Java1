package encap;

public class Car {
	//encap 做出適當的限制
	private String model; // 只有我自己可以用到這個model
	private int price;
	private String color;
	
	//建構方法
	public Car(String color) {
		this("Yaris",color);
		//this.color = color;//初始化屬性的預設值
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//overloaded method
	//比較詳細的建構方法一定會跑
	public Car(String model,String color) {
		//this.model=model;
		this.color=color;
		setModel(model);
	}
	public String getColor() {
		return color;
	}
	//設定Model的方法,setModel
	//變數名稱跟屬性名稱相衝突func會認為是區域變數優先
	public void setModel(String model) {
		//自己設定model=傳進來的m
		//加入this. 可以明確表達變數是屬性
		this.model=model;
		if (model.equals("Prius")) {
			price=1000000;
		}else if (model.equals("Yaris")) {
			price=575000;
		}else {
			this.model = "Error";
			System.out.println("型號只有Prius or Yaris");
			
		}
	}
	public String getModel() {
		return this.model;
	}
	
	//取得model的方法,getXXX

	

	public int getPrice() {
		return this.price;
	}
	
}
