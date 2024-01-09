#include <stdio.h>

void main(){
    int M,N;
    scanf("%d %d", &M,&N);
    char A[M][N];
    for(int r=0; r<M; r++){
        for(int c=0; c<N; c++){
            A[r][c] = '_';
        }
    }
    int K;
    scanf("%d", &K);
    int R,C;
    for(int i=0; i<K; i++){
        scanf("%d %d", &R, &C);
        A[R-1][C-1] = 'x';
    }

    for(int r=0; r<M; r++){
        for(int c=0; c<N; c++){
            printf("%c", A[r][c]);
        }
        printf("\n");
    }
}
