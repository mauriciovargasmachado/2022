import math

def vel_en_caida_libre(altura:float,v0:float):

    v0 = 0
    a = 9.8
    d = altura

    vf = math.sqrt((v0**2)+2*a*d)

    return round(vf,2)

v0 = int(input("Por favor ingrese la velocidad inicial: "))
d = int(input("Por favor ingrese altura: "))
print(f"La velocidad final de su objeto es de: {vel_en_caida_libre(d,v0)} km/h")