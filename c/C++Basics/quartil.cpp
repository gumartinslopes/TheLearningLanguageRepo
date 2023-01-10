#include <iostream>
#include <fstream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

vector<int> le_arquivo(){
	ifstream arquivo;
	arquivo.open("valores.txt");
	if(arquivo.is_open()){
        vector<int> valores;
        while(!arquivo.eof()){
            int valor_lido;
            arquivo >> valor_lido;
            valores.push_back(valor_lido);
        }
        arquivo.close();
        return valores;
    }
    else{
        std::cout << "Não foi possível acessar o banco de palavras." << std::endl;
        exit(0);
    }
}

void mostra_vetor(vector<int> v){
	for(int i = 0; i < v.size(); i++)
		cout << "-> " << v.at(i) << endl;
}

// Alterar
double calcula_valor_quartil(vector<int> v, double lqk){
	double valor_quartil = 0; 
	if(round(lqk) == lqk)
		valor_quartil = v.at(lqk - 1);
	return valor_quartil;
}

double calcula_localizacao(int tam, int k){
	double tamf = tam + 1;
	return k * (tamf) / 4; 
}

void calcula_quartil(vector<int> v){
	double lq1 = calcula_localizacao(v.size(), 1);
	double lq2 = calcula_localizacao(v.size(), 2);
	double lq3 = calcula_localizacao(v.size(), 3);
	double q1 = calcula_valor_quartil(v, lq1);
	double q2 = calcula_valor_quartil(v, lq2);
	double q3 = calcula_valor_quartil(v, lq3);
	double iql = q3 - q1;
	double limite_inf = q1 - 1.5 * iql;
	double limite_sup = q3 + 1.5 * iql;

	cout << "Posto do primeiro quartil: " << lq1 << endl;
	cout << "Posto do segundo quartil: " << lq2 << endl;
	cout << "Posto do terceiro quartil: " << lq3 << endl;
	cout << "Valor do quartil no posto 1: " << q1 << endl;
	cout << "Valor do quartil no posto 2: " << q2 << endl;
	cout << "Valor do quartil no posto 3: " << q3 << endl;
	cout << "Distancia interquartilica: " << iql << endl;
	cout << "Limite inferior: " << limite_inf << endl;
	cout << "Limite superior: " << limite_sup << endl;
}


int main(void){
	vector<int> valores = le_arquivo();
	sort(valores.begin(), valores.end());
	calcula_quartil(valores);
	return 0;	

}