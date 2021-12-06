nombre = input("Ingrese su nombre: ")
tipo = int(input("Ingrese el tipo de empleado que es (1-4): "))
horas = int(input("Ingrese el número de horas que trabaja: "))
cuota = float(input("Ingrese la cuota por hora: "))

if (horas > 40):
    if (tipo == 1):
        cuota = cuota * 1.5
        sueldo = horas * cuota
    else:
        if (tipo == 2):
            cuota = cuota * 2
            sueldo = horas * cuota
        else:
            if(tipo == 3):
                cuota = cuota * 2.5
                sueldo = horas * cuota
            else:
                if(tipo == 4):
                    cuota = cuota * 3
                    sueldo = horas * cuota

sueldo = horas * cuota
print("Empleado:", nombre,"\nSueldo: $",sueldo)