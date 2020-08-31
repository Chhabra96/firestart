#include<stdio.h>

char *myname(void)
{
    char me[] = "priya Chhabra";

    return (me);
}

int main()
{
    printf("My name is %s\n",myname());

    return (0);
}
