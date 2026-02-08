#include<stdio.h>
#include<stdlib.h>

int f=-1, r=-1,i,size=10;
int q[10];

void enqueue(int n,int s)
{
    if(r>=s)
    {
        printf("Queue full\n");
        return;
    }
    q[++r] = n;
    printf("Number inserted\n");
}
void dequeue()
{
    if(f==-1)
        f=0;
        
    if(f>r)
    {
        printf("Queue empty!\n");
        return;
    }
    int num=q[f];
    f++;
    
    printf("Number deleted = %d\n",num);
}

void disp(int q[])
{
    printf("Current queue:\n");
    for(i=f;i<=r;i++)
        printf("%d ",q[i]);
}

int main()
{
    int num, ch;
    do
    {
        printf("\nQueue operations!!\n");
        printf("1: Enqueue\n");
        printf("2: Dequeue\n");
        printf("3: Display current queue\n");
        printf("4: Exit\n");
        printf("\nEnter your choice:");
        scanf("%d",&ch);
        switch(ch)
        {
        case 1:
            printf("Enter no. to insert:");
            scanf("%d",&num);
            enqueue(num,size);
            break;
        case 2:
            dequeue();
            break;
        case 3:
            disp(q);
            break;
        case 4:
            printf("Thank you!!");
            exit(0);
        default:
            printf("Invalid choice!");
        }
    } while (ch!=0);
    
    
    return 0;
}