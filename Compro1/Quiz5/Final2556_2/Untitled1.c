#include <stdio.h>

void main(){
    int K;
    scanf("%d", &K);
    int A[K][K];

    for(int r=0; r<K; ++r){
        for(int c=0; c<K; ++c){
            scanf("%d", &A[r][c]);
        }
    }

    int cen = K/2;
    printf("%d\n", A[cen][cen]);

    int pre_sum = A[cen][cen];

    for(int round=1; round<=K/2; round++){
        int sum=0;
        int startt = cen-round;
        int stopp = cen+round;
        for(int r=startt; r<=stopp; r++){
            for(int c=startt; c<=stopp; c++){
                sum += A[r][c];
            }
        }
        printf("%d\n", sum-pre_sum);
        pre_sum = sum;
    }
}
