import trms as logic

def transform_to_dolars(trm:float):
    
    pesos = float(input("Please type the amount of pesos to exchange: "))
    dolars = logic.cop_to_usd(pesos,trm)
    
    print(f"{pesos}, are:  round{dolars,2} dolars.")

def transform_to_pesos(trm:float):
    
    dolars = float(input("Please type the amount of dolars to exchange: "))
    pesos = logic.usd_to_pesos(dolars,trm)
    
    print(f"{dolars}, are:  round{pesos,2} Pesos.")

def start_program():
    trm = float(input("Please type here the actual TRM:"))
    transform_to_dolars(trm)
    transform_to_pesos(trm)

start_program()