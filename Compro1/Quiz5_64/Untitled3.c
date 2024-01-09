#include <stdio.h>

void main(){
    int n;
    scanf("%d", &n);
    int A[n][n];

    for(int r=0; r<n; r++){
        for(int c=0; c<n; c++){
            scanf("%d", &A[r][c]);
        }
    }

    int x;
    scanf("%d", &x);

    if(x == 1){
        for(int r=0; r<n; r++){
            if(r%2 == 0){
                for(int c=0; c<n; c++){
                    printf("%d ", A[r][c]);
                }
            }else {
                for(int c=n-1; c>=0; c--){
                    printf("%d ", A[r][c]);
                }
            }
            printf("\n");
        }
    }else if(x == 2){
        for(int r=n-1; r>=0; r--){
            if(r%2 == 0){
                for(int c=n-1; c>=0; c--){
                    printf("%d ", A[r][c]);
                }
            }else {
                for(int c=0; c<n; c++){
                    printf("%d ", A[r][c]);
                }
            }
            printf("\n");
        }
    }
}
