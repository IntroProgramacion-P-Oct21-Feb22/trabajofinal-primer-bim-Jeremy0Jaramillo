precio = float(input("Ingrese el precio del traje: "))
cantidad = int(input("Ingrese el número de trajes a comprar: "))
descuento = 0
subtotal = precio * cantidad
total = 0

if (cantidad == 1):
    porcentaje = 20
    descuento = (subtotal * porcentaje)/100
    total = subtotal - descuento
else:
    if(cantidad ==2):
        porcentaje = 25
        descuento = (subtotal * porcentaje) / 100
        total = subtotal - descuento
    else:
        if(cantidad == 3):
            porcentaje = 40
            descuento = (subtotal * porcentaje) / 100
            total = subtotal - descuento
        else:
            if(cantidad > 3):
                porcentaje = 50
                descuento = (subtotal * porcentaje) / 100
                total = subtotal - descuento

print("Subtotal: $", subtotal, "\nDescuento: $", descuento, "\nTotal: $", total)