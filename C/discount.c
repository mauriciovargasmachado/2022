#include <cs50.h>
#include <stdio.h>



int main (void)
{
    float regular = get_float_number("The regular price is: ");
    float sale = discount(regular);
    printf("The sale price is :%.2f \n ",sale);

}

float discount ( float price)
{
    return price *0.75;
}