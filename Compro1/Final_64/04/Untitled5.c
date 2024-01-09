#include <stdio.h>

void main(){
    int n;
    scanf("%d", &n);
    int A[n][n];
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            scanf("%d", &A[i][j]);
        }
    }

    int x;
    scanf("%d", &x);
    if (x == 1){
        for(int j=0; j<n; j++){
            if (j%2 == 0){
                for(int i=0; i<n; i++){
                    printf("%d ", A[i][j]);
                }
            }else {
                for(int i=n-1; i>=0; i--){
                    printf("%d ", A[i][j]);
                }
            }
            printf("\n");
        }
    }else if (x == 2){
        for(int j=n-1; j>=0; j--){
            if (j%2 == 0){
                for(int i=n-1; i>=0; i--){
                    printf("%d ", A[i][j]);
                }
            }else {
                for(int i=0; i<n; i++){
                    printf("%d ", A[i][j]);
                }
            }
            printf("\n");
        }
    }


}
