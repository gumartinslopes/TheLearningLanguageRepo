import forca
import adivinhacao

print("*******************")
print("JOGO DA FORCA")
print("*******************")

print("Selecione o jogo que você quer jogar: \n(1) Forca \n(2) Adivinhação")
escolha = int(input("-> "))

if(escolha == 1):
	print("Você esolheu o jogo da forca")
	forca.jogar()
elif(escolha == 2):
	print("Você escolheu o jogo da adivinhação")
	adivinhacao.jogar()