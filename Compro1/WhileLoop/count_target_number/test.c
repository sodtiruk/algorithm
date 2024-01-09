#include <stdio.h>

void main(){
    int x;
    int count = 0;
    int Sonjai;
    scanf("%d", &Sonjai);
    while (1 < 2){
        scanf("%d", &x);
        if (x == 0){
            break;
        }
        if (x == Sonjai){
            count++;
        }
    }
    if (count == 0){
        printf("None");
    }else {
        printf("%d", count);
    }

}
