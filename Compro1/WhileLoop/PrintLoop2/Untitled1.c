#include <stdio.h>

void main(){
    int i = 1;
    int N;
    scanf("%d", &N);
    if (N <= 0){
        printf("Invalid input");
    }else {
        while (i <= N){
            printf("%d\n", i);
            i++;
        }
    }
}
