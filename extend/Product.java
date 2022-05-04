package extend;
//型態:Notebook,Product
public class Product {
	public static final double TAX =0.05; //靜態系統常數
	static {
		System.out.println("只會執行一次"); 
	}
	
	//抽象方法
	//public abstract void calc();//抽象的方法沒有實作所以不會有大括號
	
	protected String name;
	protected int price;
	
	
	
	public Product() {
	}
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String desc() {
		String info = String.format("商品名稱:%s,價錢:%d",this.name,this.price);
		return info;
	}

}
