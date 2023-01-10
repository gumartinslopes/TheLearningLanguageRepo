class Cliente:
    def __init__(self, nome):
        self.__nome = nome

    @property
    def nome(self):
        print("Chamando a property nome")
        return self.__nome.capitalize()

    @nome.setter
    def nome(self, nome):
        print("Chamando o setter para nome")
        self.__nome = nome