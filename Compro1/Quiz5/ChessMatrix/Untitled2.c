#include <stdio.h>

void main(){
    int m,n;
    scanf("%d%d", &m,&n);
    int A[m][n];

    for(int r=0; r<m; r++){
        for(int c=0; c<n; c++){
            scanf("%d", &A[r][c]);
        }
    }

    int x;
    scanf("%d", &x);
    for(int r=0; r<m; r++){
        for(int c=0; c<n; c++){
            if ((r+c)%2 == 1){
                A[r][c] += x;
            }
        }
    }

    for(int r=0; r<m; r++){
        for(int c=0; c<n; c++){
            printf("%d ", A[r][c]);
        }
        printf("\n");
    }
}
