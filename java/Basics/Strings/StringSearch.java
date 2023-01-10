public class StringSearch{
	public static void main(String[] args){
		String s = "jkajdkBIKEkajasdakdaskdkadjkBikedkadlsaBIKEdla";
		System.out.println("Bike appears in the position " +  s.indexOf("BIKE"));
		System.out.println("The last appearance of BIKE is in the position " + s.lastIndexOf("BIKE"));
	}
}