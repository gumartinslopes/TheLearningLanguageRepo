
print("Hello World") # hello world em python

class Pessoa:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade
    def apresentar(self):
        print("Olá meu nome é " + self.nome + " e tenho " + self.idade + " anos");

pessoa_1 = Pessoa("Gustavo", "20")
pessoa_1.apresentar()

# syntax sugar
print(10*"20")