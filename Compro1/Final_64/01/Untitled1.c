#include <stdio.h>


void main(){
    int a1;
    float p1;
    int b1;
    float p2;
    scanf("%d %f %d %f", &a1,&p1,&b1,&p2);
    int x;
    scanf("%d", &x);

    int ax = (x+a1-1)/a1;
    int bx = (x+b1-1)/b1;

    float a = ax*p1;
    float b = bx*p2;

    //printf("%.2f", b);

    if (a > b){
        printf("B : %.2f", b);
    }else if (a < b){
        printf("A : %.2f", a);
    }else {
        printf("equal : %.2f", a);
    }

}
