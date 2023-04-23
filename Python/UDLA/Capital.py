capital = float(input("Por favor ingrese el capital inicial: "))

tasa = float(input("Por favor ingrese la tasa de interes anual: "))

tiempo = float(input("Por favor ingrese el tiempo en años: "))

valor_futuro = capital *(1+(tasa/100))**tiempo

print(f"El valor futuro del monto inicial es de {valor_futuro}, despues de {tiempo} años, con una tasa de {tasa}.")