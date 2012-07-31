//Debugprintable interface をメソッドの引数として使用する。
public class Mynumber2 {
    public void printDebug(Debugprintable debugprintable) {
        debugprintable.debugprint();
    }
    
    public static void main(String[] args) {
        Mynumber a = new Mynumber(100);
        Mynumber b = new Mynumber(200);
        Mynumber c = new Mynumber(500);
        
        
        Mynumber2 x = new Mynumber2();
        x.printDebug(a);
        x.printDebug(b);
        x.printDebug(c);
    }


}
