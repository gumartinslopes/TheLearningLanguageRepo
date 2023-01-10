public class BasicStringInfo{
	public static void main(String[] args){
		String s1 = "Hello World";
		char[] charArray = new char[5];

		System.out.println("Length of s1: " + s1.length());
		System.out.println("The char in 2nd position is: " + s1.charAt(1));
		System.out.println("S1 reverse is: " + getReverse(s1));
		s1.getChars(0, 5, charArray, 0);
		System.out.print("The first word in s1 is : ");
		displayArray(charArray);

	}

	public static String getReverse(String s){
		String reverse = new String();
		for(int i = s.length() - 1; i >= 0; i--)
			reverse += s.charAt(i);
		return reverse;
	}

	public static void displayArray(char[] array){
		for(char caractere : array)
			System.out.print(caractere);
		System.out.println();
	}
}