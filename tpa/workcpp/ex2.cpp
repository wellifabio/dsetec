#include <iostream>

/* Exerc�cio2 */

int main(int argc, char** argv) {
	
	//Entrada de dados
	float salarioHora, horas;
	printf("Digite o sal�rio por hora:");
	scanf("%f",&salarioHora);
	printf("Digite quantas horas:");
	scanf("%f",&horas);
	
	//Processamento
	float salarioBase = salarioHora * horas;
	float inss = salarioBase * 8 / 100;
	float irrf = salarioBase * 11 / 100;
	float sindicato = salarioBase * 5 / 100;
	float salarioLiquido = salarioBase - inss - irrf - sindicato;
	
	//Sa�da
	printf("Sal�rio Bruto : R$ %.2f \n",salarioBase);
	printf("IRRF : R$ %.2f \n",irrf);
	printf("INSS : R$ %.2f \n",inss);
	printf("Sindicato : R$ %.2f \n",sindicato);
	printf("Sal�rio L�quido : R$ %.2f \n",salarioLiquido);

	return 0;

}
