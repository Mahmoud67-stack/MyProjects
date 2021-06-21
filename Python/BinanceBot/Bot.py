import ccxt 

exchange = ccxt.binance({
    'apiKey': 'ukUJDK3Wm2jEIRfrzi9o2COGaWZCQjKky3y31erEexQyWufPMqggrBCfgmrwL9eY',
    'secret': 'mLF5zQJuSicF4biFsU6xuzuGkbfBYMrOBQGEgdQSH3K8k7c8JIdxXVgXwKhfkc6a',
    'enableRateLimit': True,
})

symbol = 'BTC/USDT'  
type = 'limit'  # or 'market'
side = 'sell'  # or 'buy'
amount = 1.0
price = 0.060154  # or None

# extra params and overrides if needed
params = {
    'test': True,  # test if it's valid, but don't actually place it
}

order = exchange.create_order(symbol, type, side, amount, price, params)

print(order)