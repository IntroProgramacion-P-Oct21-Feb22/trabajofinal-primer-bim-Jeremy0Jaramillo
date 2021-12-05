bandera = True
cadena = ""
contador = 0

while (bandera):
    numero = int(input("Ingrese un número para la serie (8 números): "))
    contador = contador + 1
    if (contador % 2 == 0):
        signo = "+"
    else:
        signo = "-"
    if (contador == 8):
        signo = ""
    cadena = "%s  %s  %s" % (cadena, numero, signo)
    if (contador == 8):
        bandera = False

print("S1 =" + cadena)
