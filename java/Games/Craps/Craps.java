/*
Jogo apresentado no livro java:como programar - edição 10 - Harvey Deitel
*/

import java.security.SecureRandom;

public class Craps{
	private static final SecureRandom randomGenerator = new SecureRandom();
	//constantes que representam os status do jogo 
	private enum Status{CONTINUE, WON, LOST};

	//constantes que representam os lançamentos comuns dos dados
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	public static void main(String[] args){
		int myScore = 0;
		Status gameStatus;

		//soma das duas rolagens
		int sumOfDices = rollDice();

		//determinação do estado do jogo
		switch(sumOfDices){
			//casos de vitorias
			case SEVEN:
			case YO_LEVEN:
				gameStatus = Status.WON;
				break;
			//casos de derrotas
			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus = Status.LOST;
				break;
			//nem vitória nem derrota, registra pontuação
			default:
				gameStatus = Status.CONTINUE;
				myScore = sumOfDices;
				System.out.println("\tYour score: " + myScore);
				break;
		}

		while(gameStatus == Status.CONTINUE){
			sumOfDices = rollDice();

			//determina o stado do jogo
			if(sumOfDices == myScore)
				gameStatus = Status.WON;

			else if(sumOfDices == SEVEN)
				gameStatus = Status.LOST; 
		}

		//exibe a mensagem de vitória ou derrota
		if(gameStatus == Status.WON)
			System.out.println("\tPlayer wins!");
		else
			System.out.println("\tPlayer loses!");
	}

	public static int rollDice(){
		int dice1 = 1 + randomGenerator.nextInt(6);
		int dice2 = 1 + randomGenerator.nextInt(6);
		int sum = dice1 + dice2;
		System.out.println("Player rolled " + dice1 + "+" + dice2 + " = " + sum);
		return sum;
	}
}