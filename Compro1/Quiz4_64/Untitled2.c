#include <stdio.h>

void main(){
    int n;
    scanf("%d", &n);
    int A[n];
    for(int i=0; i<n; i++){
        scanf("%d", &A[i]);
    }

    int number;
    scanf("%d", &number);
    for(int i=0; i<number; i++){
        int x, y ,z;
        scanf("%d", &x);
        if(x <= 0){
            x = 1;
        }
        scanf("%d", &y);
        if(y > n){
            y = n;
        }
        scanf("%d", &z);

        for(int i=x-1; i<=y-1; i+=z){
            printf("%d ", A[i]);
        }
        printf("\n");
    }

}
