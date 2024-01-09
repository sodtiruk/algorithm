#include <stdio.h>

void main(){
    int x;
    int count = 0;
    while (1 < 2){
        scanf("%d", &x);
        if (x == 0){
            break;
        }
        count++;
    }
    printf("%d", count);
}
