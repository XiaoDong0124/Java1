package testextend;

public class Notebook extends Product{
	
	
	public int warranty;
	
	

	public Notebook(String name, int price, int warranty) {
		//super();compiler會偷偷放進來
		super(name,price);
		//this.name = name;
		//setName(name);
		//this.price = price;
		//setPrice(price);
		this.warranty = warranty;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	@Override
	public String desc() {
		//String info = String.format("商品名稱:%s,價錢:%d元,保固%d天",this.name,this.price,this.warranty);
		String info = String.format("%s,保固%d天",super.desc(),this.warranty);
// super.desc() 直接取得desc的結果 ，也就是info :商品名稱:%s,價錢:%d元
		return info;
	}
	
	
}
