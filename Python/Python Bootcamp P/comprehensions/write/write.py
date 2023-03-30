with open('./text.txt', 'w+') as file:
  for line in file:
    print(line)
  file.write('This file will know contain new lines\n')
  file.write('like this\n')
  file.write('and like this other one\n')