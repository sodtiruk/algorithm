#include <stdio.h>

void main(){
    int x;
    scanf("%d", &x);
    int i = 1 , mindiff = 2000000000, miny;
    while (i <= 8){
        int y;
        scanf("%d", &y);
        int diff = y-x;
        if (diff < 0){
            diff = 0 - diff;
        }
        if (diff < mindiff){
            mindiff = diff;
            miny = y;
        }

        //printf("y = %d diff = %d mindiff = %d miny = %d\n", y, diff, mindiff, miny);
        i++;
    }
    printf("%d", miny);
}

