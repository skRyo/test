
public class MyPoint {
    //フィールド
    private int x; //x座標
    private int y; //y座標
    
    //コンストラクタ
    public MyPoint(){
        this.setX(0);
        this.setY(0);
    }
    public MyPoint(int px, int py){
        this.setX(px);
        this.setY(py);
    }
    
    //メソッド
    //X座標を設定する
    public void setX(int px){
        if (px >= 0 && px <= 100){
            this.x = px;            
        }else{
            System.out.println("X座標の引数不正です。" + px);
        }
    }
    //Y座標を設定する
    public void setY(int py){
        if (py >= 0 && py <= 100){
            this.y = py;            
        }else{
            System.out.println("Y座標の引数不正です。" + py);
        }

    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    //メイン
    public static void main(String[] args) {
        MyPoint a = new MyPoint();
        System.out.println(a.getX());
        System.out.println(a.getY());
        
        MyPoint b = new MyPoint(10,100);
        System.out.println(b.getX());
        System.out.println(b.getY());
    }

}
