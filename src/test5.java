
public class test5 {
	public static void main(String[] args) {
		int shiyou = 200;
		int kyuryou = 5000;
		Passbook sekine = new Passbook("sekine", 1000, 12345);
		System.out.println(sekine);
		
		int w;
		w = sekine.hikiotoshi(shiyou);
		System.out.println(shiyou + "円使用して、残高は"+ w + "円です。");
		
		int x;
		x = sekine.tumitate(kyuryou);
		System.out.println(kyuryou + "円積立て、残高は"+ x + "円です。");
		
		System.out.println(sekine);
		
		//一ヶ月1万円貯金して一年後の残高を求める
		//2万円とか3万円とかはへんすうで定義する
		int kinri = 3;
		System.out.println(sekine.kinri(kinri));
	}

}
