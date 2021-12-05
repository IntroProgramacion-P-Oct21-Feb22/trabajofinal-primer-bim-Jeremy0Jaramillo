angulo1 = float(input("Ingrese el grado(primer valor): "))
angulo2 = float(input("Ingrese el grado(segundo valor): "))
angulo3 = float(input("Ingrese el grado(tercer valor): "))

if(angulo1 == 90) | (angulo2 == 90) | (angulo3 == 90):
    print("Los grados ingresados pertenecen a un Triángulo Rectángulo")
else:
    if((angulo1 > 90) & (angulo1 < 180)) | ((angulo2 > 90) & (angulo2 < 180)) | ((angulo3 > 90) & (angulo3 < 180)):
        print("Los grados ingresados pertenecen a un Triángulo Obtusángulo")
    else:
        if(angulo1 < 90) & (angulo2 < 90) & (angulo3 < 90):
            print("Los grados ingresados pertenecen a un Triángulo Acutángulo")
