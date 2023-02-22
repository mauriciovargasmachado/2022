
class Question:
    def __init__(self,new_t,new_a):
        self.text = new_t
        self.answer = new_a

new_q = Question("hola","522")

print(new_q.text)