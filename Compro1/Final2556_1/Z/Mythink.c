#include <stdio.h>

void main(){
    int n;
    scanf("%d", &n);

    for(int i=0; i<n; i++){
        printf("%d ", i%10);
    }
    printf("\n");

    int space = 2*(n-3)+2;
    int count = n;
    for(int r=0; r<n-2; r++){
        for(int c=0; c<space; c++){
            printf(" ");
        }
        printf("%d", count%10);
        space -= 2;
        count++;
        printf("\n");
    }

    for(int i=0; i<n; i++){
        printf("%d ", count%10);
        count++;
    }
}
