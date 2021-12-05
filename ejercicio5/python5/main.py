numero1 = input("Ingrese la coordenada en X (especifique valor positivo con +): ")
numero2 = input("Ingrese la coordenada en Y (especifique valor positivo con +): ")
coordenada = "(%s;%s)" % (numero1, numero2)

if (numero1[0] == "+") & (numero2[0] == "+"):
    print("Las coordenadas", coordenada, "pertenecen al 1° cuadrante")
else:
    if (numero1[0] == "-") & (numero2[0] == "+"):
        print("Las coordenadas", coordenada, "pertenecen al 2° cuadrante")
    else:
        if (numero1[0] == "-") & (numero2[0] == "-"):
            print("Las coordenadas", coordenada, "pertenecen al 3° cuadrante")
        else:
            if (numero1[0] == "+") & (numero2[0] == "-"):
                print("Las coordenadas", coordenada, "pertenecen al 4° cuadrante")