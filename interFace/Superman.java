package interFace;
//型態: Superman,Lawyer,Accountant三種型態
public class Superman implements Lawyer,Accountant{
	
	public void 訴訟() {
	}
	@Override//有或沒有都不影響執行
	public void 報稅() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
		Superman s = new Superman();
		s.訴訟();
		s.報稅();
		
		}
	

}
