
public class Passbook {
	String name;
	int zandaka;
	int bangou;
	
	int y;
	int x;
	
	public Passbook(String name,int zandaka,int bangou) {
		this.name = name;
		this.zandaka = zandaka;
		this.bangou = bangou;
	}
	
	public String toString(){
		return name + "さんの通帳です。口座番号は" + bangou + "残高は" + zandaka;
	}
	
	public int hikiotoshi(int shiyou){
		zandaka = zandaka - shiyou;
		return zandaka;
	}
	
	public int tumitate(int shiyou){
		zandaka = zandaka + shiyou;
		return zandaka;
	}
//	//利息計算処理を入れる
//	//3%だったらいくらになる
	public double kinri(int kinri){
		double w = zandaka;
		w = w * ( kinri / 100 );
		return w;
	}

}
