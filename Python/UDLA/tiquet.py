def calcular_precio_pasaje(temporada_alta: bool, compañia:str, edad:int, estudiante:bool):

    precio = 5000000
    variaciones = 0
    seguro = False

    if compañia == "ALAS":
        if temporada_alta:
            variaciones +=0.3
        else:
            if edad >= 18:
                variaciones -= 0.1

    elif compañia == "VOLAR":
        if temporada_alta:
            variaciones += 0.2
        if edad > 60:
            seguro = True
        
    if edad < 18:
        variaciones +=0.5

    precio *= (1 + variaciones)

    if seguro:
        precio += 100000

    return round(precio,2)

# interfas del programa

temp = bool(int(input("Por favor ingrese si es temporada alta, 1 para si, 0 para no: ")))
compañia = input("Por favor ingrese el nombre de la compañia: ")
edad = int(input("Por favor ingrese la edad de la persona: "))
est = bool(int(input("Por favor ingrese 1 para estudiante, 0 para no estudiante: ")))

tarifa = calcular_precio_pasaje(temp,compañia,edad,est)

print(f"La tarifa del pasaje es de ${tarifa} cop.")
         