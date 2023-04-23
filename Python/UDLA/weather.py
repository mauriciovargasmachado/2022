 

def conversion(farenheight:float):
    celsius = (farenheight-32)*(5/9)

    return celsius

def conversion_f(celsius:float):
    farenheight = (celsius*(5/9))+32

    return farenheight

def radian_to_degres(radians:float):
    pi =3.14159
    return (360*radians)/(2*pi)

def inversion(number:int):
    unidades = number %10
    number //=10
    decenas = number %10
    number //=10
    centenas = number %10
    number //=10
    miles = number %10
    number //=10

    return f"{unidades}{decenas}{centenas}{miles}"

print(conversion(70))
print(conversion_f(32))
print(radian_to_degres(90))
print(inversion(1234))