#include <stdio.h>

void main(){
    int A[1000];
    int B[1000];
    int scoreA = 0;
    int scoreB = 0;
    int N;
    scanf("%d", &N);

    for (int i=0; i<N; i++){
        scanf("%d", &A[i]);
    }
    for (int j=0; j<N; j++){
        scanf("%d", &B[j]);
    }

    for (int k=0; k<N; k++){
        if(A[k] > B[k]){
            scoreA += 2;
        }else if (B[k] > A[k]){
            scoreB += 2;
        }else {
            scoreA++;
            scoreB++;
        }
    }
    if (scoreA > scoreB){
        printf("Team 1 wins\n");
        printf("Score %d to %d", scoreA, scoreB);
    }else if (scoreB > scoreA){
        printf("Team 2 wins\n");
        printf("Score %d to %d", scoreB, scoreA);
    }else {
        printf("Draw game");
        printf("Score %d to %d", scoreA, scoreB);
    }
}
