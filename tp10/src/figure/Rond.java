package tp10.src.figure;

public class Rond extends Figure implements Surfacable{
	private Point _point;
	private int _rayon;
	
	public Rond(Point point, int rayon){
		set_point(point);
		set_rayon(rayon);
		setType(Type.ROND);
	}
	

	public Point get_point() {
		return _point;
	}
	public void set_point(Point _point) {
		this._point = _point;
	}
	public int get_rayon() {
		return _rayon;
	}
	public void set_rayon(int _rayon) {
		this._rayon = _rayon;
	}

	@Override
	public String toString() {
		return "["+getType() + this._point.toString() + ","+ this._rayon + "]";
	}


	@Override
	public double surface() {
		return 2*Math.PI*get_rayon();
	}


	@Override
	public Point[] getPoints() {
		Point tab[] = new Point[1];
		tab[0] = this.get_point();
		return tab;
	}
	

}
