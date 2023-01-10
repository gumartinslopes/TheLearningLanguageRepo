# versão 01 do código da aplicação
class Filme:
	def __init__(self, nome, ano, duracao):
		self.__nome = nome
		self.__ano = ano
		self.__duracao = duracao
		self.__likes = 0  									# O número de likes inicia com 0
	
	def adiciona_like(self):
		self.__likes += 1

	@property 
	def nome(self):
		return self.__nome.title()
	
	@property 
	def ano(self):
		return self.__ano
	
	@property 
	def duracao(self):
		return self.__duracao
	
	@property 
	def likes(self):
		return self.__likes

class Serie:
	def __init__(self, nome, ano, temporadas):
		self.__nome = nome
		self.__ano = ano
		self.__temporadas = temporadas
	
	def adiciona_like(self):
		self.__likes += 1

	@property 
	def nome(self):
		return self.__nome.title()
	
	@property 
	def ano(self):
		return self.__ano
	
	@property 
	def duracao(self):
		return self.__temporadas
	
	@property 
	def likes(self):
		return self.__likes

vingadores = Filme("vingadores - guerra infinita", 2018, 160)
atlanta = Serie("atlanta", 2018, 2)

print(vingadores.nome)
print(atlanta.nome)

