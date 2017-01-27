package tp10.src.figure;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
	
	private List<Figure> _listeFigure;
	
	public Dessin(){
		_listeFigure = new ArrayList<Figure>();
	}
	
	public boolean add(Figure figureAdd){
		return _listeFigure.add(figureAdd);
	}
	
	public List<Figure> getFigures(){
		return _listeFigure;
	}
}
