
def get_population(data):
    
    population_dict=dict{
        '2022': country_dict['2022 Population'],
        '2020': country_dict['2020 Population'],
        '2015': country_dict['2015 Population'],
        '2010': country_dict['2010 Population'],
        '2000': country_dict['2000 Population'],
        '1990': country_dict['1990 Population'],
        '1980': country_dict['1980 Population'],
        '1970': country_dict['1970 Population'],
    }

    labels = population_dict.keys()
    values = population_dict.values() 

    return labels,values