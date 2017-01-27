package tp10.src.figure;
 
public abstract class Figure {
	protected Type type;
	
	public abstract Point[] getPoints();
	
	
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
