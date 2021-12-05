bandera = True
contador = 0
acumulador = 0
cadena = ""
numeros = ""
media = 0
varianza = 0
numerador = 0

while (bandera):
    numero = int(input("Ingrese un número: "))
    numeros = "%s %s," % (numeros, numero)
    contador = contador + 1
    acumulador = acumulador + numero
    media = acumulador / contador
    numerador = numerador + (numero - media)
    varianza = numerador / contador
    salir = input("Si desea salir, ingrese si: ")
    if salir == "si":
        bandera = False

cadena = "%sLos números%s tienen media de %s y una varianza de %d\n" % (cadena, numeros, media, varianza)
print(cadena)