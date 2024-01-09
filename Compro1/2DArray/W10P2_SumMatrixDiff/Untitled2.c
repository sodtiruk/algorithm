#include <stdio.h>
#include <math.h>

void main(){
    int N;
    scanf("%d", &N);
    int A[N][N];

    for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
            scanf("%d", &A[i][j]);
        }
    }
    int sum = 0;
    for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
            if (i<j){
                sum += abs(A[i][j]-A[j][i]);
            }
        }
    }
    printf("%d", sum);
}
