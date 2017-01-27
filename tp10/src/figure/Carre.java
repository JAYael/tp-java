package tp10.src.figure;

public class Carre extends Rectangle{

	public Carre(Point _pointDepart, int _longueur) {
		super(_pointDepart, _longueur, _longueur);
		this.setType(Type.CARRE);
	}
	
}
