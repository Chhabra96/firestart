#include<stdio.h>

char *myname(void)
{
   //By adding static before char me function will return name instead of NULL
    char me[] = "priya Chhabra";

    return (me);
}

int main()
{
    printf("My name is %s\n",myname());

    return (0);
}
