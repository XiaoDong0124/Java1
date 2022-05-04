package exam4;

public class TestEmployee {

	public static void main(String[] args) {
		Mananger mg =new Mananger(30, "XiaoDong", 3300, 4400);
	System.out.printf("員工編號:%d,員工姓名:%s,薪水:%d,分紅:%d",mg.getEmpno(),mg.getName(),mg.getSalary(),mg.getBonus());
	}

}
