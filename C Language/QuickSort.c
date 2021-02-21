//Quick Sort in c

#include<stdio.h>

//Function to swap postiton of elements
void swap(int *a,int *b)
{
    int t = *a;
    *a = *b;
    *b = t;
}

//Function to partition the array on the basis of the Pivot element
int partition(int arr[],int low,int high)
{
    //Select Pivot element
    int pivot = arr[high];
    int i = (low - 1 );
    
    //Put the elements smaller than pivot on the left and vice versa
    for(int j = low; j < high; j++)
    {
        if(arr[j] <=  pivot)
        {
            i++;
            swap(&arr[i],&arr[j]);
        }
    }
    
    swap(&arr[i+1],&arr[high]);
    return(i +1);
}

void Quicksort(int arr[],int low, int high)
{
    if(low < high)
    {
        int pi = partition(arr,low,high);
        
        Quicksort(arr,low,pi-1);
        
        Quicksort(arr,pi+1,high);
    }
}

void printarr(int arr[],int size)
{
    for(int i = 0; i< size;++i)
    {
        printf("%d\n",arr[i]);
    }
    printf("\n");
}

int main()
{
    int data[] ={9,81,72,38,56,96,50};
    int n= sizeof(data)/sizeof(data[0]);
    
    Quicksort(data,0,n-1);
    printarr(data,n);
}
