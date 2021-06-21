import requests,bs4


openList = []
DateList = []
closeList = []
volumeList = []

r =  requests.get('https://coinmarketcap.com/currencies/hoge-finance/historical-data/')

soup = bs4.BeautifulSoup(r.text, 'lmxl')

