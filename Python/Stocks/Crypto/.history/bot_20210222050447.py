import websocket, json, numpy, talib, config, pprint
from binance.enums import *
from binance.client import Client

RSI_PERIOD = 14
OVERSOLD_THRESHOLD = 30
OVERBOUGHT_THRESHOLD = 70
TRADE_QUANTITY = 10
TRADE_SYMBOL = 'COTIUSDT'
SOCKET = "wss://stream.binance.com:9443/ws/cotiusdt@line_1m"
