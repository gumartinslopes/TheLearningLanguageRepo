list = [123, "James", True] # Podemos criar listas mistas mas isso não é muito bom
numbers  = [78,900,1,4,5]
names = ["Jhon", "Jack", "Jill"]

print(list)                 # O python printa tudo como uma lista só sem precisarmos iterar sobre
print(numbers[0])           # Naturalmente podemos printar apenas um elemento pelo índice
print("Jhon" in names)      # Podemos checar se um valor está na lista

print(min(numbers))
print(max(numbers))

print("Numbers antes da ordenação", numbers)
numbers.sort()
print("Numbers depois da ordenação", numbers)
print(f"Temos {len(names)} nomes na lista")

inteiros = [1,3,4,5,7,8,9]
pares = []
pares2 = []
for numero in inteiros:                                     # populando a lista com loop
    if numero % 2 == 0:
        pares.append(numero)
pares2 = [numero for numero in inteiros if numero % 2 == 0] # populando a lista com list comprehension
 
print(pares)
print(pares2)