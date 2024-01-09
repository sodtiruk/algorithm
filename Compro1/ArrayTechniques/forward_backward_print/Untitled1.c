#include <stdio.h>

void main(){
    int n;
    scanf("%d", &n);
    int A[n];
    for(int i=0; i<n; i++){
        scanf("%d", &A[i]);
    }
    int m;
    scanf("%d", &m);

    if(m > 0){
        for(int i=0; i<n; i++){
            printf("%d ", A[i]+m);
        }
    }else if(m < 0){
        for(int i=n-1; i>=0; i--){
            printf("%d ", A[i]+m);
        }
    }
}
