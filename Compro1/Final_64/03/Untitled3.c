#include <stdio.h>
int A[1000][1000];
void main(){
    int n;
    scanf("%d", &n);
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            A[i][j] = -1;
        }
    }

    for(int i=0; i<n; i++){
        A[i][0] = i+1; //left
        A[i][i] = i+1; //middle
        A[i][n-1] = i+1; //right
    }

    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if (A[i][j] == -1){
                printf(" ");
            }else {
                printf("%d", A[i][j]%10);
            }
        }
        printf("\n");
    }

}
