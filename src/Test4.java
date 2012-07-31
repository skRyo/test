
public class Test4 implements Debugprintable{
    
    int err = 0;
    
    public void debugprint() {
        if (err == NO_ERROR){
            System.out.println("問題なし！");
        }else if (err == FILE_ERROR) {
            System.out.println("ファイルエラーだよ");
        }
    }
    
    public static void main(String[] args) {
        Test4 a = new Test4();
        a.debugprint();
    }

    

}
