#Abrir o arquivo
entrada = open("entrada.txt","r")
#Definir um contador e um acumulador
contador = 0
somaIdade = 0
#La�o para percorrer o arquivo
for linha in entrada:
  contador = contador + 1 #Incrementar
  col = linha.split(); #Divide a linha em vetor
  somaIdade = somaIdade + int(col[1]) #Acumula a Idade
entrada.close() #Fechar o arquivo
media = somaIdade / contador #Calcula a m�dia
saida = open("saida.txt","w") #Abrir arquivo Sa�da
saida.write("A m�dia de idade dos "+str(contador)+" alunos � "+str(media)); #Grava a frase de sa�da
saida.close()