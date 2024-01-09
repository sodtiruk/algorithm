#include <stdio.h>

void main(){
    int n;
    scanf("%d", &n);
    int A[n+1][n+1];
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            A[i][j] = 0;
        }
    }
    int num = n;

    //Left Section
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            if(j == 1){
                A[i][j] = num%10;
                num--;
            }
        }
    }
    num = n;
    // Middle section
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            if(i == j){
                A[i][j] = num%10;
                num++;
            }
        }
    }
    //Right Section
    for(int i=n-1; i>0; i--){
        for(int j=1; j<=n; j++){
            if(j == n){
                A[i][j] = num%10;
                num++;
            }
        }
    }

    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            if(j == 1 || j == i || j==n){
                printf("%d ", A[i][j]);
            }
            else {
                printf("  ");
            }
        }
        printf("\n");
    }


}
