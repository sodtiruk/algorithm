#include <stdio.h>

void main(){
    int n;
    scanf("%d", &n);
    int max = -2000000000;
    int max2 = -2000000000;
    int sum = 0;
    int sum2 = 0;
    int row;
    int col;

    int A[n][n];
    for(int r=0; r<n; r++){
        for(int c=0; c<n; c++){
            scanf("%d", &A[r][c]);
        }
    }

    for(int r=0; r<n; r++){
        for(int c=0; c<n; c++){
            sum += A[r][c];
            sum2 += A[c][r];
        }
        if(sum > max){
            max = sum;
            row = r+1;
        }

        if(sum2 > max){
            max2 = sum2;
            col = r+1;
        }

        sum = 0;
        sum2 = 0;
    }

    if (max >= max2){
        printf("max %d row %d", max, row);
    }else {
        printf("max %d col %d", max2, col);
    }




}

