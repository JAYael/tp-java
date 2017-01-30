package tp10.src.figure;

import java.util.Collection;

public abstract class Figure implements Comparable<Figure> {
	protected Type type;
	private Couleur _couleur;
	
	public abstract Collection<Point> getPoints();
	public abstract boolean couvre(Point point);
	
	public Figure(){
		_couleur=Couleur.getCouleurDefault();
	}
	public Figure(Couleur couleur){
		_couleur=couleur;
	}
	
	public Couleur getCouleur(){
		return _couleur;
	}
	public double distanceOrigine(){
		double distance = Double.POSITIVE_INFINITY;
		for(Point p : getPoints()){
			distance = Math.min(p.distanceOrigine(), distance);			
		}
		return distance;
	}
	
	public int compareTo(Figure f){
		if(this.equals(f)){
			return 0;
		}
		double d1 = this.distanceOrigine();
		double d2 = f.distanceOrigine();
		return (d1-d2) > 0 ? -1 : 1;
}
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public void affiche(){
		System.out.println(this.toString());
	}
}
