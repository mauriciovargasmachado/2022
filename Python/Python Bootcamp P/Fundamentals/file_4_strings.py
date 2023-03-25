name = 'Mauricio'
last_name = 'Vargas'
print (f'{name} {last_name}')

#formats

template = 'hello my name is: '+name+'and my last name is '+last_name
print(template)

template = 'hello my name is: {} and my last name is {}'.format(name,last_name)
print(template)

template = (f'hello my name is: {name} and my last name is {last_name}')