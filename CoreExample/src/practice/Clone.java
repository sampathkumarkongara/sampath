package practice;

public class Clone implements Cloneable {

	int a = 10;
	int b = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		Clone t1 = new Clone();
		Clone t2 = (Clone) t1.clone();
		t1.a = 100;
		t1.b = 200;
		System.out.println(t1.a + "----" + t1.b);
		System.out.println(t2.a + "----" + t2.b);
	}
}
