package tp10.src.figure;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
	
	private List<Figure> _listeFigures;
	
	public Dessin(){
		_listeFigures = new ArrayList<Figure>();
	}
	
	public boolean add(Figure figureAdd){
		return _listeFigures.add(figureAdd);
	}
	
	public List<Figure> getFigures(){
		return _listeFigures;
	}
}
