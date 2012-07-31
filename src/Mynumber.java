//public class Mynumber {
public class Mynumber implements Debugprintable{
    private int a;
    private ErrorStstus y;
    
    private int b = 0;
    
    public Mynumber(int a) {
        this.a = a;
        this.setCode(this.a);
    }
    
    
    
    public ErrorStstus setCode(int x){
        System.out.println(ErrorStstus.FILE_ERROR.getStatus());
        if (b == ErrorStstus.NO_ERROR.getStatus()){
            
        }
        
        
        if (x == 100){
            y = ErrorStstus.NO_ERROR;
        }else if(x == 200){
            y = ErrorStstus.FILE_ERROR;
        }else{
            y = ErrorStstus.MEMORY_ERROR;
        }
        
        return y;
    }
    
    public void debugprint() {
        System.out.println(y);
    }
    
}
