#include <stdio.h>

void derivative(int* AInput, int* AOutput, const int N){
    for(int i=0; i<N; i++){
        if(i == 0){
            AOutput[i] = 0;
        }else {
            AOutput[i] = AInput[i] - AInput[i-1];
        }
    }
}


void main(){
    int n;
    scanf("%d", &n);
    int AInput[n];
    int AOutput[n];
    for(int i=0; i<n; i++){
        scanf("%d", &AInput[i]);
    }
    derivative(AInput, AOutput, n);
    for(int i=0; i<n; i++){
        printf("%d ", AOutput[i]);
    }
}
