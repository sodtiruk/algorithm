#include <stdio.h>

int A[500][500];
void main(){
    int n;
    scanf("%d", &n);
    int count = 0;

    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            scanf("%d", &A[i][j]);
        }
    }

    for(int i=1; i<n-1; i+=3){
        for(int j=1; j<n-1; j+=2){
            if (A[i][j] < A[i-1][j-1] &&
                A[i][j] < A[i][j-1] &&
                A[i][j] < A[i-1][j] &&
                A[i][j+1] < A[i-1][j+1] &&
                A[i][j+1] < A[i-1][j+2] &&
                A[i][j+1] < A[i][j+2] &&
                A[i+1][j] < A[i+1][j-1] &&
                A[i+1][j] < A[i+2][j-1] &&
                A[i+1][j] < A[i+2][j] &&
                A[i+1][j+1] < A[i+1][j+2] &&
                A[i+1][j+1] < A[i+2][j+2] &&
                A[i+1][j+1] < A[i+2][j+1]
                ){
                    count++;
                }
        }
    }
    printf("%d", count);
}
