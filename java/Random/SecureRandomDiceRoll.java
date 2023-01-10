import java.security.SecureRandom;

public class SecureRandomDiceRoll{
 	public static void main(String[] args){
 		SecureRandom randomNumbers = new SecureRandom();
		System.out.println("Random rolls");
 		for(int counter = 1; counter <= 20; counter++){
 			//gerando um valor aleatório entre 1  e 6
 			int face = 1 + randomNumbers.nextInt(6);
 			System.out.print(face + " ");
 			if(counter % 5 == 0)
 				System.out.println();
 		}
 	}
}