package tp10.src.figure;

import java.util.Collection;
import java.util.HashSet;

public class Rond extends Figure implements Surfacable{
	private Point _point;
	private int _rayon;
	
	public Rond(Couleur couleur,Point point, int rayon){
		super(couleur);
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
	public Collection<Point> getPoints() {
		Collection<Point> tab= new HashSet<Point>();
		tab.add(this.get_point());
		return tab;
	}


	@Override
	public boolean couvre(Point p) {
		int x2 = (p.get_x() - _point.get_x()) * (p.get_x() - _point.get_x());
		int y2 = (p.get_y() - _point.get_y()) * (p.get_y() - _point.get_y());
		int d = (int) Math.round(Math.sqrt( x2 + y2 ));
		return d <= _rayon;
}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rond){
			Rond other = (Rond) obj;
			if (!get_point().equals( other.get_point()))
				return false;
			if (get_rayon() != other.get_rayon())
				return false;
			return true;
		}
		return false;
	}	

}
