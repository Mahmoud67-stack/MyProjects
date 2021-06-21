import websocket, json, pprint

SOCKET= "wss://stream.binance.com:9443/ws/rvnusdt@kline_1m"

def on_open(ws):
    print("Opened connection")


def on_close(ws):
    print("Closed connection")


def on_message(ws, message):
    print("received message")
    print("Amazing")
    json_message = json.loads(message)
    pprint.pprint(json_message)
    
    candle = json_message['k']
    pprint.pprint(candle)
    is_candle_closed = candle['x']
    close = candle['c']
    
    if is_candle_closed:
        print("Candle closed at: {}".format(close))
    
    print("and the change is : "(((close - candle['o'])/ candle['o'])*100))


ws = websocket.WebSocketApp(SOCKET, on_open =on_open, on_close = on_close, on_message = on_message)
ws.run_forever()