#include <stdio.h>
#include <math.h>
//  *
// ***
//  *

void main(){
    int n;
    scanf("%d", &n);
    int mid = n/2;
    for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++){
            if(abs(mid-i)+abs(mid-j) <= mid){
                printf("*");
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }
}

