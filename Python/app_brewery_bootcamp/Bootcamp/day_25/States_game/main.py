import turtle
import pandas

screen = turtle.Screen()
screen.title("U.S. States Game")
image = "blank_states_img.gif"
screen.addshape(image)
turtle.shape(image)

data = pandas.read_csv("50_states.csv")
all_states = data.state.to_list

answer_state = screen.textinput(title = "Guess the State", prompt="Name another state name!")

if answer_state in all_states:
    my_turtle = turtle.Turtle()
    my_turtle.hideturtle()
    my_turtle.penup()
    state_data =data[data.state == answer_state]
    my_turtle.goto(int(state_data.x), int(state_data.y))
    my_turtle.write(state_data.state)

turtle.mainloop()

