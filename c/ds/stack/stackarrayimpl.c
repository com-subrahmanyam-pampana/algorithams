#include <stdio.h>

int stack[50] ;
int top=-1;
int n=-1;
void main(){

}


void push(int  data){

    if(top==n){
        //Overflow
    }else{
        top=top+1;
        stack[top]=data;
    }

}