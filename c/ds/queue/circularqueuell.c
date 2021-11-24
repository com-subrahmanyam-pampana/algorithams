#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node *nextNode;
};

struct Node *front;

struct Node *rear;



void main()
{
}

void insert(int item)
{
     struct Node *nodeItem;

nodeItem=(struct Node*) malloc(sizeof(struct Node));

    if (nodeItem==NULL)
    {
        return;
    }else{
        nodeItem->data=item;
    }

    if (front = NULL)
    {
        front = nodeItem;
        rear = nodeItem;
        front-> nextNode=NULL;
        rear -> nextNode=NULL;
    }
    else
    {
        rear -> nextNode=nodeItem;
        rear = nodeItem; 
        rear -> nextNode=NULL;
    }
   

}
void delete ()
{
}
void display()
{
}