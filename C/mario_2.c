#include <stdio.h>
#include <cs50.h>

int main(void)
{
    int n;

    do
    {
       n = get_number("Size: ");
    } 
    while (n<1);

    // for each row
    
    for (int i =0; i<n; i++)
    {
        // for each column
        for (int i =0; i<n; i++)
        {
            // print a brick
            printf("#");
        }
    }
    printf("\n");
    
}