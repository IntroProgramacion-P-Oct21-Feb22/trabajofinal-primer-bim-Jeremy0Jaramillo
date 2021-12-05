numero1 = int(input("Ingrese un número (hasta 3 números): "))
numero2 = int(input("Ingrese un número (hasta 3 números): "))
numero3 = int(input("Ingrese un número (hasta 3 números): "))

if (numero1 == numero2) | (numero2 == numero3) | (numero1 == numero3):
    print("ERROR. (Los números ingresados no deben ser iguales unos a otros")
else:
    if (numero1 > numero2) & (numero1 > numero3):
        print(numero1)
    else:
        if (numero2 > numero1) & (numero2 > numero3):
            print(numero2)
        else:
            if (numero3 > numero1) & (numero3 > numero2):
                print(numero3)