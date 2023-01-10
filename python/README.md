# Notas de Estudos de Python 🐍
Python é uma linguagem *interpretada*(o que é discutível), portável e com "baterias inclusas". No 
python utilizaremos o padrão de escrita snake_type, ou seja, utilizaremos a separação de termos com 
o underscore(_), por exemplo, nomearemos uma função faz_algo, não iremos utilizar a notação fazAlgo nem fazalgo.
## O que eu já aprendi até agora?
 - [x] Sintaxe básica e a filosofia de funcionamento do python.
 - [x] Tópicos comuns à maioria das linguagens de programação (arquivo, io, estruturas de dados).
 - [x] Estruturas de dados built in (lists, tuples).
 - [ ] Orientação a objetos.
### Notas importantes
Para executar um arquivo python na linha de comando basta digitar:
``` python arquivo.py ```

Apesar de ser uma linguagem interpretada essa definição é um pouco nebulosa pois há a presença de
um compilador de bytecode. Bytecode é um código intermediário, normalmente independente do sistema operacional.

Eis uma descrição sobre diretamente da documentação:
"Python é uma linguagem interpretada, em oposição às compiladas, embora a distinção possa ficar 
desfocada devido à presença do compilador de bytecode."

Eis uma discussão no *stack overflow* sobre:
https://stackoverflow.com/questions/6889747/is-python-interpreted-or-compiled-or-both

#### Orientação a objetos
Nomes de classes utilizão a notação de camel case, por exemplo, podemos ter uma classe chamada NovaClasse e não
nova_classe ou novaclasse.

Construtores em python são criados utilizando um método chamado ``__init__``.

Atributos privados devem ser representados utilizando o __, apesar do python não utilizar a palavra private em si.