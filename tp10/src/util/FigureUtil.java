package tp10.src.util;

import java.util.Iterator;
import java.util.Random;

import tp10.src.figure.Carre;
import tp10.src.figure.Figure;
import tp10.src.figure.Point;
import tp10.src.figure.Rectangle;
import tp10.src.figure.Rond;

public class FigureUtil {
	private static Random _ran = new Random();
	public static Rond getRandomRond(){
		return new Rond(getRandomPoint(), _ran.nextInt(10)+1);		
	}
	public static Rectangle getRandomRectangle(){		
		return new Rectangle(getRandomPoint(), _ran.nextInt(10)+1, _ran.nextInt(10)+1);		
	}
	public static Point getRandomPoint(){
		int x = _ran.nextInt(10)+1;
		int y = _ran.nextInt(10)+1;
		return new Point(x, y);
	}
	
	public static Carre getRandomCarre(){
		return new Carre(getRandomPoint(), _ran.nextInt(10)+1);
	}
	public static Figure getRandomSurfacable(){
		switch (_ran.nextInt(3)) {
		case 1:
			return getRandomRond();
		case 2:
			return getRandomRectangle();
		default:
			return getRandomCarre();
		}
	}

	public static Point[] getPoints(Figure...figures){
//		Point[][] tab = new Point[figures.length][];
//		int index = 0;
//		for (Figure figure : figures) {
//			tab[index] = new Point[figure.getPoints().length];
//			tab[index] = figure.getPoints();
//			index++;
//		}
//		return tab;
		int nbFigure = 0;
		for (Figure figure : figures) {			
			nbFigure += figure.getPoints().length;			
		}
		
		Point[] liste = new Point [nbFigure];
		int index = 0;
		for (Figure figure : figures) {			
			for(Point p : figure.getPoints()){
				liste[index]=p;
			}
		}
		return liste;
	}
		
}
