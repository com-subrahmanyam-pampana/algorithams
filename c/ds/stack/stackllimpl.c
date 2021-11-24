#include <stdio.h>

struct Node

{
 int data;
 struct Node *next;

};

struct Node *head;


void main(){

}


void push(int  val){

    int val;
    struct Node *cNode=(struct Node*)malloc(sizeof(struct Node));

    if(cNode==NULL){
     cNode->data=val;
     cNode->next=NULL;
     head=cNode;

    }else{
        cNode->data=val;
     cNode->next=head;
     head=cNode;

    }

}