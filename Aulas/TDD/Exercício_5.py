import pandas as pd

class Conta():

   SALDO = int(10)
   DATAS = []
   QUANTIAS = []
   SALDOS = []

   def depositar(quantia):
      if type(quantia) == int:
         data = f'23/08/2022'
         operação = f'+R${quantia:_.2f}'.replace('.',',').replace('_','.')

         if quantia == 0:
            return 'Nenhum valor está sendo depositado'
         elif quantia < 0:
            return 'Não é possível depositar um valor negativo'
         else:
            Conta.SALDO += quantia

            Conta.DATAS.append(data)
            Conta.QUANTIAS.append(operação)
            Conta.SALDOS.append(f'R${Conta.SALDO:_.2f}'.replace('.',',').replace('_','.'))

            Conta.EXTRATO = list(zip(Conta.DATAS, Conta.QUANTIAS, Conta.SALDOS))

            return f'R${Conta.SALDO:_.2f} foi depositado ao saldo'.replace('.',',').replace('_','.')
      else:
         return 'Entrada inválida'


   def sacar(quantia):
      if type(quantia) == int:
         data = f'23/08/2022'
         operação = f'-R${quantia:_.2f}'.replace('.',',').replace('_','.') 
         
         if quantia > Conta.SALDO or Conta.SALDO == 0:
            return 'Não há saldo suficiente para saque'
         elif quantia < 0:
            return 'Não é possível sacar um valor negativo'
         else:
            Conta.SALDO -= quantia

            Conta.DATAS.append(data)
            Conta.QUANTIAS.append(operação)
            Conta.SALDOS.append(f'R${Conta.SALDO:_.2f}'.replace('.',',').replace('_','.'))

            Conta.EXTRATO = list(zip(Conta.DATAS, Conta.QUANTIAS, Conta.SALDOS))

            return f'R${quantia:_.2f} foi retirado do saldo'.replace('.',',').replace('_','.')
      else:
         return 'Entrada Inválida'


   def imprimir():
      extrato = pd.DataFrame(Conta.EXTRATO, columns=['DATA', 'QUANTIA', 'SALDO'])
      print(extrato)
      return extrato

Conta.depositar('nkjsnkcj')
Conta.sacar(int(5))
Conta.depositar(int(100))
Conta.depositar(int(100))
Conta.sacar(int(50))
Conta.imprimir()

