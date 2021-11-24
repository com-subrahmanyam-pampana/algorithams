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


    if (front == -1 && real == -1)
    {
        front = 0;
        real = 0;
        queue[real]=item;
    }
    else if((real+1)%maxsize==front)
    {
        //Full
    }else{
        real=(real+1)%maxsize; //Real is incremented

          queue[real]=item;

    }
  

}
void delete ()
{
}
void display()
{
}