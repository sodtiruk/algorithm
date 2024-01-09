#include <stdio.h>

void main(){
    int n;
    scanf("%d", &n);
    int A[n][n];
    // Read
    for(int r=0; r<n; r++){
        for(int c=0; c<n; c++){
            scanf("%d", &A[r][c]);
        }
    }

    //Solve
    int x;
    scanf("%d", &x);
    if (x == 1){
        for(int r=0; r<n; r++){
            for(int c=n/2; c<n; c++){
                printf("%d ", A[r][c]);
            }
            for(int c=0; c<n/2; c++){
                printf("%d ", A[r][c]);
            }
            printf("\n");
        }
    } else if (x == 2){
        for(int r=n/2; r<n; r++){
            for(int c=0; c<n; c++){
                printf("%d ", A[r][c]);
            }
            printf("\n");
        }
        for(int r=0; r<n/2; r++){
            for(int c=0; c<n; c++){
                printf("%d ", A[r][c]);
            }
            printf("\n");
        }
    }

}
