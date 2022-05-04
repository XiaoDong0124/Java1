package interFace;

import java.text.SimpleDateFormat;
import java.util.Date;
//型態:SimCard,Product,Warrantable,Expirable
public class SimCard extends Product implements Warrantable,Expirable{
	
	private int warranty;
	private Date expireDate;
	
	public SimCard(String name, int price, int warranty, Date expireDate) {
		super(name, price);
		this.warranty = warranty;
		this.expireDate = expireDate;
	}
	@Override
	public int 保固天數() {
		// TODO Auto-generated method stub
		return warranty;
	}
	@Override
	public Date 最後期限() {
		// TODO Auto-generated method stub
		return expireDate;
		
	}
	@Override
    public String desc() {
        String description = super.desc();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");//y:year,M:month,d:day
        description = description +",最後開卡日："+format.format(expireDate)+",保固使用"+warranty+"天";
        return description;
    }
	
	
	
}
