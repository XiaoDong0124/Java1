package equals;

import java.util.Objects;

public class Employee {
	
	private String id;

	public Employee(String id) {
		this.id = id;
	} 
		
	@Override
	public boolean equals(Object obj) {
		//是Employee我才比
		if (obj instanceof Employee) {
			Employee emp = (Employee)obj;
			//因為Object型態並沒有id屬性可以比較,所以要強制轉型成Employee
			//比id,id一樣我就,return true
			if(this.id.equals(emp.id)) {
				return true;
			}else {
				return false;
			}
			
			
		}
		//其他情況,例如:Employee比Car,return false
		
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	protected void finalize() throws Throwable{
		System.out.println("Employee被GC惹");
		//清除最後的資源,關閉檔案,關閉資料庫,一般情況下極少用到,有其他方式可以達到這個目的
	}
	public String toString() {
		return String.format("員工(%s)",id);
	}
}
