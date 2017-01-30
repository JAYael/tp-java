package tp10.src.figure;

import java.util.Collection;
import java.util.HashSet;

public class Segment extends Figure{

	private Point _pointDepart;
	private Point _pointArriver;

	private int _longueur;
	private boolean _horizontale;
	
	
	
	public Segment(Couleur couleur,Point pointDepart, int longueur, boolean horizontale) {
		super(couleur);
		this.set_pointDepart(pointDepart);
		this.set_longueur(longueur);
		this.set_horizontale(horizontale);
		this.set_pointArriver((_horizontale)? new Point(_pointDepart.get_x()+_longueur, _pointDepart.get_y()):
			 new Point(_pointDepart.get_x(), _pointDepart.get_y()+_longueur));
	}

	
	public Point get_pointArriver() {
		return _pointArriver;
	}	
	public void set_pointArriver(Point _pointArriver) {
		this._pointArriver = _pointArriver;
	}
	public Point get_pointDepart() {
		return _pointDepart;
	}
	public void set_pointDepart(Point _pointDepart) {
		this._pointDepart = _pointDepart;
	}
	public int get_longueur() {
		return _longueur;
	}
	public void set_longueur(int _longueur) {
		this._longueur = _longueur;
	}
	public boolean is_horizontale() {
		return _horizontale;
	}
	public void set_horizontale(boolean _horizontale) {
		this._horizontale = _horizontale;
	}


	@Override
	public String toString() {
		return "[" + _pointDepart + "à" + _pointArriver+"]";
	}
	
	@Override
	public Collection<Point> getPoints() {
//		Point tab[] = new Point[2];
//		tab[0] = this.get_pointDepart();
//		tab[1] = this.get_pointArriver();
//		return tab;
		Collection<Point> tab= new HashSet<Point>();
		tab.add(this.get_pointDepart());
		tab.add(this.get_pointArriver());
		return tab;
	}


	@Override
	public boolean couvre(Point p) {
		if(p.get_x() < get_pointDepart().get_x()){
			return false;
		}
		if(p.get_x() > get_pointArriver().get_x()){
			return false;
		}
		if(p.get_y() < get_pointDepart().get_y()){
			return false;
		}
		if(p.get_y() > get_pointArriver().get_y()){
			return false;
		}

		return true;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Segment){
			Segment other = (Segment) obj;
			if (get_pointDepart().equals(other.get_pointDepart()))
				return false;
			if (get_pointArriver().equals(other.get_pointArriver()))
				return false;
			return true;
		}
		return false;
	}	

}
