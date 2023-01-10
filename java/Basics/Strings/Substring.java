public class Substring{
	public static void main(String[] args){
		String s  = new String("Michael Scott");
		//parâmetros inicio da busca, quantos caracteres pegaremos
		System.out.println("First name: " + s.substring(0, 7));
		//parâmetros inicio da busca
		System.out.println("Last name: " + s.substring(8));	
	}
}