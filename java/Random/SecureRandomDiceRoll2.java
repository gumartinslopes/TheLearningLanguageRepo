import java.security.SecureRandom;

public class SecureRandomDiceRoll2{
	public static void main(String[] args){
		SecureRandom randomNumbers = new SecureRandom();
		int frequency1 = 0;
		int frequency2 = 0;
		int frequency3 = 0;
		int frequency4 = 0;
		int frequency5 = 0;
		int frequency6 = 0;

		for(int roll = 1; roll <= 6000000; roll++){
			int face = 1 + randomNumbers.nextInt(6);

			switch(face){
				case 1:
				frequency1++;
				break;

				case 2:
				frequency2++;
				break;
				
				case 3:
				frequency3++;
				break;

				case 4:
				frequency4++;
				break;

				case 5:
				frequency5++;
				break;

				case 6:
				frequency6++;
				break;
			}
		}
		System.out.println("Face\tFrequency");
		System.out.println("1\t" + frequency1);
		System.out.println("2\t" + frequency2);
		System.out.println("3\t" + frequency3);
		System.out.println("4\t" + frequency4);
		System.out.println("5\t" + frequency5);
		System.out.println("6\t" + frequency6);
	}
}