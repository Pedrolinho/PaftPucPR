import requests
moeda = 'DOGE'
base = 'BRL'
simbolo = moeda+base
url = f'https://api.binance.com/api/v3/ticker/price?symbol={simbolo}'
requisicao = requests.get(url)
resposta = requisicao.json()
preco = resposta['price']

print(preco)