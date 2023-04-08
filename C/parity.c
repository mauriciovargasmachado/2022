#include <cs50.h>
#include <stdio.h>

int main (void)
{
    int x = get_number("Check your number: ");

    if (x %2 == 0)
        {
            printf("Your number is even!");
        }

    else
    {
        printf("Your number is odd!");
    }

}