package interFace;
// extends 繼承Product 的類別屬性 //型態:Notebook , Product ,Warrantable
public class Notebook extends Product implements Warrantable{
	
	@Override
	public int 保固天數() {
		return warranty;
	}
	
	public int warranty;
	
	
	
	public Notebook(String name, int price, int warranty) {
		//super(); //compiler偷偷放進來的
		//this.name = name;
		//this.price = price;
		super(name,price);
		this.warranty = warranty;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	@Override //Annotation(註釋)
	public String desc() {
		//String info = String.format("商品名稱:%s,價錢:%d,保固:%d天",this.name,this.price,this.warranty);
		String info = String.format("%s,保固:%d天",super.desc(),this.warranty); //super呼叫父類別的屬性
		return info;
	}

	

}
