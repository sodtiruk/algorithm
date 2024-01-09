#include <stdio.h>

void main(){
    int n;
    scanf("%d", &n);
    for (int r=1; r<=n; r++){
        for (int c=1; c<=n; c++){
            if (c%3 == r%3){
                printf("*");
            }else {
                printf(" ");
            }
        }
        printf("\n");
    }
}
