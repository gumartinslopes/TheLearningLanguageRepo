public class StringConstructors{
	public static void main(String[] args){
		char [] charArray = {'H', 'e','l','l','o',' ','w','o','r','l','d'};
		String s1 = new String();
		s1 = "Dunder Mifflin";
		String s2 = new String("Michael Scott");
		String s3 = new String(charArray);
		String s4 = new String(charArray, 6, 5);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}