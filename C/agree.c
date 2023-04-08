#include <cs50.h>
#include <stdio.h>

int main (void)
{
    char x = get_answer("Do you agree?: ");

    if (x == "y")
    {
        printf("You have agreed!!!");
    }

    else if (x == "n")
    {
        printf("You have not agreed!!!");
    }

    else if (x != "y" || x != "n")
    {
        printf("Invalid answer");
    }



}