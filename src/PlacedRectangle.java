/*
次の機能を持つPlacedRectangleを、Rectangleのサブクラスとして宣言してください。
・ 位置を表すint型のフィールドx,yを持つ
・ 3つのコンストラクタを持つ
(1)引数なし
(2)位置付き
(3)位置と大きさ付き
・ 位置を変更するメソットsetLocationを持つ 
・標準的な文字列表現を返すメソッドtoStringを持つ
x=12,y=34,width=123,height=45のとき、 [ (12, 34)[123, 45]]となるものとする。
 */

public class PlacedRectangle extends Rectangle{
    int x;
    int y;
    
    PlacedRectangle() {
        setLocation(0,0);
    }

    PlacedRectangle(int x, int y) {
        setLocation(x, y);
    }

    PlacedRectangle(int x, int y, int width, int height) {
        super(width, height);
        setLocation(x, y);
    }
    
    void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return "[(" + x + ", " + y + ")" + super.toString() + "]";
    }
    
    public static void main(String[] args) {
        PlacedRectangle a = new PlacedRectangle();
        PlacedRectangle b = new PlacedRectangle(10,20);
        PlacedRectangle c = new PlacedRectangle(10,20,30,40);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        c.setLocation(50, 60);
        System.out.println(c);
        c.setSize(100, 200);
        System.out.println(c);
        
        System.out.println(c.triangle());
        System.out.println(c.corners());
    }
}
