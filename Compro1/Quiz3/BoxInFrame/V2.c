#include <stdio.h>

void main(){
    int n;
    scanf("%d", &n);

    for (int r=0; r<n; r++){
        for (int c=0; c<n; c++){
            if (r==0 || r==n-1 || c==0 || c==n-1
            || (r!=1 && r!=n-2 && c!=1 && c!=n-2)){
                printf("*");
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }
}
