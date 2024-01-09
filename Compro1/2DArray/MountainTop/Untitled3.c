#include <stdio.h>

int A[1000][1000];
int B[1000][3];

void main(){
    int n;
    scanf("%d", &n);
    for(int r=0; r<n; r++){
        for(int c=0; c<n; c++){
            scanf("%d", &A[r][c]);
        }
    }
    // n = 3
    // 3 5 1
    // 4 8 9
    // 9 8 2
    int count = 0;
    for(int r=1; r<n-1; r++){
        for(int c=1; c<n-1; c++){
            if (A[r][c] > A[r-1][c-1] &&
                A[r][c] > A[r-1][c] &&
                A[r][c] > A[r-1][c+1] &&
                A[r][c] > A[r][c-1] &&
                A[r][c] > A[r][c+1] &&
                A[r][c] > A[r+1][c-1] &&
                A[r][c] > A[r+1][c] &&
                A[r][c] > A[r+1][c+1]
                ){
                    B[count][0] = A[r][c];
                    B[count][1] = r;
                    B[count][2] = c;
                    count++;
                }
        }
    }
    printf("%d\n", count);
    for(int i=0; i<count; i++){
        printf("%d %d %d\n", B[i][0],B[i][1],B[i][2]);
    }

}
