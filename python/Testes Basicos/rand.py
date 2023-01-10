# Nota: Se o arquivo tiver o nome random.py ele não vai
# conseguir importar o módulo random e o programa não
# vai funcionar :P 
import random

valor = random.random()
print(valor)

for i in range(100):
    valor2 = random.randrange(101)
    print("Valor pseudoaleatório no intervalo [0,100]:",valor2 );

random.seed(100)
valor3 = random.randrange(1, 101)
print("Valor gerado com a semente:" , valor3)
