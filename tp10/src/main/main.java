package tp10.src.main;

import tp10.src.util.FigureUtil;

public class main {

	public static void main(String[] args) {
		/*Point test = new Point(2, 7);
		Rond testRond = new Rond(test, 24);
		Rectangle testRect = new Rectangle(test, 5, 10);
		System.out.println(test.toString());
		testRond.affiche();
		testRect.affiche();
		System.out.println(testRect.toString());*/
		
		
		FigureUtil.getRandomSurfacable().affiche();
	}

}
