#include <stdio.h>

void main(){
    int A[10000];
    int N,K;
    int max = -2000000000;

    int sum = 0;
    int num;

    scanf("%d %d", &N,&K);

    for (int i=0; i<N; i++){
        scanf("%d", &num);
        A[i] = num;
    }
    for (int r_start=K; r_start<N-K; r_start++){
        for (int s_start=r_start-K; s_start<=r_start+K; s_start++){
            sum += A[s_start];
            if (sum>max){
                max = sum;
            }

        }
        sum=0;
    }
    printf("%d", max);
}
