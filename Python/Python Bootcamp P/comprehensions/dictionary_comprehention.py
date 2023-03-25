import random
'''
dict = {}

for i in range(1,20):
    dict[i]=i*i

print (dict)

dict_2={i:i*i for i in range(1,20)}

print(dict_2)

'''

countries = ["col","mex","arg","pan","usa"]
population = {}

for country in countries:
    population[country]=random.randint(20000000,300000000)

print(population)

population_1 ={country:random.randint(20000000,300000000) for country in countries
}

print (population_1)