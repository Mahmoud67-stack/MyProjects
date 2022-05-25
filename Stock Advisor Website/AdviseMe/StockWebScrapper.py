from urllib.request import urlopen, Request
from bs4 import BeautifulSoup
from vaderSentiment.vaderSentiment import SentimentIntensityAnalyzer
import pandas as pd
import random


from googlesearch import search
from yahoo_finance import *


def name_convert(self):

    searchval = 'yahoo finance '+self
    link = []
    #limits to the first link
    for url in search(searchval, num_results= 100, lang='enA'):
        link.append(url)

    link = str(link[0])
    link=link.split("/")
    if link[-1]=='':
        ticker=link[-2]
    else:
        x=link[-1].split('=')
        ticker=x[-1]

    return(ticker)


#Comment out when testing
company_name=input("Enter a ticker or company name: ")
company=name_convert(company_name)
print(company)

#Define our url where we are reading the news headlines from and tickers of the stocks we are interested in
url = 'https://finviz.com/quote.ashx?t='

tickers = []
tickers.append(company)

news_tables = {}                 #take all the news from the html table and add it to this dic to parse


for ticker in tickers:
    parsed_url = url + ticker  # getting the url we are going to parse
    request = Request(url=parsed_url, headers={'user-agent': 'my-app'})  # header to be granted access
    response = urlopen(request)

    html = BeautifulSoup(response, 'html')  # use BeautifulSoup to get the source code by parsing the html code

    news_table = html.find(id='news-table')
    news_tables[ticker] = news_table          #take the table object and store it in the dictionary and parse each table indivually (alt)



news_data = []

for ticker, news_table in news_tables.items():

    for row in news_table.findAll('tr'):
        headlines = row.a.text
        news_data.append(headlines)


print(news_data)

vader = SentimentIntensityAnalyzer()


def sentiment_analysis(headline):
    score = vader.polarity_scores(headline)
    print(score)


df = pd.DataFrame(news_data, columns=['Headlines'])


scores_list = []

df['compound'] = df['Headlines'].apply(lambda headlines: vader.polarity_scores(headlines)['compound'])


choice_list = ['Buy', 'Sell']
average = sum(df['compound']) / len(df['compound'])

if average > 0:
    print("Buy")

elif average < 0:
    print('Sell')

elif average == 0:
    print('Neutral News, Do not Buy/Sell Yet')


