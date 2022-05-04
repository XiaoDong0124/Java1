package exam4;

public class Mananger extends Employee{
	private long bonus;
	public Mananger(int empno, String name, long salary,long bonus) {
		super(empno, name, salary);
		this.bonus=bonus;
	}
	public long getBonus() {
		return bonus;
	}
	public void setBonus(long bonus) {
		this.bonus = bonus;
	}
}
