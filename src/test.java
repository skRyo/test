
public class test {
	String name;
	int tensuu;
	int zenkai;
	int y;
	
	test(String name,int tensuu,int zenkai){
		this.name = name;
		this.tensuu = tensuu;
		this.zenkai = zenkai;
	}
	
	public String toString(){
		return "科目: " + name + " 今回の点数: " + tensuu + " 前回の点数: " + zenkai;
	}
	
	public int heikin(int tensuu, int zenkai){
		y = (tensuu + zenkai) / 2;
		return y;
	}
	
}
