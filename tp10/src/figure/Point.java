package tp10.src.figure;

public class Point implements Comparable<Point> {
	private int _x;
	private int _y;
	private final int INIT_X,INIT_Y;
	private static final Point ORIGINE =new Point();
	
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
	
	public double distanceOrigine(){
		int x2 = (ORIGINE.get_x() - this.get_x())*(ORIGINE.get_x()*this.get_x());
		int y2 = (ORIGINE.get_y() - this.get_x())*(ORIGINE.get_y()*this.get_x());
		return Math.sqrt(x2+y2);
	}
	public double distanceOrigine(Point point){
		int x2 = (point.get_x() - this.get_x())*(point.get_x()*this.get_x());
		int y2 = (point.get_y() - this.get_x())*(point.get_y()*this.get_x());
		return Math.sqrt(x2+y2);
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

	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
