package tp10.src.figure;

import java.util.Collection;
import java.util.HashSet;

public class Rectangle extends Figure implements Surfacable {	
	private Point _pointDepart;
	private int _longueur;
	private int _largeur;
	
	public Rectangle(Couleur couleur,Point _pointDepart, int _longueur, int _largeur) {
		super(couleur);
		this._pointDepart = _pointDepart;
		this._longueur = _longueur;
		this._largeur = _largeur;
		this.type = Type.RECTANGLE;
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
	public int get_largeur() {
		return _largeur;
	}	
	public Point getPointBasGauche() {
		return new Point(this._pointDepart.get_x(),this._pointDepart.get_y());
	}
	public Point getPointBasDroite() {//getPointHautGauche()
		return deplace(this._longueur,0);
	}
	public Point getPointHautGauche() {
		return deplace(this._largeur, this._longueur);
		
	}
	public Point getPointHautDroite() {
		return deplace(0, this._largeur);
	}

	
	@Override
	public String toString() {
		return "[" +getType()+ getPointBasGauche().toString() + "," + getPointBasDroite().toString()
				+ "," + getPointHautGauche().toString() + "," + getPointHautDroite().toString()
				+ "]";
	}

	private Point deplace(int x,int y){
		Point pointDeplace = this._pointDepart;
		pointDeplace.set_x(pointDeplace.get_x()+x);
		pointDeplace.set_y(pointDeplace.get_y()+y);
		return pointDeplace;
	}

	@Override
	public double surface() {
		return _largeur*_longueur;
	}
	
	@Override
	public Collection<Point> getPoints() {
		Collection<Point> tab= new HashSet<Point>();
		tab.add(this.getPointBasGauche());
		tab.add(this.getPointBasDroite());
		tab.add(this.getPointHautGauche());
		tab.add(this.getPointHautDroite());
		return tab;
	}

	@Override
	public boolean couvre(Point point) {
		if(point.get_x()<this.getPointBasGauche().get_x())
			return false;
		if(point.get_x()<this.getPointBasDroite().get_x())
			return false;
		if(point.get_y()<this.getPointHautGauche().get_y())
			return false;
		if(point.get_y()<this.getPointHautDroite().get_y())
			return false;
		return true;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle){
			Rectangle other = (Rectangle) obj;
			if (get_largeur() != other.get_largeur())
				return false;
			if (get_longueur() != other.get_longueur())
				return false;
			if (!get_pointDepart().equals(other.get_pointDepart()))
				return false;
			return true;
		}
		return false;
	}
	
	
}
