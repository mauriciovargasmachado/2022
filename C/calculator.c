#include <stdio.h>
#include <cs50.h>

int main(void)
{
    float x = get_x("First number: ");

    float y = get_y("Second number: ");

    float z = x/y;

    print("%.50f",z );
}