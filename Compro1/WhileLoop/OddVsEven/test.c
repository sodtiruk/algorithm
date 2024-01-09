#include <stdio.h>

void main(){
    int N;
    int i = 1;
    int sum_even = 0;
    int sum_odd = 0;
    while (i <= 8){
        scanf("%d", &N);
        if (N % 2 == 0){
            sum_even += N;
        } else {
            sum_odd += N;
        }
        i++;
    }
    if (sum_odd == sum_even){
        printf("equal\n");
    }else if (sum_odd > sum_even){
        printf("odd\n");
    }else {
        printf("even\n");
    }
    printf("%d\n%d", sum_even, sum_odd);
}
