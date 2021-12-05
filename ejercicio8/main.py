cadena = ""
bandera = True

while (bandera):
    metro = int(input("Ingrese el metro a calcular: "))
    pies = metro * 3.28084
    yardas = metro * 1.09361
    pulgadas = metro * 39.370
    cadena = "%s     %s     %s     %s     %s\n" % (cadena, metro, yardas, pulgadas, pies)
    palabra = input("Ingrese si para salir: ")
    if (palabra == "si"):
        bandera = False

print("Metros     Yardas     Pulgadas     Pies")
print(cadena)