#include <stdio.h>

int A[500][500];
void main(){
    int n;
    scanf("%d", &n);

    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            A[i][j] = -9;
        }
    }

    int count = 0;

    //Upper
    for(int i=0; i<n; i++){
        A[0][i] = count%10;
        count++;
    }

    //Body
    for(int i=1; i<=n; i++){
        for(int j=n-1; j>=1; j--){
            if(i+j == n-1){
                A[i][j] = count%10;
                count++;
            }
        }
    }

    //Lower
    for(int i=0; i<n; i++){
        A[n-1][i] = count%10;
        count++;
    }

    //print result

    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if (A[i][j] == -9){
                printf("  ");
            }else {
                printf("%d ", A[i][j]);
            }
        }
        printf("\n");
    }
}






