#include<stdio.h>
#include<stdlib.h>
#include<time.h>

#define ITEMS 10

int main()
{
    int x,r[ITEMS];

    srand((unsigned)time(NULL));

    for(x=0;x<ITEMS;x++)
        r[x]=rand()%10+1;

}


