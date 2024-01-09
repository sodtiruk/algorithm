#include <stdio.h>

int countMax(int* arData, int N){
    int c = 0;
    int Max = -2000000;
    for(int i=0; i<N; i++){
        if (arData[i] > Max){
            Max = arData[i];
        }
    }

    for(int i=0; i<N; i++){
        if (arData[i] == Max){
            c++;
        }
    }
    return c;
}

void main(){
    int n;
    scanf("%d", &n);
    int arData[n];
    for(int i=0; i<n; i++){
        scanf("%d", &arData[i]);
    }
    int Count = countMax(arData, n);
    printf("%d", Count);
}
