
public class TpJava06 {

	public static void main(String[] args) {
		System.out.println(calculFactoriel(10));

	}
	public static int calculFactoriel(int fac){
		int res = 1;
		for (int i = 1; i < fac; i++) {
			res=res*i;
		}
		return res;
	}

}
