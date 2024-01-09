#include <stdio.h>

void main(){
    int K,N,cap_per_day,order;
    int acc_order = 0;

    scanf("%d %d", &K, &N);
    cap_per_day = K * 100;

    for (int i = 1; i <= N ; i++){
        scanf("%d", &order);
        acc_order = acc_order + order;
        int finish_day = (acc_order + cap_per_day-1)/cap_per_day;
        printf("%d\n", finish_day);

    }

}
