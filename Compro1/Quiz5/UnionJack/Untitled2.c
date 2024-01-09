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
        A[i][0] = '*';
        A[i][n-1] = '*';
        A[0][i] = '*';
        A[n-1][i] = '*';

        A[i][n/2] = '*';
        A[i][n/2-1] = '*';
        A[i][n/2-2] = '*';
        A[i][n/2+1] = '*';
        A[i][n/2+2] = '*';

        A[n/2][i] = '*';
        A[n/2-1][i] = '*';
        A[n/2-2][i] = '*';
        A[n/2+1][i] = '*';
        A[n/2+2][i] = '*';

        A[i][i] = '*';
        A[i][i+1] = '*';
        A[i][i-1] = '*';

        //My think
        A[i][n-i] = '*';
        A[i][n-i-2] = '*';
        A[i][n-i-1] = '*';

        /* Teacher think
        A[i][n-1-i-1] = '*';
        A[i][n-1-i] = '*';
        A[i][n-1-i+1] = '*'; */

    }

    for(int r=0; r<n; r++){
        for(int c=0; c<n; c++){
            printf("%c", A[r][c]);
        }
        printf("\n");
    }


}
