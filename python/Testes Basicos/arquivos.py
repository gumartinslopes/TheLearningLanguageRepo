arquivo = open("frutinhas.txt", "w")
arquivo.write("bananinha\n")
arquivo.write("maçãzinha\n")
arquivo.close()

arquivo = open("frutinhas.txt", "a")
arquivo.write("moranguinho\n")
arquivo.close()

arquivo = open("frutinhas.txt", "r")

frutinhas = [fruta for fruta in arquivo]            # Armazenando as frutas na list utilizando comprehension
print("Temos as seguintes frutinhas", frutinhas)
arquivo.close()