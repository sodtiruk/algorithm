#include <stdio.h>

int C[500][1000];
int B[500][1000];

void main(){
    int N;
    scanf("%d", &N);
    int M[N];
    double cost = 0.00;

    for(int i=0; i<N; i++){
        scanf("%d", &M[i]);
        for(int j=0; j<M[i]; j++){
            scanf("%d %d", &C[i][j], &B[i][j]);
        }
    }

    for(int k=0; k<N; k++){
        for(int i=0; i<M[k]; i++){
            if (B[k][i] == 1){
                for(int j=0; j<C[k][i]; j++){
                    printf("-");
                    cost += 8.50;
                }
            }
            if(B[k][i] == 0){
                for(int j=0; j<C[k][i]; j++){
                    printf("#");
                    cost += 9.75;
                }
            }
        }
        printf("\n");
    }
    printf("%.2f", cost);


}


