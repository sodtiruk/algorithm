#include <stdio.h>

void main(){
    int a,b,c;
    scanf("%d%d%d", &a,&b,&c);
    if (a <= b && a <= c){
        printf("A");
    }else if (b < a && b <= c){
        printf("B");
    }else if (c < b && c < a){
        printf("C");
    }

}
