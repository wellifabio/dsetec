#include <iostream>

/* Exerc�cio1 */

int main(int argc, char** argv) {
	float peso;
	printf("Digite o Peso:");
	scanf("%f",&peso);
	if(peso > 50){
		float excesso = peso - 50;
		float multa = excesso * 4;
		printf("O peso � %f \n",peso);
		printf("O excesso � %f \n",excesso);
		printf("O multa � %f \n",multa);
	}
	return 0;
}
