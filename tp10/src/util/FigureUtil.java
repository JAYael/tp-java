package tp10.src.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import sun.security.krb5.internal.crypto.Des;
import tp10.src.figure.Carre;
import tp10.src.figure.Couleur;
import tp10.src.figure.Dessin;
import tp10.src.figure.Figure;
import tp10.src.figure.Point;
import tp10.src.figure.Rectangle;
import tp10.src.figure.Rond;
import tp10.src.figure.Surfacable;

public class FigureUtil {
	private static Random _ran = new Random();
	
	public static Couleur getRandomCouleur(){
		int index = _ran.nextInt(Couleur.values().length)+1;
		return Couleur.values()[index];
	}
	public static Rond getRandomRond(){
		return new Rond(getRandomCouleur(),getRandomPoint(), _ran.nextInt(10)+1);		
	}
	public static Rectangle getRandomRectangle(){		
		return new Rectangle(getRandomCouleur(),getRandomPoint(), _ran.nextInt(10)+1, _ran.nextInt(10)+1);		
	}
	public static Point getRandomPoint(){
		int x = _ran.nextInt(100);
		int y = _ran.nextInt(100);
		return new Point(x, y);
	}
	
	public static Carre getRandomCarre(){
		return new Carre(getRandomCouleur(),getRandomPoint(), _ran.nextInt(10)+1);
	}
	public static Figure getRandomSurfacable(){
		switch (_ran.nextInt(3)) {  
		case 0:
			return getRandomRond();
		case 1:
			return getRandomRectangle();
		default:
			return getRandomCarre();
		}
	}
	public static Optional<Figure> getFigureEn(Point point, Dessin dessin){
		return dessin.getFigures()
				.stream()
				.filter(f -> f.couvre(point))
				.findFirst();
	}
	
	public static List<Figure> trieProcheOrigine(Dessin dessin){
//		List<Figure> figures = new ArrayList<Figure>();
//		figures.addAll(dessin.getFigures());
//		Collections.sort(figures);
//		return figures;
		return dessin.getFigures()
				.stream()
				.sorted()
				.collect(Collectors.toList());
	}
	
	public static List<Surfacable> trieDominant(Dessin dessin){
		
		return dessin.getFigures()
				.stream()
				.filter(f -> f instanceof Surfacable)
				.map(f-> (Surfacable)f)
				.sorted((s1,s2)-> 
					(int)(s1.surface() - s2.surface()) > 0 ? -1 : 1)
				.collect(Collectors.toList());
//		List<Surfacable> figures = new ArrayList<Surfacable>();
//		for(Figure f : dessin.getFigures()){
//			if(f instanceof Surfacable){
//				figures.add((Surfacable)f);
//			}
//		}
//		Collections.sort(figures, 
//				(s1,s2) ->
//		(s1.surface() - s2.surface()) > 0 ? -1 : 1);
//		return figures;
}

	public static Collection<Point> getPoints(Figure...figures){
//		Point[][] tab = new Point[figures.length][];
//		int index = 0;
//		for (Figure figure : figures) {
//			tab[index] = new Point[figure.getPoints().length];
//			tab[index] = figure.getPoints();
//			index++;
//		}
//		return tab;
//		int nbFigure = 0;
//		for (Figure figure : figures) {			
//			nbFigure += figure.getPoints().length;			
//		}
//		Point[] liste = new Point [nbFigure];
//		int index = 0;
//		for (Figure figure : figures) {			
//			for(Point p : figure.getPoints()){
//				liste[index]=p;
//			}
//		}
		Collection<Point> list = new ArrayList<Point>();
		for (Figure figure : figures) {			
			list.addAll(figure.getPoints());			
		}		
		return list;
	}
	
	public static Collection<Figure> genere(int nbFigure){
		Collection<Figure> listFigure = new ArrayList<Figure>();
		for (int i = 0; i < nbFigure; i++) {
			listFigure.add(getRandomSurfacable());
		}
		return listFigure;
	}
		
}
