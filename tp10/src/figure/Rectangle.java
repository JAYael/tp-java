package tp10.src.figure;

public class Rectangle extends Figure implements Surfacable {	
	private Point _pointDepart;
	private int _longueur;
	private int _largeur;
	
	public Rectangle(Point _pointDepart, int _longueur, int _largeur) {
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
	public Point[] getPoints() {
		Point tab[] = new Point[4];
		tab[0] = this.getPointBasGauche();
		tab[1] = this.getPointBasDroite();
		tab[2] = this.getPointHautGauche();
		tab[3] = this.getPointHautDroite();
		return tab;
	}
}
