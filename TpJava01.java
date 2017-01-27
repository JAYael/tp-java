public class TpJava01 {
	public static void main(String args[]){
		String param = "";
		for(String arg : args){
			param += " "+arg;
		}
		System.out.println("Bonjour" + param);
	}
}