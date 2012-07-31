
public class Rectangle {
	int width;
	int height;
    private int t;
    private int c;
	
	Rectangle() {
		setSize(0, 0);
	}
	
	Rectangle(int width, int height){
	    setSize(width, height);
	}
	
	void setSize(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public int triangle(){
	    t = width * height /2;
	    return t;
	}
	
	public int corners(){
	    c = (width * height);
	    return c;
	}
	
	public String toString(){
	    return "[" + width + ", " + height +  "]";
	}

}


