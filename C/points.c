#include <cs50.h>
#include <stdio.h>

int main(void){

    int points = get_points ("how many points did you lose?\n");

    const int NUMBER = 2;

    if (points < NUMBER)
    {
    
        printf("You lost fewer point that me.\n");
    }
    else if (points > NUMBER)
    {
    
        printf("You lost more point that me.\n");
    }
    else
    {
    
        printf("You lost same points that me.\n");
    }
}
