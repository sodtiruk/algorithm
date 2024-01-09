#include <stdio.h>

void main(){
    int max = -1;
    int n;
    int A[1000];

    scanf("%d", &n);
    for (int i=0; i<n; i++){ //loop get value in array
        scanf("%d", &A[i]);
        if (max <= A[i]){ // find value max
            max = A[i];
        }
    }
    //printf("max = %d", max);
    int maxx = max;
    //print bar graph
    for (int row=0; row<max; row++){
        for (int m=0; m<n; m++){
            if (A[m]>=maxx){
                printf("*");
            }else if (A[m]<maxx) {
                printf(" ");
            }
        }
        maxx--;
        printf("\n");
    }
}
