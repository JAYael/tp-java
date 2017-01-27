
public class TpJava04 {

	public static void main(String[] args) {
		int montantAchat = Integer.parseInt(args[0]);
		int poids = Integer.parseInt(args[1]);
		float remise = montantAchat*calculeRemise(montantAchat);
		System.out.println("Votre montant total est =>"+ montantAchat);
		System.out.println("Vous beneficier d'une remise de " + remise);
		System.out.println("Votre montant final est "+ (montantAchat - remise));
		System.out.println("Les sac est de taille " + calculTailleSac(poids) );
	}
	
	public static float calculeRemise(float montantTotal){
		float remise;
		if(montantTotal>5000){
			remise = 5;			
		}else if (montantTotal>2000) {
			remise = 3;
		}else if (montantTotal>1000) {
			remise = 1;
		}else{
			remise = 0;
		}
		return remise/100;
	}
	
	public static String calculTailleSac(int poids){
		switch (poids) {
		case 0:
			return "petit";
		case 1:
			return "moyen";
		default:
			return "grand";
		}
	}
}
