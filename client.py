import socket
import sys


import socket

host = "192.168.1.3"
port = 7777

soc = socket.socket(socket.AF_INET, socket.SOCK_STREAM)  
soc.connect((host, port))

clients_input = input("What you want to write client?\n")  
soc.send(clients_input.encode("utf8")) # we must encode the string to bytes  
result_bytes = soc.recv(4096) # the number means how the response can be in bytes  
result_string = result_bytes.decode("utf8") # the return will be in bytes, so decode

print("Result from server is {}".format(result_string))  