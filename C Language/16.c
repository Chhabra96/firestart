#include<stdio.h>
#include<string.h>

int main()
{
    struct person{
     char name[32];
     int iq;

    };


    struct person me;

    strcpy(me.name,"Priya Chhabra");
    me.iq = 567;

    printf("%s has an IQ of %d\n",me.name,me.iq);
}
