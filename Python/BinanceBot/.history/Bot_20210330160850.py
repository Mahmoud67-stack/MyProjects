import ccxt 

exchange = ccxt.binance({
    'apiKey': 'YOUR_API_KEY',
    'secret': 'YOUR_SECRET',
    'enableRateLimit': True,
})

symbol = 'BTC/ETH'  
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