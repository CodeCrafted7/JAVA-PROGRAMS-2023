#include<stdio.h>
#include<time.h>
int main()
{
    clock_t start1,end1;
    int i,n,x,flag=0;
    printf("Enter the size of the Array : ");
    scanf("%d",&n);
    int a[n];
    for(i=0; i<n; i++)
    {
        a[i] = rand()%(n*10)+1;
        printf("%d ",a[i]);
    }
    printf("\nEnter the Number to be searched : ");
    scanf("%d",&x);
    start1 = clock();
    for(i=0; i<n; i++)
    {
        if(a[i]==x)
        {
            printf("Position of Searched number is %d",i+1);
            break;
        }
        flag++;
    }
    if(flag==n)
        printf("Searched Number is not Found ");
    end1 = clock();
    double time = ((double)(end1-start1))/CLOCKS_PER_SEC;
    printf("\n%lf\n",time*100000.0);
    return 0;
}
