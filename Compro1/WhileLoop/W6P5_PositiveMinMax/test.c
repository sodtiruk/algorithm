#include <stdio.h>
#include <limits.h>

void main(){
    int N;
    int min = INT_MAX;
    int max = INT_MIN;
    int i = 1;
    while (i <= 8){
        scanf("%d", &N);
        if (N > 0 && N >= max){
            max = N;
        }
        if (N > 0 && N <= min){
            min = N;
        }
        i++;
    }
    printf("%d\n", max);
    printf("%d\n", min);
}
