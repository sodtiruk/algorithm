#include <stdio.h>

void main(){
    int x,y;
    int max = -2000000000;
    scanf("%d%d", &x, &y);
    int A[x][y];

    for(int r=0; r<x; r++){
        for(int c=0; c<y; c++){
            scanf("%d", &A[r][c]);
        }
    }

    int sum = 0;
    int row;
    for(int r=0; r<x; r++){
        for(int c=0; c<y; c++){
            sum += A[r][c];
        }
        if(sum > max){
            max = sum;
            row = r;
        }
        sum = 0;
    }

    int count = 0;
    for(int r=0; r<x; r++){
        int flag = 0;
        for(int c=0; c<y; c++){
            if (A[c][r] > A[row][r]){
                flag = 1;
            }
        }
        if (flag == 0){
            count++;
        }
    }

    printf("%d\n", max);
    printf("%d\n", count);
}
