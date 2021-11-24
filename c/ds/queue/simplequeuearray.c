#include <stdio.h>
#include <stdlib.h>

#define maxsize 5

int front = -1;
int real = -1;
int queue[maxsize];

void main()
{
}

void insert(int item)
{

    if (real == maxsize - 1)
    {
        return;
    }

    if (front == -1 && real == -1)
    {
        front = 0;
        real = 0;
    }
    else
    {
        real = real + 1;
    }
    queue[real]=item;

}
void delete ()
{
}
void display()
{
}