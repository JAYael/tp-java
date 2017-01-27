
public class TpJava07 {

	public static void main(String[] args) {
		System.out.println(nNombrePremier(10));

	}
	public static boolean estPremier(int n){
		boolean isOK = true;
			
		for(int i=2;i<n;i++){
			if(n%i==0)
				isOK=false;
		}		
		return isOK;
	}
	
	public static String nNombrePremier(int n){

		StringBuffer buf = new StringBuffer();
		int nombre = 2;
		int compteur = 0;
		while (compteur<=n) {
			if(estPremier(nombre)){
				buf.append(", \n");
				buf.append(nombre);
				compteur++;
				nombre++;
			}else
			nombre++;
		}
		return buf.toString();
	}

}
