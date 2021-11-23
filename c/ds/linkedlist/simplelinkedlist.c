#include <stdio.h>
#include <stdlib.h>


 struct Node{
   int  data;
   struct Node *ad;
 };

 struct Node *head,*tail= NULL;

 void addNode(int data){

    struct Node *newNode=(struct Node*) malloc(sizeof(struct Node)) ;
    newNode->data=data;
    newNode->ad=NULL;
    if(head==NULL){
       head=newNode;
       tail=newNode;
    }else{
       tail->ad=newNode;
       tail=newNode;
    }
 }

 void dispaly(){
    struct Node *tempNode=head;
    if(head==NULL){
       printf("Node is null");
    }

    while (tempNode!=NULL)
    {
      printf("%d",tempNode->data);
      tempNode=tempNode->ad;
    }
    
 }
int main() {
   addNode(1);
   addNode(2);
   addNode(3);
   addNode(4);
   dispaly();
   return 0;
}
