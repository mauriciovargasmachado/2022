
def calcular_IMC(peso,altura):

    imc = peso/(altura**2)

    if imc <16:
        return f"su indice de masa corporal es demasiado bajo {imc}, usted esta en delgadez severa."
    elif imc <16.99:
        return f"su indice de masa corporal es muy bajo {imc}, usted esta en delagadez moderada."
    elif imc <18.49:
        return f"su indice de masa corporal es bajo {imc}, usted esta en delagadez aceptable."
    elif imc <24.99:
        return f"su indice de masa corporal es normal {imc}, usted esta en un peso normal."
    elif imc <29.99:
        return f"su indice de masa corporal es alto {imc}, usted esta en sobrepeso."
    elif imc <34.99:
        return f"su indice de masa corporal es muy alto {imc}, usted esta en obesidad tipo I."
    elif imc <39.99:
        return f"su indice de masa corporal es muy muy alto {imc}, usted esta en obecidad tipo II."
    elif imc <49.99:
        return f"su indice de masa corporal es demasiado alto {imc}, usted esta en obecidad tipo III o morbida."
    elif imc >50:
        return f"su indice de masa corporal es en extremo alto {imc}, usted esta en obecidad tipo IV o extrema."
    

def calcular_porcentaje_grasa(peso,altura,edad,genero):

    imc = peso/(altura**2)

    if genero != "hombre":

        valor_genero = 10.8

    else:

        valor_genero = 0
    
    PGC = 1.2 * imc + 0.3 * edad-5.4-valor_genero

    return PGC

        
    