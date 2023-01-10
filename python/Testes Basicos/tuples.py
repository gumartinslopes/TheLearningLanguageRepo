t = (1,2,3,4)
t2 = [1,2,3,4]
# t[1] = 999        # Isso aqui gera erro pois tuplas são imutáveis
t2[1] = 999

print(t)
print(t[1])
print(t2)
