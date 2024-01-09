#include <stdio.h>

void main(){
    float x,y,z;
    scanf("%f%f%f", &x,&y,&z);
    if (z != 0){
        printf("%f", (x+y)/z);
    }else {
        printf("cannot divide by zero");
    }
}
