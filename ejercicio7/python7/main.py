proceso = 0
par = 0

numero = int(input("Ingrese un número par: "))
if (numero < 2):
    print("El número ingresado es menor a 2")
else:
    while (par < numero):
        par = par + 2
        proceso = proceso + par

print("La suma de números pares hasta el valor que ingreso da igual a:")
print (proceso)
