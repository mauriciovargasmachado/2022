
numero = int(input("Ingrese un numero de 10 cifras: "))

conteo = {}

digito = numero % 10

if digito in conteo:
    conteo[digito] +=1
else:
    conteo[digito] = 1

if digito in conteo:
    conteo[digito] +=1
else:
    conteo[digito] = 1

if digito in conteo:
    conteo[digito] +=1
else:
    conteo[digito] = 1

if digito in conteo:
    conteo[digito] +=1
else:
    conteo[digito] = 1

if digito in conteo:
    conteo[digito] +=1
else:
    conteo[digito] = 1

if digito in conteo:
    conteo[digito] +=1
else:
    conteo[digito] = 1

if digito in conteo:
    conteo[digito] +=1
else:
    conteo[digito] = 1

if digito in conteo:
    conteo[digito] +=1
else:
    conteo[digito] = 1

if digito in conteo:
    conteo[digito] +=1
else:
    conteo[digito] = 1

if digito in conteo:
    conteo[digito] +=1
else:
    conteo[digito] = 1

numero = numero / 10

print(conteo)