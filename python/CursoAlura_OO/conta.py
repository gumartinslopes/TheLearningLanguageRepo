class Conta:
    # construtor
    def __init__(self, numero, titular, saldo, limite):
        self.__numero = numero
        self.__titular = titular
        self.__saldo = saldo
        self.__limite = limite
        print("Conta criada com sucesso")

    def extrato(self):
        print(f"Saldo do titular {self.__titular}: {self.__saldo}")
    
    # método privado
    def __tem_saldo(self, valor):
        return valor <= (self.__saldo + self.limite)

    def deposita(self, valor):
        self.__saldo += valor
    
    def saca(self,valor):
        if(self.__tem_saldo(valor)):
            self.__saldo -= valor
        else:   
            print("Saldo insuficiente para o saque!")
    
    def transfere(self, destino, valor):
        self.saca(valor)
        destino.deposita(valor)

    @staticmethod
    def codigo_banco(self):
        return "001"
    @property
    def numero(self):
        return self.__numero

    # getters
    @property 
    def titular(self):
        return self.__titular
    @property
    def saldo(self):
        return self.__saldo
    @property
    def limite(self):
        return self.__limite

    # setters
    @limite.setter
    def limite(self, limite):
        self.__limite = limite
    
    