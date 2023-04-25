from datetime import date

def calcular_edad(fecha_nacimiento):
    fecha_hoy = date.today()
    años = fecha_hoy.year-fecha_nacimiento.year
    mes = fecha_hoy.month-fecha_nacimiento.month
    dias = fecha_hoy.day-fecha_nacimiento.day

    return(f"Usted tiene {años} años,{mes} meses, y {dias} dias")

fecha_nacimiento=date(int(input("Por favor ingrese su año de nacimiento: ")),int(input("Por favor ingrese su mes de nacimiento: ")),int(input("Por favor ingrese su dia de nacimiento: ")))

print(calcular_edad(fecha_nacimiento))
