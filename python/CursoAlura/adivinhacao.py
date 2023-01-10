import random
def jogar():
	print("*******************")
	print("JOGO DE ADIVINHAÇÂO")
	print("*******************")
	print("Selecione o nível de dificuldade\n(1) Fácil \n(2) Médio \n(3) Dificil \n(4) Impossível")
	nivel = int(input("-> "))
	numero_secreto = round(random.randrange(101))
	total_tentativas = 0
	pontuacao = 1000
	pontuacao_perdida = 0

	if(nivel == 1):
		total_tentativas = 20
	elif(nivel == 2):
		total_tentativas = 10
	elif(nivel == 3):
		total_tentativas = 3
	elif(nivel == 4):
		total_tentativas = 1
	else:
		total_tentativas = 0

	for rodada in range(1,total_tentativas + 1):
		print(f"Rodada: {rodada} de { total_tentativas}")
		chute = int(input("Qual o seu palpite do número secreto entre 0 e 100? "))
		if (numero_secreto == chute):
			print("Você acertou!")
			print("Pontuação: ", (pontuacao - pontuacao_perdida))
			break
		elif (chute > numero_secreto):
			print("Você errou! O número secreto é menor do que isso")
		elif(chute > 100 and chute < 0):
			print("O valor deve estar dentro do intervalo [0,100]")
		else:
			print("Você errou! O número secreto é maior do que isso")
		pontuacao_perdida += abs(numero_secreto - chute)    
	print("Obrigado por jogar!")

if(__name__ == "__main__"): # Condição de execução direta pelo arquivo adivinhação
	jogar()