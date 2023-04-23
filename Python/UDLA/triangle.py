# El área de un triángulo puede ser calculada cuando se conoce la longitud de sus lados. Teniendo en cuenta que s1, s2 y s3 son las longitudes de los lados del triángulo, se puede calcular el subperímetro s = (s1+s2+s3)/2, y, con este valor, se puede calcular el área del triángulo de la siguiente manera: area = √( s * (s-s1) * (s-s2) * (s-s3) ). 

# Cree una función que recibe la medida de los lados del triángulo y retorna el área de este, redondeada a una cifra decimal. 

# El módulo math puede serle de ayuda para calcular la raíz cuadrada.


# Su solución debe tener una función de acuerdo con la siguiente especificación:

# Nombre de la función: area_triangulo

# Si lo requiere, puede agregar funciones adicionales. 


import math

def area_triangulo(x:float,y:float,z:float):
    s = (x+y+z)/2
    area = math.sqrt(s*(s-x)*(s-y)*(s-z))

    return round(area,1)