
# Considere el software que se ejecuta en una máquina expendedora. Una de las tareas que debe realizar es determinar cuánto cambio debe entregarle al cliente luego de que paga. Escriba una función que recibe la cantidad de dinero (en pesos) a dar como cambio al cliente y retorne un mensaje con la cantidad de monedas de cada denominación que deben ser entregadas, teniendo en cuenta que el cambio se debe otorgar con la menor cantidad de monedas posible.

# La máquina cuenta con monedas de 500, 200, 100 y 50 pesos, y el cambio total se entregará con monedas de estas denominaciones. El mensaje retornado DEBE seguir el siguiente formato: “A,B,C,D” (sin espacios intermedios) donde A, B, C y D son la cantidad de monedas de 500, 200, 100 y 50, respectivamente.


# Su solución debe tener una función de acuerdo con la siguiente especificación:

# Nombre de la función: calcular_cambio



def calcular_cambio(dinero:int):

    billetes500 = dinero // 500
    billetes200 = (dinero % 500) // 200
    billetes100 = ((dinero % 500) % 200) // 100
    monedas50 = (((dinero % 500) % 200) % 100)// 50
    
    return (f"{billetes500},{billetes200},{billetes100},{monedas50}")
    

