#include <iostream>
/* Exerc�cio3 */
int main(int argc, char** argv) {

	float area;
	printf("Digite a �rea em m2:");
	scanf("%f",&area);
	int preferencia;
	printf("Prefer�cia 1-Gal�es ou 2-Latas:");
	scanf("%d",&preferencia);
	
	if (preferencia == 1){
		float areaGalao = 3.6 * 6;
		if (area < areaGalao){
			printf("Um gal�o de R$ 25.00 \n");
	  	} else {
	  		int totalGaloes = (int) area / areaGalao + 1;
	    	printf("Ser� necess�rio %d gal�o \n",totalGaloes);
	    	float custo = totalGaloes * 25;
	    	printf("O custo ser� de R$ %.2f \n",custo);
	  	}
	} else {
	  	float areaLata = 18 * 6;
	  	if (area < areaLata){
			printf("Uma Lata de R$ 80.00");
	 	} else {
	    	int totalLatas = (int) area / areaLata + 1;
	    	printf("Ser� necess�rio %d latas \n", totalLatas);
	    	float custo = totalLatas * 80;
	    	printf("O custo ser� de R$ %.2f \n",custo);
		}	
	}    
    return 0;
}
