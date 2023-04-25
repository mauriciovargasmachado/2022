
def mas_a(c1:str,c2:str,c3:str,c4:str):

    letra = "a"

    cadena_con_mas_a = c1

    cantidad_mas = c1.lower().count(letra)

    if c2.lower().count(letra) > cantidad_mas:
        cadena_con_mas_a =c2
        cantidad_mas = c2.lower().count(letra)
        cadena_con_mas_a =c3
        cantidad_mas = c3.lower().count(letra)
        cadena_con_mas_a =c4
        cantidad_mas = c4.lower().count(letra)

    return cadena_con_mas_a