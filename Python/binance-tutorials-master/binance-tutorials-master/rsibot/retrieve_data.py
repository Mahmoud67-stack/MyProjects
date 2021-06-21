from binance.client import Client

timestamp = Client()._get_earliest_valid_timestamp(interval='1m', symbol='BTCUSDT')
print(timestamp)