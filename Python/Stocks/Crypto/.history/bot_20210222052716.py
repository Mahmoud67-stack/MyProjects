import websocket, json, pprint

SOCKET= "wss://stream.binance.com:9443/ws/rvnusdt@kline_1m"

def on_open(ws):
    print("Opened connection")


def on_close(ws):
    print("Closed connection")


def on_message(ws, message):
    print("received message")
    print(message)
    json_message = json.loads(message)
    pprint.pprint(json_message)
    
    candle = message['k']
    
    is_candle_closed = candle['x']
    close = candle['c']
    
    if is_candle_closed:
        print("Candle closed at: {}".format(close))
ws = websocket.WebSocketApp(SOCKET, on_open =on_open, on_close = on_close, on_message = on_message)
ws.run_forever()