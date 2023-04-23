    # Una agencia de viajes necesita informar a sus clientes la hora de llegada de sus vuelos. Se conoce la hora de partida del vuelo (en horas, minutos y segundos) y la duración del vuelo (en horas, minutos y segundos).

    # Cree una función que retorne la hora de llegada del vuelo en una cadena con el formato “HH:mm:ss” donde HH es la hora, mm los minutos y ss los segundos de la hora de llegada del vuelo. 

    # La hora está dada en formato de 24 horas. Si alguno de los 3 números de la respuesta es menor a 10, sólo se necesita un dígito ('7' en lugar de '07').


    # Su solución debe tener una función de acuerdo con la siguiente especificación:

    # Nombre de la función: calcular_horario_llegada

def calcular_horario_llegada(hora_salida,minutos_salida,segundos_salida,hora_duracion,minutos_duracion,segundos_duracion):

    hora_llegada = hora_salida + hora_duracion
    minutos_llegada = minutos_salida + minutos_duracion
    segundos_llegada = segundos_salida + segundos_duracion

    if segundos_llegada >= 60:
        segundos_llegada = segundos_llegada - 60
        minutos_llegada+=1
        

    if minutos_llegada >= 60:
        minutos_llegada = minutos_llegada - 60
        hora_llegada +=1
        

    if hora_llegada >= 24:
        hora_llegada = hora_llegada - 24      


    tiempo_llegada = f"{hora_llegada}:{minutos_llegada}:{segundos_llegada}"

    print (tiempo_llegada)
    return tiempo_llegada

    

calcular_horario_llegada(7,3,58,0,24,33)