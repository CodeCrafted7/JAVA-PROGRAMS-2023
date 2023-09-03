#include<stdio.h>
#include<time.h>
int binarysearch(int a[],int n,int el)
{
    int start=0,end=n,mid;
    while(start<=end)
    {
        mid=(start+end)/2;
        if(a[mid]>el)
            end=mid-1;
        else if(a[mid]<el)
            start=mid+1;
        else
            return mid;
    }
}
int main()
{
    clock_t start1,end1,start2,end2;
    int i,j,temp,n,x,flag=0;
    printf("Enter the size of the Array : ");
    scanf("%d",&n);
    int a[n];
    for(i=0; i<n; i++)
    {
        a[i] = rand()%(n*10)+1;
        printf("%d ",a[i]);
    }
    start1 = clock();
    for(i=0; i<n; i++)
    {
        for(j=0;j<n;j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }printf("\nSorted Array : \n");
    for(i=0; i<n; i++)
    {
        printf("%d ",a[i]);
    }

    end1 = clock();
    double time = ((double)(end1-start1))/CLOCKS_PER_SEC;
    printf("\n%lf\n",time*100000.0);

    printf("\nEnter the Number to be searched : ");
    scanf("%d",&x);
    start2=clock();
    int p =binarysearch(a,n,x);
    printf("Searched element is present at : %d",p+1);
    end2 = clock();
     double time1 = ((double)(end1-start1))/CLOCKS_PER_SEC;
    printf("\n%lf\n",time1*100000.0);
    return 0;
}

