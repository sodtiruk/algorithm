#include <stdio.h>

void main(){
    int x,y;
    scanf("%d%d", &x, &y);
    int A[x][y];
    for(int r=0; r<x; r++){
        for(int c=0; c<y; c++){
            A[r][c] = 0;
        }
    }

    int n;
    scanf("%d", &n);
    for(int i=0; i<n; i++){
        int e1,e2;
        scanf("%d%d", &e1, &e2);
        A[e1-1][e2-1] = i+1;
    }

    for(int r=0; r<x; r++){
        for(int c=0; c<y; c++){
            printf("%d ", A[r][c]);
        }
        printf("\n");
    }



}
