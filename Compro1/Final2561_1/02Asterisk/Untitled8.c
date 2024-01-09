#include <stdio.h>

void main(){
    int n;
    scanf("%d", &n);
    char A[n][n];

    for(int r=0; r<n; r++){
        for(int c=0; c<n; c++){
            A[r][c] = ' ';
        }
    }

    for(int i=0; i<n; i++){
        A[i][n/2] = '*';
        A[n/2][i] = '*';
        A[i][i] = '*';
        A[i][n-i-1] = '*';
    }

    for(int r=0; r<n; r++){
        for(int c=0; c<n; c++){
            printf("%c", A[r][c]);
        }
        printf("\n");
    }

}
