package tp10.src.figure;

public class Point {
	private int _x;
	private int _y;
	private final int INIT_X,INIT_Y;
	
	public Point(int x, int y) {
		set_x(x);
		set_y(y);
		INIT_X = INIT_Y = 0;
	}
	
	public Point(){
		INIT_X = 25;
		INIT_Y =25;
	}

	public void set_y(int _y) {
		this._y = _y;
	}
	public void set_x(int _x) {
		this._x = _x;
	}
	
	public int get_x() {
		return _x;
	}
	public int get_y() {
		return _y;
	}
	
	@Override
	public String toString() {
		return "[" + this.get_x() + ";" + this.get_y() + "]";
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Point) {
			return this._x==((Point)obj)._x && this._y==((Point)obj)._y;			
		}else
			return false;
		
	}
}
