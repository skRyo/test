
public class test3 {
	public static void main(String[] args) {
//		test a = new test();
//		a.name = "国語";
//		a.tensuu = 80;
//		a.zenkai = 20;
//		System.out.println(a);
//		System.out.println("平均: " + a.heikin(a.tensuu, a.zenkai));
		
		test b = new test("数学", 50, 50);
		System.out.println(b);
		System.out.println("平均 :" + b.heikin(b.tensuu, b.zenkai));
	}

}