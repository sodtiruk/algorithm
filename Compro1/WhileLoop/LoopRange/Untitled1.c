#include <stdio.h>

void main(){
    int x,y;
    scanf("%d %d", &x, &y);
    if (x <= y){
        while (x <= y){
            printf("%d ", x);
            x++;
        }
    } else {
        printf("Invalid input");
    }
}
