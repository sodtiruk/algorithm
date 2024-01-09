#include <stdio.h>
#include <limits.h>

void main(){
    int count = 0;
    int consec = 0;
    int maxConsec = INT_MIN;
    int N,x;
    scanf("%d", &x);
    while (1){
        scanf("%d", &N);
        if (N == 0){
            break;
        }
        if (N == x){
            count++;
            consec++;
        }else {
            consec = 0;
        }
        if (consec > maxConsec){
            maxConsec = consec;
        }

    }
    printf("%d\n", maxConsec);
    printf("%d", count);
}
