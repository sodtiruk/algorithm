#include <stdio.h>

void main(){
    int x;
    int count = 0;
    scanf("%d", &x);
    while(1){
        int y;
        scanf("%d", &y);

        if (y == 0){
            break;
        }
        if (y == x){
            count++;
        }
    }
    if (count == 0){
        printf("None");
    }else {
        printf("%d", count);
    }

}
