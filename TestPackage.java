import category.*;


public class TestPackage {

	public static void main(String[] args) {
		//使用時要使用全名,包含package.class name
		//打出Item 他自動跑出來
		Item item = new Item();
		item.name = "Asus notebook";
		System.out.println("TestPackage's main"+item.name);
		String name = "Vincent";
	}

}
