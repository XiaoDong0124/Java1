package testinterface;
//型態 Food、Product、Expirable
import java.text.SimpleDateFormat;
import java.util.Date;

public class Food extends Product implements Expirable{

	@Override
	public Date 最後期限() {
		return expireDate;
	}
    private Date expireDate;

    public Food(String name, int price, Date expireDate) {
        super(name, price);
        this.expireDate = expireDate;
    }

    @Override
    public String desc() {
        String description = super.desc();
        SimpleDateFormat time=new SimpleDateFormat("yyyy/MM/dd");//y:year,M:month,d:day
        description = description +",到期日："+time.format(expireDate);
        return description;
    }


}
