package testencap;

/**
 * Created by vincent on 2017/6/3.
 */
public class Car {

   private String model;
   private int price;
   private String color;
   
   //所謂建構方法
   public Car(String color) {
	this("Benz", color);
	//this.color=color;//初始化預設值
			
}
   //overloaded
   public Car(String model , String color) {
	   //this.model=model;
	   this.color=color;
	   setModel(model);
   }
   //建構方法的名字跟類別同名
   public String getColor() {
	   return color;
}
   public void setColor(String color) {
	   this.color = color;
   }
public void setModel(String model) {
	   //自己設定model=傳進來的值，也就是方法m=private m
	   //this.明確知道是非區域變數的屬性
	   this.model=model;
	   if(model.equals("Yaris")) {
		   this.price = 10000;
	   }else if (model.equals("Benz")) {
		   this.price = 800000;
	   }else if (model.equals("Mazida")) {
		   this.price = 5000;
	   }else {
		   System.out.println("錯誤的型號");
	   }
   }
   //取得model的方法,getXXX
   public String getModel() {
	   return model;
   }
   public int getPrice() {
	   return price;
   }
    
   
   

}
