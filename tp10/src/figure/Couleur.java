package tp10.src.figure;

public enum Couleur {
	Rouge('R'),
	Vert('V'),
	Bleu('B'),
	Jaune('J'),
	Noir('N');
	
	private  char _code;
	
	private Couleur(char code){
		_code=code;
	}
	
	public static Couleur getCouleurDefault(){
		return Noir;
	}
	
	public char get_Code(){
		return _code;
	}
}
