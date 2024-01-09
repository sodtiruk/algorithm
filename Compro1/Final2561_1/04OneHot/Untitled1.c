#include <stdio.h>

void main(){
    int max = 0;
    int n;
    scanf("%d", &n);
    int A[n];
    for(int i=0; i<n; i++){
        scanf("%d", &A[i]);
        if (A[i] > max){ //find array maximum
            max = A[i];
        }
    }
    max += 1; // plus maximum number = 1
    int A2D[n][max];
    for(int r=0; r<n; r++){
        for(int c=0; c<max; c++){
            A2D[r][c] = 0;
        }
    }

    for(int i=0; i<n; i++){ // bring number 1 put in Array2D
        A2D[i][A[i]] = 1;
    }

    for(int r=0; r<n; r++){ //Output Array2D
        for(int c=0; c<max; c++){
            printf("%d ", A2D[r][c]);
        }
        printf("\n");
    }
}
