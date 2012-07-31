public class Rectangle1 {
    private int x;
    private int y;
    private int width;
    private int height;
    final int INITIAL_WIDTH = 0;
    final int INITIAL_HEIGHT = 0;
    
    public Rectangle1() {
        setLocation(x, y);
        this.width = INITIAL_WIDTH;
        this.height = INITIAL_HEIGHT;
    }
    
    public Rectangle1(int width, int height) {
        setSize(width, height);
    }

    public Rectangle1(int x, int y, int width, int height) {
        setLocation(x, y);
        setSize(width, height);
    }
    
    void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    void setSize(int width, int height){
        this.width = width;
        this.height = height;
    }
    
    public Rectangle1 intersect(Rectangle1 r){
        
        int x1 = Math.max(x, r.x);
        int y1 = Math.max(y, r.y);
        int work_w = Math.min((this.x + this.width), (r.x + r.width));
        int work_h = Math.min((this.y + this.height), (r.y + r.height));
        
        int w = work_w - x1;
        int h = work_h - y1;
        
        if ((work_w <= x1) && (work_h <= y1)){
            return null;
        } else {
            return new Rectangle1(x1, y1, w, h);
        }
        
    }
    
    public String toString(){
        return "[ x = " + x + ", y = " + y + ", width = " + width + ", height = " + height + "]";
    }
    
    int getArea(int width, int height){
       return width * height; 
    }
    
    public static void main(String[] args) {
        Rectangle1 a = new Rectangle1(1,3,3,10);
        Rectangle1 b = new Rectangle1(1,3,4,8);
        
        System.out.println("a = " + a);
        System.out.println("aの面積 =  " + a.getArea(a.width, a.height));
        System.out.println("b = " + b);
        System.out.println("bの面積 =  " + b.getArea(b.width, b.height));
        
        System.out.println("aとbの図形の差 = " + a.intersect(b));
//        System.out.println(a.intersect(b).width);
//        System.out.println(a.intersect(b).height);
        System.out.println("aとbの図形の差の面積 = " + a.getArea(a.intersect(b).width, a.intersect(b).height));
        
    }

}
