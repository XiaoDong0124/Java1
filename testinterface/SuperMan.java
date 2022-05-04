package testinterface;

import interFace.Lawyer;

public class SuperMan implements Lawyer,Accountant{
	public void 訴訟() {
		
	}

	@Override
	public void 報稅() {
		
	}
	public static void main(String[] args) {
		
		SuperMan s = new SuperMan();
		
		s.訴訟();
		s.報稅();
		

	}


}
