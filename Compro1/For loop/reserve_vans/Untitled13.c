#include <stdio.h>

void main(){
    int N;
    int A = 1, B = 1, C = 1;
    scanf("%d", &N);
    for (int i = 1; i<=N; i++){
        int vans;
        scanf("%d", &vans);
        if (A <= B && A <= C){
            printf("A\n");
            A += vans;
        }else if (B < A && B <= C){
            printf("B\n");
            B += vans;
        }else if (C < A && C <= B){
            printf("C\n");
            C += vans;
        }
    }
}

