package interFace;

import java.text.SimpleDateFormat;
//型態:Food,Product,Expirable
import java.util.Date; //utility,java.sql.Date:JDBC

public class Food extends Product implements Expirable{

	
	@Override
	public Date 最後期限() {
		// TODO Auto-generated method stub
		return expireDate;
	}

    private Date expireDate;//Date是一個類別

    public Food(String name, int price, Date expireDate) {
        super(name, price);
        this.expireDate = expireDate;
    }

    @Override
    public String desc() {
        String description = super.desc();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");//y:year,M:month,d:day
        description = description +",到期日："+format.format(expireDate);
        return description;
    }
}
