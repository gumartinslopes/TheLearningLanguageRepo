import random

def jogar():		
	imprime_abertura()		
	palavras = le_palavras()
	palavra_secreta = sorteia_palavra(palavras)
	letras_acertadas = inicializa_palavra(palavra_secreta)

	acertou = False
	enforcou = False
	erros = 0
	max_tentativas = 6
	
	
	while(not enforcou and not acertou):
		escolha = input("Escolha uma letra:").strip().upper() 		# remoção de espaços e passa para lowercase
		if (escolha in palavra_secreta):
			index = 0
			for letra in palavra_secreta:
				if(letra == escolha):
					letras_acertadas[index] = escolha
				index += 1
		else:
			erros += 1
			desenha_forca(erros)
		
		enforcou = erros == max_tentativas
		acertou = "_" not in letras_acertadas
		
		print(letras_acertadas)
		print("Tentativas restantes: ",  max_tentativas - erros)
	imprime_resultado(acertou, palavra_secreta)
	
def imprime_abertura():
	print("*******************")
	print("JOGO DA FORCA")
	print("*******************")

def le_palavras():
	arquivo = open("CursoAlura/palavras.txt","r", encoding="utf-8")
	palavras = [linha.strip().upper() for linha in arquivo]
	arquivo.close()	
	return palavras

def sorteia_palavra(palavras):
	return palavras[random.randrange(0, len(palavras) - 1)]

def inicializa_palavra(palavra):
	return ["_" for letra in palavra]			# inicialização da lista de checagem com "_" utilizando list comprehensions

def imprime_resultado(acertou, palavra_secreta):
	if(acertou):
		imprime_mensagem_vencedor()
	else:
		imprime_mensagem_perdedor(palavra_secreta)


def desenha_forca(erros):
    print("  _______     ")
    print(" |/      |    ")

    if(erros == 1):
        print(" |      (_)   ")
        print(" |            ")
        print(" |            ")
        print(" |            ")

    if(erros == 2):
        print(" |      (_)   ")
        print(" |      \     ")
        print(" |            ")
        print(" |            ")

    if(erros == 3):
        print(" |      (_)   ")
        print(" |      \|    ")
        print(" |            ")
        print(" |            ")

    if(erros == 4):
        print(" |      (_)   ")
        print(" |      \|/   ")
        print(" |            ")
        print(" |            ")

    if(erros == 5):
        print(" |      (_)   ")
        print(" |      \|/   ")
        print(" |       |    ")
        print(" |            ")

    if(erros == 6):
        print(" |      (_)   ")
        print(" |      \|/   ")
        print(" |       |    ")
        print(" |      /     ")

    if (erros == 7):
        print(" |      (_)   ")
        print(" |      \|/   ")
        print(" |       |    ")
        print(" |      / \   ")

    print(" |            ")
    print("_|___         ")
    print()

def imprime_mensagem_vencedor():
    print("Parabéns, você ganhou!")
    print("       ___________      ")
    print("      '._==_==_=_.'     ")
    print("      .-\\:      /-.    ")
    print("     | (|:.     |) |    ")
    print("      '-|:.     |-'     ")
    print("        \\::.    /      ")
    print("         '::. .'        ")
    print("           ) (          ")
    print("         _.' '._        ")
    print("        '-------'       ")

def imprime_mensagem_perdedor(palavra_secreta):
    print("Puxa, você foi enforcado!")
    print("A palavra era {}".format(palavra_secreta))
    print("    _______________         ")
    print("   /               \       ")
    print("  /                 \      ")
    print("//                   \/\  ")
    print("\|   XXXX     XXXX   | /   ")
    print(" |   XXXX     XXXX   |/     ")
    print(" |   XXX       XXX   |      ")
    print(" |                   |      ")
    print(" \__      XXX      __/     ")
    print("   |\     XXX     /|       ")
    print("   | |           | |        ")
    print("   | I I I I I I I |        ")
    print("   |  I I I I I I  |        ")
    print("   \_             _/       ")
    print("     \_         _/         ")
    print("       \_______/           ")


if(__name__ == "__main__"):
	jogar()