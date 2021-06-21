import websocket

SOCKET= "wss://stream.binance.com:9443/ws/cotiusdt@kline_1m"

def on_open(ws):
    print("Opened connection")


def on_close(ws):
    print("Closed connection")


def on_message(ws, message):
    print("received message")
    
ws = websocket.WebSocketApp(SOCKET, on_open =on_open, on_close = on_close, on_message = on_message)
ws.run_forever()