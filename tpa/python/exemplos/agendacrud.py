def create(dat, hor, descr):
  basecsv = open("base.csv","a")
  basecsv.write(dat+";"+hor+";"+descr+"\n")
  basecsv.close()
  return "Compromisso adicionado com sucesso"
menu = 0
while(menu != 5):
  print("AGENDA - CRUD")
  print("1.Create.:")
  print("2.Read...:")
  print("3.Update.:")
  print("4.Delete.:")
  print("5.Sair...:")
  menu = int(input("Digite sua op��o:"))
  if menu == 1:
    data = input("Data do compromisso: ")
    hora = input("Hora do compromisso: ")
    descricao = input("Descri��o do compromisso: ")
    print(create(data, hora, descricao))
  elif menu== 2:
    print ("Read em desenvolvimento")
  elif menu == 3:
    print ("Update em desenvolvimento")
  elif menu == 4:
    print ("Delete em desenvolvimento")
  else:
    print ("Op��o Inv�lida")
print("Obrigado por utilizar nosso sistema")