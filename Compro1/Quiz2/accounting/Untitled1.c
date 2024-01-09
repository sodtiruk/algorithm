#include <stdio.h>

void main(){
    int countx = 0;
    int county = 0;
    int sumx = 0;
    int sumy = 0;
    while (1){
        int x;
        scanf("%d", &x);
        if (x == 0){
            break;
        }
        int y;
        scanf("%d", &y);
        if (x == 1){
            countx++;
            sumx += y;
        }
        if (x == 2){
            county++;
            sumy += y;
        }
    }
    printf("%d %d\n", countx, county);
    printf("%d %d %d", sumx, sumy, sumx-sumy);
}

