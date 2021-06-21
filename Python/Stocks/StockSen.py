from urllib.request import urlopen, Request
from bs4 import BeautifulSoup

#Define our url where we are reading the news headlines from and tickers of the stocks we are interested in
url = 'https://coinmarketcap.com/currencies/hoge-finance/historical-data/?start=20210101&end=20210329'
tickers = ['AMZN']      #later change this to S&P 500 or in our case cryptos
news_table = {}                 #take all the news from the html table and add it to this dic to parse

for ticker in tickers:
    parsed_url = url # getting the url we are going to parse
    request = Request(url=parsed_url, headers={'user-agent': 'my-app'})  # header to be granted access
    response = urlopen(request)

    html = BeautifulSoup(response, 'html')  # use BeautifulSoup to get the source code by parsing the html code

    news_table = html.find(id='cmc-table')
    # news_table[ticker] = news_table          #take the table object and store it in the dictionary and parse each table indivually (alt)
    break

#print(response)
print(html)
#print(news_table)