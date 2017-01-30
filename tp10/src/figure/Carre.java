package tp10.src.figure;

public class Carre extends Rectangle{

	public Carre(Couleur couleur,Point _pointDepart, int _longueur) {
		super(couleur,_pointDepart, _longueur, _longueur);
		this.setType(Type.CARRE);
	}
	
}
