#include <stdio.h>

void main(){
    int x;
    scanf("%d", &x);
    if (x <= 0){
        printf("%d", x/-1);
    }else {
        printf("%d", x);
    }
}
